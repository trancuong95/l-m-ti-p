/**
 * (C) Copyright 2018 TranCuong-GDP05. All Rights Reserved.
 *
 * @author TranCuong
 * @date Jan 4, 2019
 * @version 1.0
 */
package utils;

public interface Constants {

        interface Candidate{
            public static final String SELECT_ALL = "select *from experiencecandidate";

            public static final String INSERT = "insert into experiencecandidate values(?, ?, ?, ?, ?, ?, ?, ?)";
            
            public static final String ID = "ID";
            public static final String FIRST_NAME = "FIRSTNAME";
            public static final String LAST_NAME = "LASTNAME";
            public static final String BIRTH_DATE = "BIRTHDATE";
            public static final String ADDRESS = "ADDRESS";
            public static final String PHONE = "PHONE";
            public static final String EMAIL = "EMAIL";
            public static final String CANDIDATE_TYPE = "CANDIDATETYPE";
        }

        
        interface Experience {
            public static final String SELECT_ALL = "select *from experiencecandidate";

            public static final String INSERT = "insert into experiencecandidate values(?, ?)";
            
            public static final String EXPIN_YEAR = "EXPINYEAR";
            public static final String PRO_SKILL = "PROSKILL";
        }

        interface Fresher {
            public static final String SELECT_ALL = "select *from freshercandidate";

            public static final String INSERT = "insert into freshercandidate values(?, ?, ?)";
            
            public static final String GRADUATION_DATE = "GRADUATIONDATE";
            public static final String GRADUATION_RANK = "GRADUATIONRANK";
            public static final String EDUCATION = "EDUCATION";
        }
        
        interface Intern {
            public static final String SELECT_ALL = "select *from interncandidate";

            public static final String INSERT = "insert into interncandidate values(?, ?, ?)";
            
            public static final String MAJORS = "MAJORS";
            public static final String SEMETER = "SEMESTER";
            public static final String UNIVERSITY_NAME = "UNIVERSITYNAME";
        }
        
        interface ReCruitment {
            public static final String SELECT_ALL = "select *from recruitment";
            public static final String GET_ONE = "select *from recruitment where recruitmentCode = ?";
            public static final String UPDATE = "update recruitment set Possition = ?, recruitmentPakage = ?, numberCandidate = ?"
                    + " where recruitmentCode = ? ";
            
            public static final String RECRUITMENT_CODE = "RECRUITMENTCODE";
            public static final String NUMBER_APPLY = "NUMBERAPPLY";
        }
}
