package com.felipeAugusto.course.resources.exceptions;

import java.time.Instant;

public class StandardError{

    private Instant timestamp;
    private Integer status;
    private String message;
    private String path;
    private String error;

    public StandardError(){
    }
    public StandardError(Instant timestamp, Integer status, String message, String path, String error){
        this.timestamp = timestamp;
        this.status = status;
        this.message = message;
        this.path = path;
        this.error = error;
    }

    public Instant getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Instant timestamp) {
        this.timestamp = timestamp;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
