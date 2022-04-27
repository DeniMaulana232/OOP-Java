package com.company;

public enum FrekuensiPembayaran {
    tahunan("Tahunan"),
    bulanan("Bulanan");

    private String lableFrekuensiPembayaran;

    FrekuensiPembayaran(String lableFrekuensiPembayaran) {
        this.lableFrekuensiPembayaran = lableFrekuensiPembayaran;
    }

    public String getLableFrekuensiPembayaran() {
        return lableFrekuensiPembayaran;
    }

}
