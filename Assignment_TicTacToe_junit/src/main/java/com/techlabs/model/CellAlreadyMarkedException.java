package com.techlabs.model;

public class CellAlreadyMarkedException extends RuntimeException {
    public CellAlreadyMarkedException(String message) {
        super(message);
    }
}
