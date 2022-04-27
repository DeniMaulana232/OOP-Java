package com.company.ENUM;

public enum History {
    ontime("ON_TIME"),
    over("OVERDUE");

    private String ticketHistory;

    History(String ticketHistory) {
        this.ticketHistory = ticketHistory;
    }

    public String getTicketHistory() {
        return ticketHistory;
    }
}
