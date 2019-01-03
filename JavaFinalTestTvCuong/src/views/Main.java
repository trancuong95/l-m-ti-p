/**
 * (C) Copyright 2018 TranCuong-GDP05. All Rights Reserved.
 *
 * @author TranCuong
 * @date Jan 4, 2019
 * @version 1.0
 */
package views;

import java.util.Scanner;

import bll.CandidateBLL;
import bll.FresherBLL;
import bll.InternBLL;
import bll.RecruitrmentBLL;

public class Main {
        static Scanner sc = new Scanner(System.in);
        
        CandidateBLL cdBLL = new CandidateBLL();
        FresherBLL fsBLL = new FresherBLL();
        InternBLL inBLL = new InternBLL();
        RecruitrmentBLL rcBLL = new RecruitrmentBLL();
        
        public void menu() {
                System.out.println("---------------MENU------------------");
                System.out.println("1: Candidate" + 
                                   "2: Experience Candidate" +
                                    "\n3: Fresher Candidate" +
                                    "\n4: Intern Candidate" +
                                    "\n5: Check Candidate" +
                                    "\nquit: quit");
                System.out.println("--------------------------------------");
            }
        

        public void select() {
            System.out.println("1: show list" +
                                "\n2: insert" +
                                "\nexit: go to menu");
            System.out.print("Please select: ");
        }
        
        public static void main(String[] args) {
                
        }

}
