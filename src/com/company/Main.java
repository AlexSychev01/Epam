package com.company;


import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;



public class Main {

    public static void main(String[] args) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_TIME;


        Scanner scanner = new Scanner(System.in);
        int seconds = scanner.nextInt();
        LocalTime localTime2 = LocalTime.of(00, 00, 00);
        localTime2 = localTime2.plusSeconds(seconds);
        String a =localTime2.format(dateTimeFormatter);
        System.out.println(a);
    }


}
