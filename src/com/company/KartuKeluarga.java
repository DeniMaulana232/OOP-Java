package com.company;

public enum KartuKeluarga {
    A("Kepala Keluarga"),
    B("Istri"),
    C("Anak");

    private String statusKK;
    KartuKeluarga(String statusKK) {
        this.statusKK = statusKK;
    }

    public String getStatusKK() { return statusKK; }
}
