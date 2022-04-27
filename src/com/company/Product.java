package com.company;

import java.math.BigDecimal;
import java.util.List;

public class Product {
    private String namaProduct;
    private JenisProduct jenisProduct;
    private FrekuensiPembayaran frekuensiPembayaran;
    private String manfaatProduct;
    private KetentuanPembelianProduct ketentuanProduct;
    private double hargaDiBawahUmur;
    private double hargaStandar;

    public Product(){}

    public Product(String namaProduct, JenisProduct jenisProduct, FrekuensiPembayaran frekuensiPembayaran, String manfaatProduct, KetentuanPembelianProduct ketentuanProduct, double hargaDiBawahUmur, double hargaStandar) {
        this.namaProduct = namaProduct;
        this.jenisProduct = jenisProduct;
        this.frekuensiPembayaran = frekuensiPembayaran;
        this.manfaatProduct = manfaatProduct;
        this.ketentuanProduct = ketentuanProduct;
        this.hargaDiBawahUmur = hargaDiBawahUmur;
        this.hargaStandar = hargaStandar;
    }

    public String getNamaProduct() { return namaProduct; }

    public void setNamaProduct(String namaProduct) { this.namaProduct = namaProduct; }

    public JenisProduct getJenisProduct() { return jenisProduct; }

    public void setJenisProduct(JenisProduct jenisProduct) { this.jenisProduct = jenisProduct; }

    public FrekuensiPembayaran getFrekuensiPembayaran() { return frekuensiPembayaran; }

    public void setFrekuensiPembayaran(FrekuensiPembayaran frekuensiPembayaran) { this.frekuensiPembayaran = frekuensiPembayaran; }

    public String getManfaatProduct() { return manfaatProduct;}

    public void setManfaatProduct(String manfaatProduct) { this.manfaatProduct = manfaatProduct; }

    public KetentuanPembelianProduct getKetentuanProduct() { return ketentuanProduct; }

    public void setKetentuanProduct(KetentuanPembelianProduct ketentuanProduct) { this.ketentuanProduct = ketentuanProduct; }

    public double getHargaDiBawahUmur() { return hargaDiBawahUmur; }

    public void setHargaDiBawahUmur(double hargaDiBawahUmur) { this.hargaDiBawahUmur = hargaDiBawahUmur; }

    public double getHargaStandar() { return hargaStandar; }

    public void setHargaStandar(double hargaStandar) { this.hargaStandar = hargaStandar; }
}