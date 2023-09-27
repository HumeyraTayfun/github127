package day13SwitchStatements;

import java.util.Scanner;

public class p01SwitchAlıştırma {
    public static void main(String[] args) {
        // kullanıcıdan bir rakam alıp rakamı yazıyla yazdırın

        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen bir rakam giriniz (0-9 arasında)");
        int rakam=scanner.nextInt();

        switch (rakam){
            case 0:
                System.out.println("sıfır");
                break;
            case 1:
                System.out.println("bir");
                break;
            case 2:
                System.out.println("iki");
                break;
            case 3:
                System.out.println("üç");
                break;
            case 4:
                System.out.println("dört");
                break;
            case 5:
                System.out.println("beş");
                break;
            case 6:
                System.out.println("altı");
                break;
            case 7:
                System.out.println("yedi");
                break;
            case 8:
                System.out.println("sekiz");
                break;
            case 9:
                System.out.println("dokuz");
                break;
            default:
                System.out.println("yanlış bir değer girdiniz");

        }


    }
}
