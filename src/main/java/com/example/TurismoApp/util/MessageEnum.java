package com.example.TurismoApp.util;

public enum MessageEnum {



    ERROR_SERVICE("Error in the internal services"),

    INVALID_LENGTH_MAYOR_THIRTY("Invalid data length, must be less than 30"),

    COMPANY_NOT_FOUND("The company has not found"),
    OFFER_NOT_FOUND("The Offer has not found"),
    ;

    private String message;
    MessageEnum(String s) {
    }

    public String getMessage() {
        return message;
    }
}
