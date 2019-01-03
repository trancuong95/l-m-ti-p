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

import entity.Fresher;
import utils.Constants;
import utils.DbConnection;

public class FresherDAL implements BaseDAL<Fresher> {

        // create Connection
        Connection cnn = null;
        // create PreparedStatement
        PreparedStatement pst = null;
        // create ResultSet
        ResultSet rs = null;

        @Override
        public List<Fresher> getAll() {
                List<Fresher> fresher = new ArrayList<Fresher>();
                try {
                        cnn = DbConnection.connect();
                        // Statement creation
                        pst = cnn.prepareStatement(Constants.Fresher.SELECT_ALL);
                        // for retrieve data
                        rs = pst.executeQuery();
                        while (rs.next()) {
                                Fresher fs = new Fresher();
                                fs.setGraduation_date(rs.getDate(Constants.Fresher.GRADUATION_DATE));
                                fs.setGraduation_rank(rs.getString(Constants.Fresher.GRADUATION_RANK));
                                fs.setEducation(rs.getString(Constants.Fresher.EDUCATION));

                                fresher.add(fs);
                        }
                } catch (SQLException e) {
                        e.printStackTrace();
                } finally {
                        DbConnection.close(rs, pst, cnn);
                }
                return fresher;
        }

        @Override
        public int insert(Fresher object) {
                try {
                        cnn = DbConnection.connect();
                        pst = cnn.prepareStatement(Constants.Fresher.INSERT);
                        pst.setDate(1, object.getGraduation_date());
                        pst.setString(2, object.getGraduation_rank());
                        pst.setString(3, object.getEducation());
                        return pst.executeUpdate();
                } catch (Exception e) {
                        e.printStackTrace();
                        return 0;
                } finally {
                        DbConnection.close(rs, pst, cnn);
                }
        }

}
