package day12TernaryOperator;

import java.util.Scanner;

public class p02TernaryAlıştırma {
    public static void main(String[] args) {

        // kullanıcıdan notu alın. 50 veya daha büyükse "sınıfı geçtin" 50den küçükse "malesef kaldın" yazdırın

        Scanner scanner=new Scanner(System.in);
        System.out.print("Lütfen yıl sonu notunuzu giriniz");
        double not=scanner.nextDouble();
        System.out.println(not>=50 ? "sınıfı geçtin" : "malesef kaldın");
    }
}
