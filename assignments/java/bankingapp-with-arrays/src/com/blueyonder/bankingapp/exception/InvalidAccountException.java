package com.blueyonder.bankingapp.exception;

public class InvalidAccountException extends AccountException{

    public InvalidAccountException() {
    }

    public InvalidAccountException(String message) {
        super(message);
    }

    public InvalidAccountException(String message, Throwable cause) {
        super(message, cause);
    }
}
