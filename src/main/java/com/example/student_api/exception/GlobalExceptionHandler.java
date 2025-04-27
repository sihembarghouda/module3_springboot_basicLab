package com.example.student_api.exception;

import java.io.Serial;

class resourceNotFoundException extends RuntimeException {

    @Serial
    private static final long serialVersionUID = 1L;

    public resourceNotFoundException(String message) {
        super(message);
    }
}