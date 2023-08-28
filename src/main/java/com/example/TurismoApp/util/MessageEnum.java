package com.example.TurismoApp.util;

public enum MessageEnum {



    ERROR_SERVICE("Error in the internal services"),

    INVALID_LENGTH_MAYOR_THIRTY("Invalid data length, must be less than 30"),

    ;

    private String message;
    MessageEnum(String s) {
    }

    public String getMessage() {
        return message;
    }
}
