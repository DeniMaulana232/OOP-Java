package com.company;

public enum KetentuanPembelianProduct {
    sendiri("Hanya bisa menanggung diri sendiri."),
    keluarga("Bisa menanggung keluarga atau diri sendiri dari data nasabah."),
    kendaraan("Hanya bisa menanggung kendaraan.");

    private String lableKetentuanProduct;

    KetentuanPembelianProduct(String lableKetentuanProduct) {
        this.lableKetentuanProduct = lableKetentuanProduct;
    }


}
