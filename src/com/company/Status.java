package com.company;

public enum Status {
    P("Prospect"),
    N("Nasabah");

    private String status;

    Status(String status) {
        this.status = status;
    }

    public String getStatus() {
        return this.status;
    }
}
