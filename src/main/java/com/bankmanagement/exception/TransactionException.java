package com.bankmanagement.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class TransactionException extends RuntimeException {
    public TransactionException(String message)
    {
        super(message);
    }

}
