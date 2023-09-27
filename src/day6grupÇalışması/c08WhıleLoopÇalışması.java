package day6grupÇalışması;

import java.util.Scanner;

public class c08WhıleLoopÇalışması {
    //   Kullanıcıdan sürekli olarak tam sayılar girmesini isteyin.
    //  Kullanıcı 0 girdiğinde, şimdiye kadar girilen tüm tam sayıların ortalamasını ekrana yazdırın ve
    //  programı sonlandırın. Bu programı bir while döngüsü kullanarak nasıl yazarsınız?
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int toplam = 0;
        int sayıAdedi = 0;
       // System.out.println("Lütfen pozitif tam sayı giriniz,sıfır girdiğinizde işlem sonlanır");
        int girilenSayı = 2;

        while (girilenSayı != 0) {
            System.out.println("Lütfen pozitif tam sayı giriniz,sıfır girdiğinizde işlem sonlanır");
            girilenSayı = scanner.nextInt();

            if (girilenSayı==0){
               break;
            }
            toplam += girilenSayı;
            sayıAdedi++;



        }

        if (sayıAdedi != 0) {

            double ortalama = (double) toplam / sayıAdedi;

            System.out.print("ortalama=" + ortalama);

        }else {

            System.out.println("yanlış giriş");
        }

    }

}