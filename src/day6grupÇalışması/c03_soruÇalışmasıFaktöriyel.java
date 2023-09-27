package day6grupÇalışması;

import java.util.Scanner;

public class c03_soruÇalışmasıFaktöriyel {
    public static void main(String[] args) {
        // Soru 6-Kullanicidan 20’den kucuk bir sayi alip, bu sayinin faktoryel degerini
        // hesaplayin. Konsolda faktoryel hesabinin yapilisini da yazdirin.
        // Or : 6! = 6 * 5 * 4 * 3 * 2 * 1 = 720

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen 20den küçük bir pozitif tam sayi girin");
        int sayı = scanner.nextInt();
        int faktöriyelSonuç = 1;
        System.out.print(sayı+" != ");
        for (int i = sayı; i >=1 ; i--) {
            faktöriyelSonuç *=i;
            if (i!=1){
                System.out.print(i+"*");

            }else {
                System.out.print(i+"=");
                System.out.print((faktöriyelSonuç));
            }



        }


        }


    }

