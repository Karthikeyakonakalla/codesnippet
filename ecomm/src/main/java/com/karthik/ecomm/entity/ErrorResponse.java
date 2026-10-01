package com.karthik.ecomm.entity;

import java.time.LocalDateTime;

public class ErrorResponse {

    private LocalDateTime time;
    private String message;

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    private String details;
    public ErrorResponse(LocalDateTime time, String message, String details) {
        this.time = time;
        this.message = message;
        this.details = details;
    }

}
