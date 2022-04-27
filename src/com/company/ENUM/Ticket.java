package com.company.ENUM;

public enum Ticket {
    progress("IN_PROGRESSS"),
    complete("COMPLETED"),
    cancel("CANCELED");

    private String statusTicket;

    Ticket(String statusTicket) {
        this.statusTicket = statusTicket;
    }

    public String getStatusTicket() {
        return statusTicket;
    }
}
