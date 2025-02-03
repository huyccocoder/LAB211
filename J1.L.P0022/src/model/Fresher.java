/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Admin
 */
public class Fresher extends Candidate{
    String graduationDate;
    String rankOfGrade;
    String universalName;

    public Fresher(String graduationDate, String rankOfGrade, String universalName, int candidateID, String firstName, String lastName, int birthDate, String address, String phone, String email, int candidateType) {
        super(candidateID, firstName, lastName, birthDate, address, phone, email, candidateType);
        this.graduationDate = graduationDate;
        this.rankOfGrade = rankOfGrade;
        this.universalName = universalName;
    }

    public Fresher(String graduationDate, String rankOfGrade, String universalName) {
        this.graduationDate = graduationDate;
        this.rankOfGrade = rankOfGrade;
        this.universalName = universalName;
    }

    public String getGraduationDate() {
        return graduationDate;
    }

    public void setGraduationDate(String graduationDate) {
        this.graduationDate = graduationDate;
    }

    public String getRankOfGrade() {
        return rankOfGrade;
    }

    public void setRankOfGrade(String rankOfGrade) {
        this.rankOfGrade = rankOfGrade;
    }

    public String getUniversalName() {
        return universalName;
    }

    public void setUniversalName(String universalName) {
        this.universalName = universalName;
    }
    
    @Override
    public String toString() {
         return String.format("%-25s \n",
                        super.getFirstName() + " "  +  super.getLastName());
    }
}
