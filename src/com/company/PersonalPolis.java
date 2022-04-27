package com.company;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

public class PersonalPolis extends Nasabah{
    private String nomorNasabah;
    private String product;
    private String tertanggung;
    private LocalDate tanggalMulai;
    List<PersonalPolis> listPolisDiri;

    public PersonalPolis(){
        super();
    }

    public PersonalPolis(String firtsName, String lastName, LocalDate tglLahir, String tempatLahir, Gender gender, String pekerjaan, int nomorUnik, Status status, String noUnikNasabah, String noKtp, com.company.KartuKeluarga kartuKeluarga, MetodePembayaran metodePembayaran, String nomorNasabah, String product, String tertanggung, LocalDate tanggalMulai) {
        super(firtsName, lastName, tglLahir, tempatLahir, gender, pekerjaan, nomorUnik, status, noUnikNasabah, noKtp, kartuKeluarga, metodePembayaran);
        this.nomorNasabah = nomorNasabah;
        this.product = product;
        this.tertanggung = tertanggung;
        this.tanggalMulai = tanggalMulai;
    }


    public String getNomorNasabah() {
        return nomorNasabah;
    }

    public String FormatTanggal(LocalDate tanggal){
        Locale indo = new Locale("id","ID");
        DateTimeFormatter formatIndo = DateTimeFormatter.ofPattern("dd MM yyyy", indo);
        String hasil = formatIndo.format(tanggal);
        return hasil;
    }

    public void SelfPolis(){listPolisDiri = new LinkedList<>();}

    public void setNomorNasabah(String nomorNasabah) { this.nomorNasabah = nomorNasabah; }

    public String getProduct() { return product; }

    public void setProduct(String product) { this.product = product; }

    public String getTertanggung() { return tertanggung; }

    public void setTertanggung(String tertanggung) { this.tertanggung = tertanggung; }

    public LocalDate getTanggalMulai() { return tanggalMulai; }

    public void setTanggalMulai(LocalDate tanggalMulai) { this.tanggalMulai = tanggalMulai; }

    public List<PersonalPolis> getListPolisDiri() { return listPolisDiri; }

    public void setListPolisDiri(List<PersonalPolis> listPolisDiri) { this.listPolisDiri = listPolisDiri; }
}
