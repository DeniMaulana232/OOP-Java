package com.company;

public enum JenisProduct {
    kesehatan("Kesehatan"),
    jiwa("Jiwa"),
    kendaraan("Kendaraan");

    private String lableJenisKendaraan;

    JenisProduct(String lableJenisKendaraan) {
        this.lableJenisKendaraan = lableJenisKendaraan;
    }

    public String getLableJenisKendaraan() {
        return lableJenisKendaraan;
    }
}
