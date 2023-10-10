package ru.kk.task10week.util;

public class WrongLoginOrPasswordException extends Exception {
    public WrongLoginOrPasswordException(String message) {
        super(message);
    }
}
