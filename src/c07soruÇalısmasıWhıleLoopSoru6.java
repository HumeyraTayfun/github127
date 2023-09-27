import java.util.Scanner;

public class c07soruÇalısmasıWhıleLoopSoru6 {
    public static void main(String[] args) {

        //SORU-6 Kullanıcıdan sürekli olarak tam sayılar girmesini isteyin. Kullanıcı 0 girdiğinde,
        // şimdiye kadar girilen tüm tam sayıların ortalamasını
        // ekrana yazdırın ve programı sonlandırın. Bu programı bir while döngüsü kullanarak nasıl yazarsınız?


        Scanner scanner = new Scanner(System.in);
        int sayı = 2;
        //int ortalama = 0;
        int toplam = 0;
        int adet = 0;
        while (sayı != 0) {

            System.out.println("sürekli olarak tam sayı giriniz ve bitirmek için 0 a basınız");

            sayı = scanner.nextInt();
            if (sayı != 0) {
                toplam += sayı;
                adet++;

            }
        }
           int ortalama = toplam / adet;
            System.out.println((double) ortalama);
        }
    }

