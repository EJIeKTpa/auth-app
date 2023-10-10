package ru.kk.task10week.util;

public class WrongLoginException extends Exception {
    public WrongLoginException(String message) {
        super(message);
    }
}
