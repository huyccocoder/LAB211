/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.time.Year;
import java.util.ArrayList;
import model.Candidate;
import model.Experience;
import model.Fresher;
import model.Intern;
import ultis.Validation;

/**
 *
 * @author Admin
 */
public class CandidateController {
    Validation check = new Validation();
    
     int Identity;

    public int getIdentity() {
        return Identity;
    }

    public CandidateController() {
        this.Identity = 0;
    }

    public boolean checkDuplicated(String firstName, String lastName, int birthDate, String address, String phone, String email){
        return false;
    }
    
    public void createCandidate(ArrayList<Candidate> candidates , int typeCandidate){
        String checkYN = check.checkYesOrNo("Do you want to continue (Y/N): ");
        if(checkYN.equalsIgnoreCase("y")){
            String firstName = check.inputString("Your FirstName: ", ".+");
            String lastName = check.inputString("Your LastName: ", ".+");
            int birthDate = check.inputInt("Your BirthDate: ", 1900, Year.now().getValue());
            String address = check.inputString("Your Address: ", ".+");
            String phone = check.inputPhone("Your Phone: ");
            String email = check.inputEmail("Your Email: ");

            Candidate candidate = new Candidate(Identity++, firstName, lastName, birthDate, address, phone, email, typeCandidate);
            switch (typeCandidate) {
                case 0:
                    createExperienceCandidate(candidates, candidate);
                    break;
                case 1:
                    createFresherCandidate(candidates, candidate);
                    break;
                case 2:
                    createInternCandidate(candidates, candidate);
                    break;
            }
        }
    }
    
    public void createExperienceCandidate(ArrayList<Candidate> candidates, Candidate candidate ){
        int yOE = check.inputInt("Your Year Of Experience: ", 0, 100);
        String proSkill = check.inputString("Your Proskill: ", ".+");
        
        Experience createExperience = new Experience(yOE, proSkill, Identity,
                candidate.getFirstName(), candidate.getLastName(), candidate.getBirthDate(), 
                candidate.getAddress(), candidate.getPhone(), candidate.getEmail(), candidate.getCandidateType());
        
        candidates.add(createExperience);
        System.out.println("Add successfully");
    }
    
    public void createFresherCandidate(ArrayList<Candidate> candidates, Candidate candidate){
        String graduationDate = check.inputString("Your Graduation Date: ", ".+");
        String rankOfGrade = check.inputRankOfGrade("Your Rank: ");
        String UniverName = check.inputString("Your Universal Name: ", ".+");
        
        Fresher createFresher = new Fresher(graduationDate, rankOfGrade, UniverName, Identity, 
                candidate.getFirstName(), candidate.getLastName(), candidate.getBirthDate(), 
                candidate.getAddress(), candidate.getPhone(), candidate.getEmail(), candidate.getCandidateType());
        
        candidates.add(createFresher);
        System.out.println("Add Fresher Successfully");
    }
    
    public void createInternCandidate(ArrayList<Candidate> candidates, Candidate candidate){
        String major = check.inputString("Your Major: ", ".+");
        int semester = check.inputInt("Your current semester: ", 1, 9);
        String universalName = check.inputString("Your Universal Name: ", ".+");
        
        Intern createIntern = new Intern(major, semester, universalName, Identity, 
                candidate.getFirstName(), candidate.getLastName(), candidate.getBirthDate(), 
                candidate.getAddress(), candidate.getPhone(), candidate.getEmail(), candidate.getCandidateType());
        
        candidates.add(createIntern);
        System.out.println("Add Intern Successfully");
    }
    
    public void printListCandidate(ArrayList<Candidate> candidates){
        if(candidates.isEmpty()){
            System.out.println("The List Candidate is empty");
            System.out.println("---------------------------------------------");
            System.out.println("");
            return;
        }
        
        System.out.println("List Candidate: ");
        System.err.println("========== Experience Candidate ==========");
        for (Candidate candidate : candidates) {
            if(candidate instanceof Experience){
                System.out.println(candidate);
            }
        }
        
        System.err.println("========== Fresher Candidate ==========");
        for (Candidate candidate : candidates) {
            if(candidate instanceof Fresher){
                System.out.println(candidate);
            }
        }
        
        System.err.println("========== Intern Candidate ==========");
        for (Candidate candidate : candidates) {
            if(candidate instanceof Intern){
                System.out.println(candidate);
            }
        }
    }
    
    public void searchCandidate(ArrayList<Candidate> candidates){
        printListCandidate(candidates);
        String find = check.inputString("Search Candidate: ", ".+");
        for (Candidate candidate : candidates) {
            if(candidate.getFirstName().contains(find) || candidate.getLastName().contains(find)){
                System.out.printf("%-25s | %-5d | %-10s | %-11s | %-20s | %-2d",
                        candidate.getFirstName() +  " " + candidate.getLastName(), candidate.getBirthDate(), candidate.getAddress(), candidate.getPhone(), candidate.getEmail(), candidate.getCandidateType());
            }
        }
    }
}
