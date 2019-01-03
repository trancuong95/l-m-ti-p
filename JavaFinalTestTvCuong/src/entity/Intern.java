/**
 * (C) Copyright 2018 TranCuong-GDP05. All Rights Reserved.
 *
 * @author TranCuong
 * @date Jan 4, 2019
 * @version 1.0
 */
package entity;

public class Intern extends Candidate{
        String Majors; //chuyên ngành đang học
        String Semester; //học kỳ đang học
        String University_name; //tên trường đang học
        
        public Intern() {
                super();
                // TODO Auto-generated constructor stub
        }

        /**
         * @param majors
         * @param semester
         * @param university_name
         */
        public Intern(String majors, String semester, String university_name) {
                super();
                Majors = majors;
                Semester = semester;
                University_name = university_name;
        }

        public String getMajors() {
                return Majors;
        }

        public void setMajors(String majors) {
                Majors = majors;
        }

        public String getSemester() {
                return Semester;
        }

        public void setSemester(String semester) {
                Semester = semester;
        }

        public String getUniversity_name() {
                return University_name;
        }

        public void setUniversity_name(String university_name) {
                University_name = university_name;
        }

        @Override
        public String toString() {
                return "Intern [Majors=" + Majors + ", Semester=" + Semester + ", University_name="
                                + University_name + "]";
        }
                
}
