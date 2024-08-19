package com.example.apitesttasktrackmailshipment.service;

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String s) {
    }

    public ResourceNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public ResourceNotFoundException(Throwable cause) {
        super(cause);
    }

    public ResourceNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public ResourceNotFoundException() {
    }
}
