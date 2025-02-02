/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.time.Year;
import java.util.ArrayList;
import model.Candidate;
import model.Experience;
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
        
    }
    
    public void createInternCandidate(ArrayList<Candidate> candidates, Candidate candidate){
        
    }
    
    public void printListCandidate(ArrayList<Candidate> candidates){
        if(candidates.isEmpty()){
            System.out.println("The List Candidate is empty");
            System.out.println("---------------------------------------------");
            System.out.println("");
            return;
        }
        System.err.println("Experience Candidate");
        for (Candidate candidate : candidates) {
            System.out.println(candidate);
        }
    }
    
}
