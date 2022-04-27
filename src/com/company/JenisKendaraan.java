package com.company;

public enum JenisKendaraan {
    mobil("Mobil"),
    motor("motor");

    private String jenisKendaraan;

    JenisKendaraan(String jenisKendaraan) { this.jenisKendaraan = jenisKendaraan;}

    public String getJenisKendaraan() { return jenisKendaraan; }
}
