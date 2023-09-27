package day6grupÇalışması;

import java.util.Objects;
import java.util.Scanner;

public class c0_2soruPractice2 {
    public static void main(String[] args) {
        // kullanıcıdan bir harf isteyin kullanıcı a yazarsa aile,
        // i yazarsa İş yazdırın. bu harflerın dısında bir harf girerse "bu harfi tanımıyorum yazdırın

        Scanner scanner= new Scanner(System.in);
        System.out.println("Lütfen bir harf giriniz");
        char girilenHarf= scanner.next().charAt(0);
        String harf= girilenHarf +"";
        if((harf.toLowerCase().equals("a"))) {
            System.out.println("Aile");
        } else if (harf.equalsIgnoreCase("i")){
            System.out.println("İş");
        }else{
            System.out.println("bu harfi tanımıyorum");// BÜYÜK KUCUK HARF GÖZETMEK ISTEMIYORSAK IGNORE CASE DE OLUR
            // LOWERDA OLUR UPPERDA OLUR

        }

    }

}
