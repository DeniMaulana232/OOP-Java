package com.company.ENUM;

public enum Urgency {
    H("HIGH"),
    M("MEDIUM"),
    L("LOW");

    private String urgency;

    Urgency(String urgency) {
        this.urgency = urgency;
    }

    public String getUrgency() {
        return urgency;
    }
}
