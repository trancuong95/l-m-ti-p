/**
 * (C) Copyright 2018 TranCuong-GDP05. All Rights Reserved.
 *
 * @author TranCuong
 * @date Jan 4, 2019
 * @version 1.0
 */
package bll;

import java.util.List;

import dal.CandidateDAL;
import entity.Candidate;

public class CandidateBLL implements BaseBLL<Candidate>{
        
        CandidateDAL candidateDAL;
        public CandidateBLL() {
                this.candidateDAL = new CandidateDAL();
        }

        @Override
        public List<Candidate> getAll() {
                return candidateDAL.getAll();
        }

        @Override
        public int insert(Candidate object) {
                return candidateDAL.insert(object);
        }
}
