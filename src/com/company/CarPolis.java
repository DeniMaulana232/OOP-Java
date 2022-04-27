package com.company;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

public class CarPolis extends Nasabah {

    private String nomorNasabah;
    private String product;
    private String jenisKendaraan;
    private String nomorPolisi;
    private String nomorSTNK;
    private String merkKendaraan;
    private String modelKendaraan;
    private String warnaKendaraan;
    private LocalDate tanggalMulai;
    List<CarPolis> listCarPolis;

    public void dataKendaraan(){
        System.out.printf("Tanggal Mulai Dijalankan   : %s  \n", FormatTanggal(getTanggalMulai()));
        System.out.printf("Jenis Kendaraan            : %s  \n", getJenisKendaraan());
        System.out.printf("Nomor Polisi               : %s  \n", getNomorPolisi());
        System.out.printf("Nomor STNK                 : %s  \n", getNomorSTNK());
        System.out.printf("Merk Kendaraan             : %s  \n", getMerkKendaraan());
        System.out.printf("Model Kendaraan            : %s  \n", getModelKendaraan());
        System.out.printf("Warna Kendaraan            : %s  \n", getWarnaKendaraan());
    }

    public String FormatTanggal(LocalDate tanggal){
        Locale indo = new Locale("id","ID");
        DateTimeFormatter formatIndo = DateTimeFormatter.ofPattern("dd MM yyyy", indo);
        String hasil = formatIndo.format(tanggal);
        return hasil;
    }
    CarPolis(){
        listCarPolis = new LinkedList<>();
    }
    public String getNomorNasabah() { return nomorNasabah; }

    public void setNomorNasabah(String nomorNasabah) { this.nomorNasabah = nomorNasabah; }

    public String getProduct() { return product; }

    public void setProduct(String product) { this.product = product; }

    public String getJenisKendaraan() { return jenisKendaraan; }

    public void setJenisKendaraan(String jenisKendaraan) { this.jenisKendaraan = jenisKendaraan; }

    public String getNomorPolisi() { return nomorPolisi; }

    public void setNomorPolisi(String nomorPolisi) { this.nomorPolisi = nomorPolisi; }

    public String getNomorSTNK() { return nomorSTNK; }

    public void setNomorSTNK(String nomorSTNK) { this.nomorSTNK = nomorSTNK; }

    public String getMerkKendaraan() { return merkKendaraan; }

    public void setMerkKendaraan(String merkKendaraan) { this.merkKendaraan = merkKendaraan; }

    public String getModelKendaraan() { return modelKendaraan; }

    public void setModelKendaraan(String modelKendaraan) { this.modelKendaraan = modelKendaraan; }

    public String getWarnaKendaraan() { return warnaKendaraan; }

    public void setWarnaKendaraan(String warnaKendaraan) { this.warnaKendaraan = warnaKendaraan; }

    public LocalDate getTanggalMulai() { return tanggalMulai; }

    public void setTanggalMulai(LocalDate tanggalMulai) { this.tanggalMulai = tanggalMulai; }

    public List<CarPolis> getListCarPolis() { return listCarPolis; }

    public void setListCarPolis(List<CarPolis> listPolisKendaraan) { this.listCarPolis = listPolisKendaraan; }
}
