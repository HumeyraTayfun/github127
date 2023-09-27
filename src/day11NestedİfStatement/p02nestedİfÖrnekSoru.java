package day11NestedİfStatement;

import java.util.Scanner;

public class p02nestedİfÖrnekSoru {
    public static void main(String[] args) {
        // kullanıcısan aldıgı ürün adedi ve liste fiyatını alın
        // kullanıcıya müşteri kartı olmadıgını sorun. eger varsa 10 urunden fazla alırsa %20,
        // yoksa %15 indirim yapın. müşteri kartı yoksa 10 üründen fazla alırsa %15,yoksa %10 indieim yapın

        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen almak istediğiniz ürün adedi giriniz");
        int ürünAdedi=scanner.nextInt();
        System.out.println("ürün fiyati"+" ");
        double ürünFiyatı=scanner.nextDouble();
        System.out.println("müşteri kartınız var mı? E/H");
        char müşteriKartı=scanner.next().charAt(0);

        if(müşteriKartı=='E'|| müşteriKartı=='e'){
            if (ürünAdedi>=10){
                System.out.println("%20 indirimli toplam tutar: " + (ürünAdedi* ürünFiyatı)*(0.80));
            }else {
                System.out.println("%15 indirimli toplam tutar: " + (ürünAdedi * ürünFiyatı) * (0.85));
            }
            }else if (müşteriKartı=='H' || müşteriKartı=='h') if (ürünAdedi >= 10) {
                System.out.println("%15 indirimli toplam tutar: " + (ürünAdedi * ürünFiyatı) * (0.85));
            } else {
                System.out.println(" %10 indirimli toplam tutar: " + (ürünAdedi * ürünFiyatı) * (0.9));
            }
        }

    }

