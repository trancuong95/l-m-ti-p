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

import entity.Candidate;
import utils.Constants;
import utils.DbConnection;

public class CandidateDAL implements BaseDAL<Candidate> {

        // create Connection
        Connection cnn = null;
        // create PreparedStatement
        PreparedStatement pst = null;
        // create ResultSet
        ResultSet rs = null;

        @Override
        public List<Candidate> getAll() {
                List<Candidate> candidate = new ArrayList<Candidate>();
                try {
                        cnn = DbConnection.connect();
                        // Statement creation
                        pst = cnn.prepareStatement(Constants.Candidate.SELECT_ALL);
                        // for retrieve data
                        rs = pst.executeQuery();
                        while (rs.next()) {
                                Candidate cd = new Candidate();
                                cd.setId(rs.getInt(Constants.Candidate.ID));
                                cd.setFirstName(rs.getString(Constants.Candidate.FIRST_NAME));
                                cd.setLastName(rs.getString(Constants.Candidate.LAST_NAME));
                                cd.setBirthDate(rs.getDate(Constants.Candidate.BIRTH_DATE));
                                cd.setAddress(rs.getString(Constants.Candidate.ADDRESS));
                                cd.setPhone(rs.getString(Constants.Candidate.PHONE));
                                cd.setEmail(rs.getString(Constants.Candidate.EMAIL));
                                cd.setCandidate_type(rs.getInt(Constants.Candidate.CANDIDATE_TYPE));
                                candidate.add(cd);
                        }
                } catch (SQLException e) {
                        e.printStackTrace();
                } finally {
                        DbConnection.close(rs, pst, cnn);
                }
                return candidate;
        }

        @Override
        public int insert(Candidate object) {
                try {
                        cnn = DbConnection.connect();
                        pst = cnn.prepareStatement(Constants.Candidate.INSERT);
                        pst.setInt(1, object.getId());
                        pst.setString(2, object.getFirstName());
                        pst.setString(3, object.getLastName());
                        pst.setDate(4, object.getBirthDate());
                        pst.setString(5, object.getAddress());
                        pst.setString(6, object.getPhone());
                        pst.setString(7, object.getEmail());
                        pst.setInt(8, object.getCandidate_type());
                        return pst.executeUpdate();
                } catch (Exception e) {
                        e.printStackTrace();
                        return 0;
                } finally {
                        DbConnection.close(rs, pst, cnn);
                }
        }

}
