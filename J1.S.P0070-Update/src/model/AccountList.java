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
public class AccountList {
    public ArrayList<Account> getDataBase(){
        ArrayList<Account> list = new ArrayList<>();
        list.add(new Account("1111111111", "nguyenmot111"));
        list.add(new Account("2222222222", "nguyenhai222"));
        list.add(new Account("3333333333", "nguyenba333"));

        return list;
    }
}
