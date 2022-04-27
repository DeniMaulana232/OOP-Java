package com.company;

import java.time.LocalDate;
import java.util.List;

public class Nasabah extends Prospect{
    private String  noUnikNasabah;
    private String noKtp;
    private KartuKeluarga KartuKeluarga;
    private MetodePembayaran metodePembayaran;
    private List<Nasabah> listNasabah;


    public Nasabah() {
        super();
    }

    public Nasabah(String firtsName, String lastName, LocalDate tglLahir, String tempatLahir, Gender gender,
                   String pekerjaan, int nomorUnik, Status status, String noUnikNasabah, String noKtp,
                   KartuKeluarga kartuKeluarga, MetodePembayaran metodePembayaran)
    {
        super(firtsName, lastName, tglLahir, tempatLahir, gender, pekerjaan, nomorUnik, status);
        this.noUnikNasabah = noUnikNasabah;
        this.noKtp = noKtp;
        KartuKeluarga = kartuKeluarga;
        this.metodePembayaran = metodePembayaran;
    }

    //    public Nasabah(String firtsName, String lastName, LocalDate tglLahir, String tempatLahir, Gender gender,
//                   int nomorUnik, Status status)
//    {
//        super(firtsName, lastName, tglLahir, tempatLahir, gender, nomorUnik, status);
//    }

    public String getNoUnikNasabah() { return noUnikNasabah; }

    public void setNoUnikNasabah(String noUnikNasabah) { this.noUnikNasabah = noUnikNasabah; }

    public String getNoKtp() { return noKtp; }

    public void setNoKtp(String noKtp) { this.noKtp = noKtp; }

    public com.company.KartuKeluarga getKartuKeluarga() { return KartuKeluarga; }

    public void setKartuKeluarga(KartuKeluarga kartuKeluarga) { KartuKeluarga = kartuKeluarga; }

    public MetodePembayaran getMetodePembayaran() { return metodePembayaran; }

    public void setMetodePembayaran(MetodePembayaran metodePembayaran) { this.metodePembayaran = metodePembayaran;}

    public List<Nasabah> getListNasabah() { return listNasabah; }

    public void setListNasabah(List<Nasabah> listNasabah) { this.listNasabah = listNasabah; }
}
