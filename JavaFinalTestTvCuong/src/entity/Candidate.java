/**
 * (C) Copyright 2018 TranCuong-GDP05. All Rights Reserved.
 *
 * @author TranCuong
 * @date Jan 4, 2019
 * @version 1.0
 */
package entity;

import java.sql.Date;

public class Candidate {
        int Id; //mã id
        String FirstName; //first name
        String LastName; //last name
        Date BirthDate; //ngày sinh
        String Address; //địa chỉ
        String Phone; //số điện thoại
        String Email; //email
        int Candidate_type; //phân loại ứng viên
        
        public Candidate() {
                super();
                // TODO Auto-generated constructor stub
        }

        /**
         * @param id
         * @param firstName
         * @param lastName
         * @param birthDate
         * @param address
         * @param phone
         * @param email
         * @param candidate_type
         */
        public Candidate(int id, String firstName, String lastName, Date birthDate, String address,
                        String phone, String email, int candidate_type) {
                super();
                Id = id;
                FirstName = firstName;
                LastName = lastName;
                BirthDate = birthDate;
                Address = address;
                Phone = phone;
                Email = email;
                Candidate_type = candidate_type;
        }

        public int getId() {
                return Id;
        }

        public void setId(int id) {
                Id = id;
        }

        public String getFirstName() {
                return FirstName;
        }

        public void setFirstName(String firstName) {
                FirstName = firstName;
        }

        public String getLastName() {
                return LastName;
        }

        public void setLastName(String lastName) {
                LastName = lastName;
        }

        public Date getBirthDate() {
                return BirthDate;
        }

        public void setBirthDate(Date birthDate) {
                BirthDate = birthDate;
        }

        public String getAddress() {
                return Address;
        }

        public void setAddress(String address) {
                Address = address;
        }

        public String getPhone() {
                return Phone;
        }

        public void setPhone(String phone) {
                Phone = phone;
        }

        public String getEmail() {
                return Email;
        }

        public void setEmail(String email) {
                Email = email;
        }

        public int getCandidate_type() {
                return Candidate_type;
        }

        public void setCandidate_type(int candidate_type) {
                Candidate_type = candidate_type;
        }

        @Override
        public String toString() {
                return "Candidate [Id=" + Id + ", FirstName=" + FirstName + ", LastName=" + LastName
                                + ", BirthDate=" + BirthDate + ", Address=" + Address + ", Phone="
                                + Phone + ", Email=" + Email + ", Candidate_type=" + Candidate_type
                                + "]";
        }               

}
