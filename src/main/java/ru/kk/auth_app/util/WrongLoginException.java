package ru.kk.auth_app.util;

public class WrongLoginException extends Exception {
    public WrongLoginException(String message) {
        super(message);
    }
}
