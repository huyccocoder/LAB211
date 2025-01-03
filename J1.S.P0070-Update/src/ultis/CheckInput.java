/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ultis;

import java.util.ArrayList;

import model.Account;
import model.AccountList;

/**
 *
 * @author Admin
 */
public class CheckInput {
    AccountList list = new AccountList();
    ArrayList<Account> checkList = list.getDataBase();

    public boolean checkAccount(String account) {
        for (Account accountItem : checkList) {
            if (account.equals(accountItem.getAccount())) {
                return true;
            }
        }
        return false;
    }

    public boolean checkPassword(String password) {
        for (Account accountItem : checkList) {
            if (password.equals(accountItem.getPassword())) {
                return true;
            }
        }
        return false;
    }
}
