/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class Experience extends Candidate{
    private int yoE;
    private String Proskill;
    ArrayList<Experience> listExperience = new ArrayList<>();

    public Experience(int yoE, String Proskill, int candidateID, String firstName, String lastName, int birthDate, String address, String phone, String email, String candidateType) {
        super(candidateID, firstName, lastName, birthDate, address, phone, email, candidateType);
        this.yoE = yoE;
        this.Proskill = Proskill;
    }

    public int getYoE() {
        return yoE;
    }

    public void setYoE(int yoE) {
        this.yoE = yoE;
    }

    public String getProskill() {
        return Proskill;
    }

    public void setProskill(String Proskill) {
        this.Proskill = Proskill;
    }
    
    public ArrayList<Experience> createEx(){
        
    }
    
}
