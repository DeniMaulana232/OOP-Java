package com.company;

import java.time.LocalDate;

public class Person {
    private String firtsName;
    private String lastName;
    private LocalDate tglLahir;
    private String tempatLahir;
    private Gender gender;
    private String pekerjaan;

    public Person (){

    }
    public Person(String firtsName, String lastName, LocalDate tglLahir, String tempatLahir, Gender gender,String pekerjaan) {
        this.firtsName = firtsName;
        this.lastName = lastName;
        this.tglLahir = tglLahir;
        this.tempatLahir = tempatLahir;
        this.gender = gender;
        this.pekerjaan = pekerjaan;
    }

    public String getFirtsName() { return firtsName; }
    public void setFirtsName(String firtsName) { this.firtsName = firtsName; }
    public String getLastName() {return lastName;}
    public void setLastName(String lastName) { this.lastName = lastName; }
    public LocalDate getTglLahir() { return tglLahir;}
    public void setTglLahir(LocalDate tglLahir) { this.tglLahir = tglLahir; }
    public String getTempatLahir() { return tempatLahir; }
    public void setTempatLahir(String tampatLahir) { this.tempatLahir = tampatLahir; }
    public Gender getGender() { return gender; }
    public void setGender(Gender gender) { this.gender = gender; }
    public String getPekerjaan() { return pekerjaan; }
    public void setPekerjaan(String pekerjaan) { this.pekerjaan = pekerjaan; }

    public void PrintBiodata(){
        System.out.println("First Nama: " + this.firtsName);
        System.out.println("Last Nama: " + this.lastName);
        System.out.println("Gender: " + this.gender.getJenisKelamin());
        System.out.println("Tanggal Lahir: " + this.tglLahir);
        System.out.println("Tempat Lahir: " + this.tempatLahir);
        System.out.println("Pekerjaan: " + this.pekerjaan);
    }

}
