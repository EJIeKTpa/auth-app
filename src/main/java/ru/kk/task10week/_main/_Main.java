package ru.kk.task10week._main;

import ru.kk.task10week.service.Account;
import ru.kk.task10week.util.WrongLoginException;
import ru.kk.task10week.util.WrongLoginOrPasswordException;
import ru.kk.task10week.util.WrongPasswordException;

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
