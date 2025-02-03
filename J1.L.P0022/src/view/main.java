/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.CandidateController;
import java.util.ArrayList;
import model.Candidate;
import ultis.Validation;

/**
 *
 * @author Admin
 */
public class main {

    public static void main(String[] args) {
        Display display = new Display();
        Validation check = new Validation();
        CandidateController controller = new CandidateController();

        ArrayList<Candidate> listCandidates = new ArrayList<>();

        
        while (true) {            
            display.displayCandidate();
            
            int choice = check.inputInt("Your choice: ", 1, 5);
            switch (choice) {
                case 1:
                    controller.createCandidate(listCandidates, 0);
                    break;
                case 2:
                    controller.createCandidate(listCandidates, 1);
                    break;
                case 3:
                    controller.createCandidate(listCandidates, 2);
                    break;
                case 4:
                    controller.searchCandidate(listCandidates);
                    break;
                case 5:
                    System.exit(0);
            } 
        }
    }
}
