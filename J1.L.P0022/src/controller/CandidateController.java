/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.time.Year;
import ultis.Validation;

/**
 *
 * @author Admin
 */
public class CandidateController {
    Validation check = new Validation();
    
    private int Identity;

    public int getIdentity() {
        return Identity;
    }

    public CandidateController() {
        this.Identity = 0;
    }

    public boolean checkDuplicated(String firstName, String lastName, int birthDate, String address, String phone, String email){
        return false;
    }
    
    public void createCandidate(){
        String firstName = check.inputString("Your FirstName: ", ".+");
        String lastName = check.inputString("Your LastName: ", ".+");
        int birthDate = check.inputInt("Your BirthDate: ", 1900, Year.now().getValue());
        String address = check.inputString("Your Address: ", ".+");
        String phone = check.inputPhone("Your Phone: ");
        String email = check.inputEmail("Your Email: ");
    }
    
    public void createExperienceCandidate(){
        
    }
    
    public void createFresherCandidate(){
        
    }
    
    public void createInternCandidate(){
        
    }
    
}
