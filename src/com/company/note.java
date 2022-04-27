package com.company;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.BlockingDeque;

public class note {


    public static void main(String[] args) {

        HashMap<Integer, String> kumpulanHewan = new HashMap<>();
        kumpulanHewan.put(1,"gajah");
        kumpulanHewan.put(2,"kucing");
        kumpulanHewan.put(3,"burung");
        System.out.println(kumpulanHewan(kumpulanHewan));

    }





    public static String kumpulanHewan(HashMap<Integer, String> kumpulanHewan ){
        String hasil = "";
        for (Map.Entry value : kumpulanHewan.entrySet()) {
            if (value.getValue().equals("burung")){
                hasil = value.getValue().toString();
            }
        }
        return hasil;
    }




//     System.out.println("====================================================================================\n");
//                    for (Nasabah pr : listProspect) {
//
//        System.out.printf("\nNo: %d %s %s %s %s (%s), %s, %s ", pr.getNomorUnik(), pr.getFirtsName(),
//                pr.getLastName(), pr.getGender().getJenisKelamin(), pr.getTglLahir(), pr.getTempatLahir(),
//                pr.getPekerjaan(), pr.getStatus().getStatus());
//    }
//                    System.out.println("\n\n====================================================================================\n");
//
//     for (int i = listProspect.size(); i <= listProspect.size(); i++) {
//        Prospect prospect = new Nasabah();
//
//        prospect.setNomorUnik(i + 1);
//        scan.nextLine();
//        System.out.println("Masukan Nama Depan: ");
//        String firstName = scan.nextLine();
//        prospect.setFirtsName(firstName);
//
//        System.out.println("Masukan Nama Belakang: ");
//        String LastName = scan.nextLine();
//        prospect.setLastName(LastName);
//
//        System.out.println("Masukan Tahun Lahir : ");
//        int tahunLahir = scan.nextInt();
//        System.out.println("Masukan Bulan Lahir : ");
//        int bulanLahir = scan.nextInt();
//        System.out.println("Masukan Hari Lahir : ");
//        int hariLahir = scan.nextInt();
//        prospect.setTglLahir(LocalDate.of(tahunLahir, bulanLahir, hariLahir));
//        scan.nextLine();
//
//        System.out.println("Masukan Tempat Lahir: ");
//        String tempatLahir = scan.nextLine();
//        prospect.setTempatLahir(tempatLahir);
//        System.out.println("Masukan Gender: (L/P) ");
//        String jk = scan.nextLine();
//        prospect.setGender(Gender.valueOf(jk));
//
//        System.out.println("Masukan Pekerjaan: ");
//        String pekerjaan = scan.nextLine();
//        prospect.setPekerjaan(pekerjaan);
//        prospect.setStatus(Status.P);
////
//        Nasabah nasabah = (Nasabah) prospect;
//        listProspect.add(nasabah);
//        nasabah.setListNasabah(listProspect);
//
//        System.out.println("Input lagi? (Y/N)");
//        String confirm = scan.nextLine();
//        if (confirm.equals("y") || confirm.equals("Y")) {
//            continue;
//        } else {
//            validateInput = false;
//            break;
//        }
//    }
}
