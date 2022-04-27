package com.company.NOTE;

import com.company.ENUM.ERole;
import com.company.ENUM.History;
import com.company.ENUM.Ticket;
import com.company.ENUM.Urgency;

public class Role {
    private ERole role;
    private Urgency urgency;
    private Ticket ticket;
    private History history;

    public Role() {
    }

    public Role(ERole role, Urgency urgency, Ticket ticket, History history) {
        this.role = role;
        this.urgency = urgency;
        this.ticket = ticket;
        this.history = history;
    }
}
