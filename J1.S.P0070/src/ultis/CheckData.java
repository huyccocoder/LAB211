/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ultis;

import com.sun.org.apache.bcel.internal.generic.AALOAD;
import java.util.ArrayList;
import model.Account;
import model.AccountList;

/**
 *
 * @author Admin
 */
public class CheckData {
    AccountList list = new AccountList();
    ArrayList<Account> accountList = list.getDatabase();
    
    public boolean checkAccount(String account){
        for (Account account1 : accountList) {
            if(account1.getAccount().equals(account)){
                return true;
            }
        }
        return false;
    }
    
    public boolean  checkPassword(String account, String password){
        if(checkAccount(account) == true){
            for (Account account1 : accountList) {
                if(account1.getPassword().equals(password)){
                    return true;
                }
            }
        }
        return false;
    }
}
