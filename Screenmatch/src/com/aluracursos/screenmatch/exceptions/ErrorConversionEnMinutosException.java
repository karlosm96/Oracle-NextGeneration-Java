package com.aluracursos.screenmatch.exceptions;

public class ErrorConversionEnMinutosException extends RuntimeException {
    private String message;

    public ErrorConversionEnMinutosException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
