package com.company;

public enum Gender {
    L("Laki - Laki"),
    P("Perempuan");

    private String jenisKelamin;

    Gender(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getJenisKelamin() {
        return this.jenisKelamin;
    }
}
