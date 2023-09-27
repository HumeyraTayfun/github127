package day8alıstırma;

import java.util.Scanner;

public class c01alıstırma {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen içinde java kelimesinin geçtiği bir metin giriniz");
        String metin = scanner.nextLine();


        if (metin.toLowerCase().contains("java")) {
            int javaIndex = metin.toLowerCase().indexOf("java");
            String beforeJava = metin.substring(0, javaIndex) + "*";
            String bulunanJava = metin.substring(javaIndex, javaIndex + 4);
            String afterJava = "*" + metin.substring(javaIndex + 4);
            metin = beforeJava + bulunanJava + afterJava;
            System.out.println("(" + metin + ")");
            System.out.println(beforeJava);
            System.out.println(afterJava);
        }
    }
}