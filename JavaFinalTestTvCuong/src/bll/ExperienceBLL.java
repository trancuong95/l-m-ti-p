/**
 * (C) Copyright 2018 TranCuong-GDP05. All Rights Reserved.
 *
 * @author TranCuong
 * @date Jan 4, 2019
 * @version 1.0
 */
package bll;

import java.util.List;

import dal.ExperienceDAL;
import entity.Experience;


public class ExperienceBLL implements BaseBLL<Experience> {

        ExperienceDAL experienceDAL;

        public ExperienceBLL() {
                this.experienceDAL = new ExperienceDAL();
        }

        @Override
        public List<Experience> getAll() {
                return experienceDAL.getAll();
        }

        @Override
        public int insert(Experience object) {
                return experienceDAL.insert(object);
        }

}
