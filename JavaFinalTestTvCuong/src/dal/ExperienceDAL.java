/**
 * (C) Copyright 2018 TranCuong-GDP05. All Rights Reserved.
 *
 * @author TranCuong
 * @date Jan 4, 2019
 * @version 1.0
 */
package dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entity.Experience;
import utils.Constants;
import utils.DbConnection;

public class ExperienceDAL implements BaseDAL<Experience> {

        // create Connection
        Connection cnn = null;
        // create PreparedStatement
        PreparedStatement pst = null;
        // create ResultSet
        ResultSet rs = null;

        @Override
        public List<Experience> getAll() {
                List<Experience> experience = new ArrayList<Experience>();
                try {
                        cnn = DbConnection.connect();
                        // Statement creation
                        pst = cnn.prepareStatement(Constants.Experience.SELECT_ALL);
                        // for retrieve data
                        rs = pst.executeQuery();
                        while (rs.next()) {
                                Experience exp = new Experience();
                                exp.setExpInYear(rs.getInt(Constants.Experience.EXPIN_YEAR));
                                exp.setProSkill(rs.getString(Constants.Experience.PRO_SKILL));

                                experience.add(exp);
                        }
                } catch (SQLException e) {
                        e.printStackTrace();
                } finally {
                        DbConnection.close(rs, pst, cnn);
                }
                return experience;
        }

        @Override
        public int insert(Experience object) {
                try {
                        cnn = DbConnection.connect();
                        pst = cnn.prepareStatement(Constants.Experience.INSERT);
                        pst.setInt(1, object.getExpInYear());
                        pst.setString(2, object.getProSkill());
                        return pst.executeUpdate();
                } catch (Exception e) {
                        e.printStackTrace();
                        return 0;
                } finally {
                        DbConnection.close(rs, pst, cnn);
                }
        }

}
