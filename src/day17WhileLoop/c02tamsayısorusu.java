package day17WhileLoop;

import java.util.Scanner;

public class c02tamsayısorusu {
    // Soru 1- Kullanicidan 4 basamakli pozitif bir tamsayi alip rakamlar toplamini bulalim
    //While loop ile çözümü
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen dört basamaklı pozitif bir tamsayı giriniz");
        int girilenSayı = scanner.nextInt();

        if (girilenSayı >= 1000 && girilenSayı <= 9999) {
            int toplam = 0;
            //while (girilenSayı != 0) {
               // toplam += girilenSayı % 10;
               // girilenSayı /= 10;

            for (int i = 0; i < 4; i++) {

                toplam += girilenSayı % 10;
                girilenSayı /= 10 ;
            }
            System.out.println("girilen sayıların rakamlar toplamı:" + toplam);
        } else {
            System.out.println("lütfen dört basamaklı bir sayı giriniz");
        }
    }
}
