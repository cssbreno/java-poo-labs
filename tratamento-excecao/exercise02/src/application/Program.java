package application;

import saques.Account;

public class Program {

    public static void main(String[] args) {
        Account account = new Account(1001, "Alex", 500.00, 300.00);
        System.out.println(account);
    }
}