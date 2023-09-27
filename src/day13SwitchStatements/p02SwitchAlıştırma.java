package day13SwitchStatements;

import java.util.Scanner;

public class p02SwitchAlıştırma {
    public static void main(String[] args) {
        // kullanıcıdan iki basmaklı bir sayı alınız girilen sayının onlar basamagını yazı ile yazdırın

        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen iki basmaklı tam sayı giriniz");
        int sayı= scanner.nextInt();
        if(sayı>=10 && sayı<=99){
            int birlerBasamağı= sayı % 10;
            int onlarBasamağı= sayı/10;
            switch (onlarBasamağı){
                case 1:
                    System.out.println("on");
                    break;
                case 2:
                    System.out.println("20");
                    break;
                case 3:
                    System.out.println("30");
                    break;
                case 4:
                    System.out.println("40");
                    break;
                case 5:
                    System.out.println("50");
                    break;
                case 6:
                    System.out.println("altmış");
                    break;
                case 7:
                    System.out.println("yetmiş");
                    break;
                case 8:
                    System.out.println("seksen");
                    break;
                case 9:
                    System.out.println("90");
                    break;
                default:
                  //  System.out.println("yanlış değer girdiniz");
            }
        }
        System.out.println("yanlış değer girdiniz");
    }
}
