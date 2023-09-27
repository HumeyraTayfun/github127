package day6grupÇalışması;

import java.util.Scanner;

public class c05soruForLoop {
    public static void main(String[] args) {

        //kullanıcıdan başlangıç ve bitiş degeri olarak pozitif sayılar alın,
        // sınırlar dahil tüm sayıların toplamını yazdırın
        //bitiş degeri baslangıç degerınden küçükse uyarı yazın

        Scanner scanner= new Scanner(System.in);
        System.out.println("Lütfen başlangiç değerini girin");
        int başlangıç=scanner.nextInt();
        System.out.println("Lütfen bitiş değeri girin");
        int bitiş=scanner.nextInt();
        if (bitiş<başlangıç){

            System.out.println("uyarı");
        }else {

        int Toplam=0;
        for (int i =başlangıç; i<=bitiş; i++) {
            Toplam += i;
        }
            System.out.print("baslangıç ve bitiş değerleri dahil olmak üzere toplam=" + Toplam);

            }
        }

    }


