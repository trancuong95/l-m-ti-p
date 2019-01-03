/**
 * (C) Copyright 2018 TranCuong-GDP05. All Rights Reserved.
 *
 * @author TranCuong
 * @date Jan 4, 2019
 * @version 1.0
 */
package bll;

import java.util.List;

import dal.InternDAL;
import entity.Intern;

public class InternBLL implements BaseBLL<Intern>{

        InternDAL interDAL;
        
        
        public InternBLL() {
                this.interDAL = new InternDAL();
        }

        @Override
        public List<Intern> getAll() {
                return interDAL.getAll();
        }

        @Override
        public int insert(Intern object) {
                return interDAL.insert(object);
        }

}
