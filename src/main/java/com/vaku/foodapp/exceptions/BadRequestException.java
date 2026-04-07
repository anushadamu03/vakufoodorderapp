package com.vaku.foodapp.exceptions;

public class BadRequestException extends RuntimeException {
    public BadRequestException(String message) {

        super(message);
    }
}
