package org.example.exceptions;

public class IncorrectUserException extends RuntimeException {
    public IncorrectUserException(String message) {
        super(message);
    }
}
