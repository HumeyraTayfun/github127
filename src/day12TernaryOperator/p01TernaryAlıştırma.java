package day12TernaryOperator;

import java.util.Scanner;

public class p01TernaryAlıştırma {
    public static void main(String[] args) {
        // kullanıcıdan bir üçgenin üç kenar uzunluğunu alın,üçgen eşkenar ise
        //"eşkenar üçgen"yazdırın.degilse "eşkenar üçgen değildir" yazdırın

        Scanner scanner= new Scanner(System.in);
        System.out.println("lütfen üçgenin kenar uzunluklarını giriniz");
        System.out.print("1. kenar: ");
        double kenar1=scanner.nextDouble();
        System.out.print(" 2.kenar: ");
        double kenar2=scanner.nextDouble();
        System.out.print("3.kenar: ");
        double kenar3=scanner.nextDouble();
        System.out.println(kenar1>0 && kenar2>0 && kenar3>0 ? kenar1== kenar2 && kenar2==kenar3 ? "üçgen eşkenar üçgendir" :"üçgen eşkenar üçgen değildir": "yanlış değer girdiniz");

    }
}
