package day8alıstırma;

import java.util.Scanner;

public class c02Alıştırma2 {
    public static void main(String[] args) {
       // Kullanıcıdan bir metin alınız.. Eğer metnin ilk 5 karakteri "merha" ise ekrana
        // "Merhaba, nasılsınız?" yazdırın. Eğer bu şarta uymuyorsa ekrana "Tanınmayan kelime" yazdırın.


    Scanner scanner= new Scanner(System.in);
        System.out.println("Lütfen bir metin giriniz");
                String metin= scanner.nextLine();
                int merhaİndex=metin.toUpperCase().indexOf("merha");
                if (metin.toLowerCase().contains("merha")){
                System.out.println("merhaba, Nasılsınız?");

                }else{
                System.out.println("Tanınmayan kelime");
                }
                }

                }