package com.company;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {
  private static  List<Nasabah> listProspect = new LinkedList<>();
  private static  List<Prospect> listProspect1 = new LinkedList<>();
  private static  List<Product> listProduct;
  private static  List<PersonalPolis> listPersonalPolis = new LinkedList<>();
  private static  List<CarPolis> listCarPolis = new LinkedList<>();

    public static void main(String[] args) {
        setProspect();
    }

    public static void setProspect() {
        Scanner scan = new Scanner(System.in);
        int home;
        boolean validateMenuUtama = false;
        while (!validateMenuUtama) {
            System.out.println("1. Menu Prospect");
            System.out.println("2. Menu Customer");
            System.out.println("3. Exit Application");
            System.out.print("masukan pilihan: ");
            home = scan.nextInt();
            validateMenuUtama = true;
            switch (home) {
                case 1:
                    boolean validateInput = false;
                    while (!validateInput) {
                        getListProspect();
                        System.out.println("1. Add Prospect: ");
                        System.out.println("2. Prospect to Customer: ");
                        System.out.println("3. Back to Main Menu: ");
                        System.out.println("4. Exit Application: ");
                        System.out.println("masukana nomor: ");
                        int menu = scan.nextInt();
                        validateInput = true;
                        switch (menu) {
                            case 1:
                                for (int i = listProspect.size(); i <= listProspect.size(); i++) {
                                    Prospect prospect = new Nasabah();

                                    prospect.setNomorUnik(i + 1);
                                    scan.nextLine();
                                    System.out.println("Masukan Nama Depan: ");
                                    String firstName = scan.nextLine();
                                    prospect.setFirtsName(firstName);

                                    System.out.println("Masukan Nama Belakang: ");
                                    String LastName = scan.nextLine();
                                    prospect.setLastName(LastName);

                                    System.out.println("Masukan Tanggal Lahir (tanggal/bulan/tahun): ");
                                    String tglLahir = scan.nextLine();
                                    DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                                    LocalDate date = LocalDate.parse(tglLahir, format);
                                    prospect.setTglLahir(date);


                                    System.out.println("Masukan Tempat Lahir: ");
                                    String tempatLahir = scan.nextLine();
                                    prospect.setTempatLahir(tempatLahir);
                                    System.out.println("Masukan Gender: (L/P) ");
                                    String jk = scan.nextLine();
                                    prospect.setGender(Gender.valueOf(jk));
                                    System.out.println("Masukan Pekerjaan: ");
                                    String pekerjaan = scan.nextLine();
                                    prospect.setPekerjaan(pekerjaan);

                                    prospect.setStatus(Status.P);

//                                    Prospect newProspect = new Prospect(firstName,LastName,date,tempatLahir,Gender.valueOf(jk),pekerjaan,i+1,Status.P);
//
//                                    listProspect1.add(newProspect);


//
                                    listProspect1.add(prospect);
                                    prospect.setProspectList(listProspect1);
                                    Nasabah nasabah = (Nasabah) prospect;
                                    listProspect.add(nasabah);
                                    nasabah.setListNasabah(listProspect);

                                    System.out.println("Input lagi? (Y/N)");
                                    String confirm = scan.nextLine();
                                    if (confirm.equals("y") || confirm.equals("Y")) {
                                        continue;
                                    } else {
                                        validateInput = true;
                                        validateMenuUtama = false;
                                        break;
                                    }
                                }
                                break;
                            case 2:
                                getListProspect();
                                ProspectToCustomer();
                                break;
                            case 3:
                                validateInput = true;
                                validateMenuUtama = false;
                                break;
                            case 4:
                                break;
                        }
                    }
                    break;
                case 2:
                    int menuCus;
                    boolean validateCus = false;
                    while (!validateCus) {
                        ListDataCustomer();
                        System.out.println("1. Buy Product: ");
                        System.out.println("2. Detail Policy: ");
                        System.out.println("3. Back to Main Menu: ");
                        System.out.println("4. Exit Application: ");
                        System.out.println("masukana nomor: ");
                        menuCus = scan.nextInt();
                        switch (menuCus) {
                            case 1:
                                boolean case1 = false;
                                while (!case1) {
                                    buyProduct();
//                                    listProduct();
                                    scan.nextLine();
                                    System.out.println("mau input lagi? ");
                                    String conf = scan.nextLine();
                                    if(conf.equals("Y") || conf.equals("y")){
                                        case1 = false;
                                    }else {
                                        case1 = true;
                                        validateCus = false;
                                    }
                                }
                                break;
                            case 2:
                                break;
                            case 3:
                                validateCus = true;
                                validateMenuUtama = false;
                                break;
                            case 4:
                                System.exit(0);
                                break;
                        }
                    }
                    break;
                case 3:
                    System.exit(0);
                    break;
            }
        }
    }

    public static void getListProspect(){
        System.out.println("====================================================================================\n");
        if(listProspect1.isEmpty()){
            System.out.println("BELUM ADA DATA YANG DI INPUT");
        }else {
            for (Prospect pr : listProspect1) {
                Locale indonesia = new Locale("id", "ID");
                DateTimeFormatter indoFormat = DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy", indonesia);
                System.out.printf("\nNo: %d %s %s %s %s (%s), %s, %s ", pr.getNomorUnik(), pr.getFirtsName(),
                        pr.getLastName(), pr.getGender().getJenisKelamin(), indoFormat.format(pr.getTglLahir()), pr.getTempatLahir(),
                        pr.getPekerjaan(), pr.getStatus().getStatus());
            }
        }
        System.out.println("\n\n====================================================================================\n");
    }

    public static void ProspectToCustomer(){
        boolean validateMenu = false;
        while (!validateMenu) {
            Scanner scan = new Scanner(System.in);
            System.out.print("\nMasukan Nomor Prospect Terdaftar        : ");
            int inputNomorProspect = scan.nextInt();
//            validateMenu = true;
                if (cekProspect(inputNomorProspect)) {
                    scan.nextLine();
                    for (Nasabah nasabah : listProspect) {
                        if (nasabah.getNomorUnik() == inputNomorProspect) {
                            System.out.println(nasabah.getFirtsName());
                            System.out.print("masukan nik KTP                   : ");
                            String nomorKtp = scan.nextLine();
                            nasabah.setNoKtp(nomorKtp);

                            System.out.println("A. " + KartuKeluarga.A.getStatusKK());
                            System.out.println("B. " + KartuKeluarga.B.getStatusKK());
                            System.out.println("C. " + KartuKeluarga.C.getStatusKK());
                            System.out.print("Status di kartu keluarga          : ");
                            String statusKK = scan.nextLine();
                            nasabah.setKartuKeluarga(KartuKeluarga.valueOf(statusKK));

                            boolean cek = false;
                            while (!cek){
                                System.out.println("AC. " + MetodePembayaran.AC.getMetodePembayaran());
                                System.out.println("CC. " + MetodePembayaran.CC.getMetodePembayaran());
                                System.out.println("VP. " + MetodePembayaran.VP.getMetodePembayaran());
                                System.out.print("Pilih Metode Pembayaran           : ");
                                String payMethod = scan.nextLine();
                                if(payMethod.equals("AC") || payMethod.equals("CC") || payMethod.equals("VP")) {
                                    nasabah.setMetodePembayaran(MetodePembayaran.valueOf(payMethod));
                                    nasabah.setNoUnikNasabah(generateNoNasabah(nasabah.getNomorUnik()));
                                    nasabah.setStatus(Status.N);
                                    setProspect();
                                    cek = true;
                                    validateMenu = false;
                                } else {
                                    System.out.println("pilih sesuai dengan pilihan");
                                    cek = false;
                                }
                            }
                        }
                    }

                } else {
                    System.out.println("nomor tidak sesuai dengan daftar prospect");
                    validateMenu = false;
                }
        }
    }

    public static boolean cekProspect(int inputNomorProspect){
        boolean hasil = true;
        for(Prospect ps:listProspect1){
            for(int i = ps.getNomorUnik(); i <= ps.getNomorUnik(); i++){
                if(ps.getNomorUnik() == (inputNomorProspect) || ps.getNomorUnik() == i){
                    hasil = true;
                }else {
                    hasil = false;
                }
            }

        }
        return hasil;
    }

//    public static boolean cekCustomer(int inputNomorCustomer){
//        boolean hasil = true;
//        for(Nasabah ps:listProspect){
//            for(int i = ps.getNoUnikNasabah(); i <= ps.getNomorUnik(); i++){
//                if(ps.getNomorUnik() == (inputNomorCustomer) || ps.getNomorUnik() == i){
//                    hasil = true;
//                }else {
//                    hasil = false;
//                }
//            }
//
//        }
//        return hasil;

    public static String generateNoNasabah(int nomorProspect){
        int bulan = LocalDate.now().getMonthValue();
        int tahun = LocalDate.now().getYear();

        String nomorNasabah = String.format("%d/%d/%d",bulan,tahun,nomorProspect);
        return nomorNasabah;
    }

    public static void ListDataCustomer(){
        System.out.println("==============================================================================\n");
        if (listProspect.isEmpty()){
            System.out.println("Maaf belum ada data customer, silahkan input!!!!!!!");
        }else {
            for (Nasabah nasabah : listProspect) {
                if (nasabah.getStatus().equals(Status.N)) {
                    Locale indonesia = new Locale("id", "ID");
                    DateTimeFormatter indoFormat = DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy", indonesia);
                    System.out.printf("Nomor Nasabah: %s, %s %s, %s, %s (%s), %s \n", nasabah.getNoUnikNasabah(),
                            nasabah.getFirtsName(), nasabah.getLastName(), nasabah.getGender().getJenisKelamin(),
                            indoFormat.format(nasabah.getTglLahir()), nasabah.getTempatLahir(), nasabah.getPekerjaan());
                    System.out.printf("KTP. %s, Status pada kartu keluarga : %s, Metode Pembayaran : %s \n", nasabah.getNoKtp(),
                            nasabah.getKartuKeluarga().getStatusKK(), nasabah.getMetodePembayaran().getMetodePembayaran());
                }
            }
        }
        System.out.println("\n==============================================================================\n");
    }

    public static void buyProduct(){
        DataProduct();
        String inputNamaProduct = "";
        String inputNomorCustomer ="";
        Scanner scan = new Scanner(System.in);
        ListDataCustomer();
        scan.nextLine();
        System.out.print("masukan nomor nasabah: ");
        String input = scan.nextLine();

        for (Nasabah nasabah : listProspect) {
            int bulan = LocalDate.now().getMonthValue();
            int tahun = LocalDate.now().getYear();
            String nomorNasabah = String.format("%d/%d",bulan,tahun);
            if (nasabah.getNoUnikNasabah().equals(input) || nasabah.getNoUnikNasabah().equals(nomorNasabah+"/"+input)) {
                System.out.println(nasabah.getNoUnikNasabah());

            }
        }

        boolean cekProduk = true;
        while (cekProduk){
            System.out.print("Masukan Nama Produk                 : ");
            inputNamaProduct = scan.nextLine();

            for(Product p : listProduct){
                String namaProduct = p.getNamaProduct();
                String namaProductBaru = inputNamaProduct;
                if(namaProduct.equals(namaProductBaru)){
                    cekProduk = false;
                    break;
                }else {
                    cekProduk = true;
                }
            }

            for(Product p : listProduct){
                String namaProduct = p.getNamaProduct();
                String namaProductBaru = inputNamaProduct;
                if(namaProduct.equals(namaProductBaru)){
                    if (p.getJenisProduct().equals(JenisProduct.kesehatan) || p.getJenisProduct().equals(JenisProduct.jiwa)) {
                        tambahPersonalPolis(inputNomorCustomer,namaProductBaru);
                    }else{
                        tambahCarPolis(inputNomorCustomer,namaProductBaru);
                    }
                }
            }
        }
    }

    public static void DataProduct(){
        Scanner scan = new Scanner(System.in);
        Product sehatBersama = new Product("Sehat Bersama",JenisProduct.kesehatan,FrekuensiPembayaran.bulanan,"Claim perawatan kelas 1",KetentuanPembelianProduct.keluarga,200000,400000);
        Product sehatExtra = new Product("Sehat Extra",JenisProduct.kesehatan,FrekuensiPembayaran.bulanan,"Claim perawatan kelas VIP", KetentuanPembelianProduct.sendiri,300000,500000);
        Product lifeKeluarga = new Product("Life Keluarga",JenisProduct.jiwa,FrekuensiPembayaran.bulanan,"Mendapatkan 500.000.000 apabila terjadi sesuatu pada tertanggung", KetentuanPembelianProduct.keluarga,250000,450000);
        Product lifeSpecial = new Product("Life Special",JenisProduct.jiwa,FrekuensiPembayaran.tahunan,"Mendapatkan 800.000.000 apabila terjadi sesuatu pada tertanggung", KetentuanPembelianProduct.sendiri,3600000,4800000);
        Product protection = new Product("Protection",JenisProduct.kendaraan,FrekuensiPembayaran.tahunan,"Mendapat ganti rugi sampai 100.000.000 bila terjadi sesuatu", KetentuanPembelianProduct.kendaraan,2000000,2000000);
        Product protectionPlus = new Product("Protection Plus",JenisProduct.kendaraan,FrekuensiPembayaran.tahunan,"Mendapat ganti rugi total lost apa bila terjadi sesuatu", KetentuanPembelianProduct.kendaraan,2500000,2500000);
        listProduct = new LinkedList<>();
        listProduct.add(sehatBersama);
        listProduct.add(sehatExtra);
        listProduct.add(lifeKeluarga);
        listProduct.add(lifeSpecial);
        listProduct.add(protection);
        listProduct.add(protectionPlus);
    }
//            List<Polis> polisList = new LinkedList<>();
//            if (pro.getNamaProduct().equals(choise) || pro.getNamaProduct().equals("sehat bersama") || pro.getNamaProduct().equals("Sehat Bersama")){
//                Polis polis = new Polis();
//                System.out.println("pilih nomor Customer tertanggung");
//                String tertanggung = scan.nextLine();
//                for (Nasabah nasabah : listProspect) {
//                    int bulan = LocalDate.now().getMonthValue();
//                    int tahun = LocalDate.now().getYear();
//                    String nomorNasabah = String.format("%d/%d",bulan,tahun);
//                    if (nasabah.getNoUnikNasabah().equals(tertanggung) || nasabah.getNoUnikNasabah().equals(nomorNasabah+"/"+tertanggung)) {
//                        polis.setPemilik(nasabah.getFirtsName()+" "+nasabah.getLastName());
//                        polis.setTertanggung(new LinkedList<Nasabah>(Arrays.asList(new Polis[] {})));
//                    }
//                }
//            }

    public static void tambahPersonalPolis(String inputNomorCustomer, String inputNamaProduct){
        PersonalPolis polisDiri = new PersonalPolis();
        String inputNomorTertanggung="";
        Scanner scan = new Scanner(System.in);
        boolean cekNomorTertanggung = true;
        while (cekNomorTertanggung){
            try{
                System.out.print("Nomor Tertanggung                   : ");
                inputNomorTertanggung = scan.nextLine();
                cekNomorTertanggung = false;


                for(Nasabah nasabah : listProspect){
                    int bulan = LocalDate.now().getMonthValue();
                    int tahun = LocalDate.now().getYear();
                    String nomorNasabah = String.format("%d/%d",bulan,tahun);
                    if(nasabah.getNoUnikNasabah().equals(inputNomorTertanggung) ||
                            nasabah.getNoUnikNasabah().equals(nomorNasabah+"/"+inputNomorTertanggung)){
                        cekNomorTertanggung = false;
                        break;
                    }else {
                        scan.nextLine();
                        cekNomorTertanggung = true;
                    }
                }


                for(Product p : listProduct){
                    String namaProduct = p.getNamaProduct().toUpperCase();
                    if(namaProduct.equals(inputNamaProduct)){
                        if (p.getKetentuanProduct().equals(KetentuanPembelianProduct.sendiri)) {
                            if(inputNomorCustomer.equals(inputNomorTertanggung)){
                                cekNomorTertanggung = false;
                            }else {
                                System.out.println("maaf nasabah/customer hanya boleh menanggung diri sendiri");
                                cekNomorTertanggung = true;
                            }
                        }else{
//                            scan.nextLine();
                            cekNomorTertanggung = false;
                        }
                    }
                }
            }catch (Exception e) {
                scan.nextLine();
                System.out.println("\nAPLIKASI TIDAK BISA MERESPON INPUT, SILAHKAN COBA LAGI.\n");
                cekNomorTertanggung = true;
            }
        }

        polisDiri.setNomorNasabah(inputNomorCustomer);
        polisDiri.setProduct(inputNamaProduct);
        polisDiri.setTertanggung(inputNomorTertanggung);
        polisDiri.setTanggalMulai(LocalDate.now());

        listPersonalPolis.add(polisDiri);
        polisDiri.setListPolisDiri(listPersonalPolis);
        System.out.println("data berhasil ditambahkan");
        setProspect();
    }
    public static void tambahCarPolis(String inputNomorCustomer, String inputNamaProduct){
        CarPolis carPolis = new CarPolis();
        Scanner scan = new Scanner(System.in);
        System.out.print("Jenis Kendaraan                     : "); String jenisKendaraan = scan.nextLine();
        System.out.print("Nomor Polisi                        : "); String nomorPolisi = scan.nextLine();
        System.out.print("Nomor STNK                          : "); String nomorSTNK = scan.nextLine();
        System.out.print("Merk Kendaraan                      : "); String merkKendaraan = scan.nextLine();
        System.out.print("Model Kendaraan                     : "); String modelKendaraan = scan.nextLine();
        System.out.print("Warna Kendaraan                     : "); String warnaKendaraan = scan.nextLine();

        carPolis.setNomorNasabah(inputNomorCustomer);
        carPolis.setProduct(inputNamaProduct);
        carPolis.setJenisKendaraan(jenisKendaraan);
        carPolis.setNomorPolisi(nomorPolisi);
        carPolis.setNomorSTNK(nomorSTNK);
        carPolis.setMerkKendaraan(merkKendaraan);
        carPolis.setModelKendaraan(modelKendaraan);
        carPolis.setWarnaKendaraan(warnaKendaraan);
        carPolis.setTanggalMulai(LocalDate.now());

        listCarPolis.add(carPolis);
        carPolis.setListCarPolis(listCarPolis);
        System.out.println("data berhasil ditambahkan");
        setProspect();

    }
}
