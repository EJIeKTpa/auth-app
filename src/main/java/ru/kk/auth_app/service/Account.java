package ru.kk.auth_app.service;

import ru.kk.auth_app.util.WrongLoginException;
import ru.kk.auth_app.util.WrongLoginOrPasswordException;
import ru.kk.auth_app.util.WrongPasswordException;

import java.util.HashMap;

public class Account {
    private String login;
    private String password;
    private HashMap<String, String> loginPasswordMap = new HashMap<>();

    public Account() {}

    public void checkLogin(String inputLogin) throws WrongLoginException {
        if (inputLogin == null || inputLogin.length() <= 5 || inputLogin.length() >= 20) {
            throw new WrongLoginException("Некорректный логин");
        }
        this.login = inputLogin;
    }

    public void checkPassword(String inputPassword, String confirmPassword) throws WrongPasswordException {
        if (inputPassword == null || inputPassword.length() <= 8 || inputPassword.length() >= 20 ||
                !inputPassword.equals(confirmPassword)) {
            throw new WrongPasswordException("Некорректный пароль");
        }
        this.password = inputPassword;
    }

    public String checkLoginAndPassword(String login, String password) throws WrongLoginOrPasswordException {
        if (loginPasswordMap.containsKey(login) && loginPasswordMap.get(login).equals(password)) {
            return "Вы успешно вошли в аккаунт!";
        }
        throw new WrongLoginOrPasswordException("Неверный логин или пароль");
    }

    public void addLoginAndPassword(String login, String password) {
        loginPasswordMap.put(login, password);
    }
}
