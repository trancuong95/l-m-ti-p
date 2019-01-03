/**
 * (C) Copyright 2018 TranCuong-GDP05. All Rights Reserved.
 *
 * @author TranCuong
 * @date Jan 4, 2019
 * @version 1.0
 */
package bll;

import java.util.List;

import dal.FresherDAL;
import entity.Fresher;

public class FresherBLL implements BaseBLL<Fresher>{

        FresherDAL fresherDAL;
        
        public FresherBLL() {
                this.fresherDAL = new FresherDAL();
        }

        @Override
        public List<Fresher> getAll() {
                return fresherDAL.getAll();
        }

        @Override
        public int insert(Fresher object) {
                return fresherDAL.insert(object);
        }
}
