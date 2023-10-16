package day17WhileLoop;

import java.util.Scanner;

public class c01WhileLoopSorusu {
    // "While" loop kullanarak verilen bir String’i terse cevirip
    // bu halini bize donduren bir method olusturun.
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen bir metin giriniz");
        String metin= scanner.nextLine();
        System.out.println(metniTersÇevir(metin));
    }
    public static String metniTersÇevir(String metin){
        String tersMetin="";
        int i=metin.length()-1;
       // int i= uzunluk-1;

        while (i>=0){
           char karakter=metin.charAt(i);
            tersMetin+=karakter;
            i--;

        }
        return tersMetin;
    }
}
