/**
 * (C) Copyright 2018 TranCuong-GDP05. All Rights Reserved.
 *
 * @author TranCuong
 * @date Jan 4, 2019
 * @version 1.0
 */
package entity;

public class Experience extends Candidate{
        int ExpInYear; //số năm kinh nghiệm
        String ProSkill; //kỹ năng chuyên môn
        
        public Experience() {
                super();
                // TODO Auto-generated constructor stub
        }

        /**
         * @param expInYear
         * @param proSkill
         */
        public Experience(int expInYear, String proSkill) {
                super();
                ExpInYear = expInYear;
                ProSkill = proSkill;
        }

        public int getExpInYear() {
                return ExpInYear;
        }

        public void setExpInYear(int expInYear) {
                ExpInYear = expInYear;
        }

        public String getProSkill() {
                return ProSkill;
        }

        public void setProSkill(String proSkill) {
                ProSkill = proSkill;
        }

        @Override
        public String toString() {
                return "Experience [ExpInYear=" + ExpInYear + ", ProSkill=" + ProSkill + "]";
        }
        
        
        
}
