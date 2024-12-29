package model;

import java.util.ArrayList;

public class AccountList {
    public ArrayList<Account> getDatabase(){
        ArrayList<Account> list = new ArrayList<>();

        list.add(new Account("1111111111", "mot12345678"));
        list.add(new Account("2222222222", "nguyenhai22"));
        list.add(new Account("3333333333", "nguyenba33"));

        return list;
    }
}
