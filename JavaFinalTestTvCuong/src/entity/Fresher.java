/**
 * (C) Copyright 2018 TranCuong-GDP05. All Rights Reserved.
 *
 * @author TranCuong
 * @date Jan 4, 2019
 * @version 1.0
 */
package entity;

import java.sql.Date;

public class Fresher extends Candidate{
        Date Graduation_date; //thời gian tốt nghiệp
        String Graduation_rank; //xếp loại tốt nghiệp
        String Education; //trường tốt nghiệp
        
        public Fresher() {
                super();
                // TODO Auto-generated constructor stub
        }

        /**
         * @param graduation_date
         * @param graduation_rank
         * @param education
         */
        public Fresher(Date graduation_date, String graduation_rank, String education) {
                super();
                Graduation_date = graduation_date;
                Graduation_rank = graduation_rank;
                Education = education;
        }

        public Date getGraduation_date() {
                return Graduation_date;
        }

        public void setGraduation_date(Date graduation_date) {
                Graduation_date = graduation_date;
        }

        public String getGraduation_rank() {
                return Graduation_rank;
        }

        public void setGraduation_rank(String graduation_rank) {
                Graduation_rank = graduation_rank;
        }

        public String getEducation() {
                return Education;
        }

        public void setEducation(String education) {
                Education = education;
        }

        @Override
        public String toString() {
                return "Fresher [Graduation_date=" + Graduation_date + ", Graduation_rank="
                                + Graduation_rank + ", Education=" + Education + "]";
        }
           
}
