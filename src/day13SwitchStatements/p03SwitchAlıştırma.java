package day13SwitchStatements;

import java.util.Scanner;

public class p03SwitchAlıştırma {
    public static void main(String[] args) {
        // kullanıcıdan yılı ve ay numarasını alıp,o yıldaki o ayda kaç gün olduğunu yazdırın

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen bilgi istediğiniz yılı girin");
        int year=scanner.nextInt();
        System.out.println("gün sayısını aradığınız ayın numarasını giriniz");
        int numDays;
        int numMonths =scanner.nextInt();
        switch (numMonths){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numDays=31;
                System.out.println("girdiğiniz aydaki gün sayisi: 31 ");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numDays=30;
                System.out.println("girdiğiniz aydaki gün sayısı:30");
                break;
            case 2:
                numDays=(year % 4==0 && !(year % 100==0)|| year % 400==0) ? 29 : 28;
                System.out.println("girdiğiniz aydaki gün sayısı:"+ numDays);
                break;
            default:
                System.out.println("Geçersiz bir ay numarasi girdiniz");

        }
    }
}
