package day6grupÇalışması;

import java.util.Scanner;

public class c04soruÇalışmasıforLoop {

    public static void main(String[] args) {
        //Soru 2-Kullanicidan main method icinde  ayri ayri isim ve soyismini alin
        // Isim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak sekilde duzenleyip,
        //isim bosluk soyisim seklinde bize donduren bir method olusturun
        // input: isim : Ali  soyisim :YILMAZ.     output : Ali Yilmaz

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen isminizi giriniz");
        String isim = scanner.nextLine();

        System.out.println("lütfen soy isminizi giriniz");
        String soyisim = scanner.nextLine();
        String isimSoyisim=değiştir(isim, soyisim);
        System.out.println("düzenlenmiş isim soyisim=" + isimSoyisim );
    }

    public static String değiştir(String isim,String soyisim) {

        isim = isim.substring(0, 1).toUpperCase()+isim.substring(1).toLowerCase();
        soyisim = soyisim.substring(0, 1).toUpperCase() + soyisim.substring(1).toLowerCase();

       return isim +" "+soyisim;



    }



    }

// YAPABİLDİM

