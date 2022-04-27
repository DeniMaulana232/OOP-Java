package com.company.ENUM;

public enum ERole {
    admin("ADMIN"),
    TS("TECH SUPPORT"),
    manager("MANAGER");

    private String roleUser;

    ERole(String roleUser) {this.roleUser = roleUser;}

    public String getRoleUser() {return roleUser;}
}
