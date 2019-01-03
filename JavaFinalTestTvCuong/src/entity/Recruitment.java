/**
 * (C) Copyright 2018 TranCuong-GDP05. All Rights Reserved.
 *
 * @author TranCuong
 * @date Jan 4, 2019
 * @version 1.0
 */
package entity;

/**
 * @author TranCuong
 *
 */
public class Recruitment {

        int RecruitmentCode; //mã tuyển dụng
        String Position; //vị trí tuyển dụng
        String RecruitmentPackage; //gói tuyển dụng
        int Amount; //số tiền
        
        public Recruitment() {
                super();
                // TODO Auto-generated constructor stub
        }

        /**
         * @param recruitmentCode
         * @param position
         * @param recruitmentPackage
         * @param amount
         */
        public Recruitment(int recruitmentCode, String position, String recruitmentPackage,
                        int amount) {
                super();
                RecruitmentCode = recruitmentCode;
                Position = position;
                RecruitmentPackage = recruitmentPackage;
                Amount = amount;
        }

        public int getRecruitmentCode() {
                return RecruitmentCode;
        }

        public void setRecruitmentCode(int recruitmentCode) {
                RecruitmentCode = recruitmentCode;
        }

        public String getPosition() {
                return Position;
        }

        public void setPosition(String position) {
                Position = position;
        }

        public String getRecruitmentPackage() {
                return RecruitmentPackage;
        }

        public void setRecruitmentPackage(String recruitmentPackage) {
                RecruitmentPackage = recruitmentPackage;
        }

        public int getAmount() {
                return Amount;
        }

        public void setAmount(int amount) {
                Amount = amount;
        }

        @Override
        public String toString() {
                return "Recruitment [RecruitmentCode=" + RecruitmentCode + ", Position=" + Position
                                + ", RecruitmentPackage=" + RecruitmentPackage + ", Amount="
                                + Amount + "]";
        }
           
}
