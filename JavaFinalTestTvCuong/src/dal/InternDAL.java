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

import entity.Intern;
import utils.Constants;
import utils.DbConnection;

public class InternDAL implements BaseDAL<Intern> {

        // create Connection
        Connection cnn = null;
        // create PreparedStatement
        PreparedStatement pst = null;
        // create ResultSet
        ResultSet rs = null;

        @Override
        public List<Intern> getAll() {
                List<Intern> intern = new ArrayList<Intern>();
                try {
                        cnn = DbConnection.connect();
                        // Statement creation
                        pst = cnn.prepareStatement(Constants.Intern.SELECT_ALL);
                        // for retrieve data
                        rs = pst.executeQuery();
                        while (rs.next()) {
                                Intern it = new Intern();
                                it.setMajors(rs.getString(Constants.Intern.MAJORS));
                                it.setSemester(rs.getString(Constants.Intern.SEMETER));
                                it.setUniversity_name(rs.getString(Constants.Intern.UNIVERSITY_NAME));

                                intern.add(it);
                        }
                } catch (SQLException e) {
                        e.printStackTrace();
                } finally {
                        DbConnection.close(rs, pst, cnn);
                }
                return intern;
        }

        @Override
        public int insert(Intern object) {
                try {
                        cnn = DbConnection.connect();
                        pst = cnn.prepareStatement(Constants.Intern.INSERT);
                        pst.setString(1, object.getMajors());
                        pst.setString(2, object.getSemester());
                        pst.setString(3, object.getUniversity_name());
                        return pst.executeUpdate();
                } catch (Exception e) {
                        e.printStackTrace();
                        return 0;
                } finally {
                        DbConnection.close(rs, pst, cnn);
                }
        }

}
