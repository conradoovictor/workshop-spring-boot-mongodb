package com.conradoovictor.workshopmongo.resources.exceptions;

import java.io.Serializable;

public class StandardError implements Serializable{
    private static final long serialVersionUID=1L;

    private Long timestamp;
    private Integer stratus;
    private String error;
    private String message;
    private String path;

    public StandardError(){
    }

    public StandardError(Long timestamp, Integer stratus, String error, String message, String path) {
        this.timestamp = timestamp;
        this.stratus = stratus;
        this.error = error;
        this.message = message;
        this.path = path;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public Integer getStratus() {
        return stratus;
    }

    public void setStratus(Integer stratus) {
        this.stratus = stratus;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
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


    
}
