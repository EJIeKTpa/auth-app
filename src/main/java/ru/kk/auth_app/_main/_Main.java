package ru.kk.auth_app._main;

import ru.kk.auth_app.service.Account;
import ru.kk.auth_app.util.WrongLoginException;
import ru.kk.auth_app.util.WrongLoginOrPasswordException;
import ru.kk.auth_app.util.WrongPasswordException;

public class _Main {
    public static void main(String[] args) {
        Account account = new Account();

        try {
            account.addLoginAndPassword("user1", "password1");
            account.addLoginAndPassword("user2", "password2");

            System.out.println(account.checkLoginAndPassword("user1", "password1"));
            account.checkLogin("user1");
            account.checkPassword("password1", "password1");

            System.out.println(account.checkLoginAndPassword("user3", "password3"));
            account.checkLogin("user3");
            account.checkPassword("password3", "password3");
        } catch (WrongLoginException | WrongPasswordException | WrongLoginOrPasswordException e) {
            System.out.println(e.getMessage());
        }
    }
}
