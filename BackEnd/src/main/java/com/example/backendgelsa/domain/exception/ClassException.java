package com.example.backendgelsa.domain.exception;

public class ClassException extends RuntimeException {
    private String message;
    public ClassException(String message) {
        super(message);
        this.message = message;
    }
}