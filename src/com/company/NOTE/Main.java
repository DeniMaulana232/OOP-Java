package com.company.NOTE;

import com.company.ENUM.ERole;
import com.company.ENUM.History;
import com.company.ENUM.Ticket;
import com.company.ENUM.Urgency;

import java.security.KeyStore;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Role role = new Role(ERole.admin, Urgency.H, Ticket.progress, History.ontime);

//        String firstLine = "SRQ";
//
//        LocalDate today = LocalDate.now();
//        LocalDate tanggalLahir = LocalDate.of(2021, Month.APRIL, 21);
//
//
//        System.out.println(firstLine);
//        int middleLine ;
////        System.out.println(middleLine);
//
//        LocalDate max = LocalDate.MAX;
//
//        long yearsPeriod = ChronoUnit.DAYS.between(tanggalLahir, today);
//        System.out.println(yearsPeriod);
//
//        for (int i = 1; i <= yearsPeriod; i++) {
//
//            for (middleLine = LocalDate.now().getYear(); i >= yearsPeriod; middleLine++) {
//                if(i == yearsPeriod){
//                    i = 1;
//                }
//                System.out.println(middleLine);
//            }
////            System.out.println(String.format("%s/%s/%d", firstLine, middleLine, i));
//
//        }
        tes();

    }


    public static void  tes(){
        LocalDate newYear = LocalDate.of(2001, 1, 1);
        Locale indonesia = new Locale("id", "ID");
        DateTimeFormatter indoFormat = DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy", indonesia);
        System.out.println(indoFormat.format(newYear));

    }

    
    
    


    public static void  GenerateIdTicket(){

    }
}
