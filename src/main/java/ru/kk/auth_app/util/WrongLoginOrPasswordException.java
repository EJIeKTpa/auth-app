package ru.kk.auth_app.util;

public class WrongLoginOrPasswordException extends Exception {
    public WrongLoginOrPasswordException(String message) {
        super(message);
    }
}
