package com.company;

public enum MetodePembayaran {
    CC("Credit Card"),
    AC("Auto Debit/Collection"),
    VP("Voucher Prabayar");
    private String metodePembayaran;

    MetodePembayaran(String metodePembayaran) {
        this.metodePembayaran = metodePembayaran;
    }

    public String getMetodePembayaran() {
        return metodePembayaran;
    }
}
