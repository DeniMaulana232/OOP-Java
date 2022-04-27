package com.company;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

public class Prospect extends Person{
    private int nomorUnik;
    private Status status;
    private List<Prospect> prospectList;


    public Prospect(){}

    public Prospect(String firtsName, String lastName, LocalDate tglLahir, String tempatLahir, Gender gender,
                    String pekerjaan, int nomorUnik, Status status)
    {
        super(firtsName, lastName, tglLahir, tempatLahir, gender, pekerjaan );
        this.nomorUnik = nomorUnik;
        this.status = status;
    }

    public int getNomorUnik() { return nomorUnik; }

    public void setNomorUnik(int nomorUnik) { this.nomorUnik = nomorUnik; }

    public Status getStatus() { return status; }

    public void setStatus(Status status) { this.status = status; }

    public List<Prospect> getProspectList() { return prospectList; }

    public void setProspectList(List<Prospect> prospectList) { this.prospectList = prospectList;}


}
