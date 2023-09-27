package day11NestedİfStatement;

import java.util.Scanner;

public class p01NestedİfÖrnek {
    public static void main(String[] args) {
        // kullanıcının eytlı olup olmadıgını tespit eden ve emeklı olup olmadıgını yazdırın.
        // olamıyorsa kaç prin gün eksıklıgı oldugunu yazdırın.
        // kurallar;
        // a.1999 yılı 9.ay öncesi işe başlamış olmak
        // b.kadınlar: 5000 prim günü,20 yıl hizmet süresi
        // c: erkekler:5500 prim günü.25 yıl hizmet süresi

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen işe giriş tarihinizi yıl ve ay olarak 1999.09 şeklinde giriniz");
        double giriş = scanner.nextDouble();

        if (giriş > 1999.09) {
            System.out.println("eyt kanun düzenlemesine tabi değilisiniz");

        } else {
            System.out.print("Lütfen cinsiyetinizi K veya E olarak giriniz");
            char cinsiyet = scanner.next().charAt(0);
            System.out.print("Lütfen prim gün sayisini giriniz");
            int prim = scanner.nextInt();
            System.out.println("lütfen hizmet yıl sürenizi girermisiniz");
            int hizmetYılı = scanner.nextInt();

            if (cinsiyet == 'k' || cinsiyet == 'K') {
                if (prim >= 5000 && hizmetYılı >= 20) {
                    System.out.println("Emekli olabilirsiniz");
                } else if (prim < 5000 && hizmetYılı >= 20) {
                    System.out.println("Emekli olabilmek için " + (5000 - prim) + " gün daha çalışmalısınız");
                } else if (prim >= 5000 && hizmetYılı < 20) {
                    System.out.println("emekli olanilmek için " + (20 - hizmetYılı) + " yıl daha çalişmalisiniz");
                } else {
                    System.out.println("malesef emeklilik şartlarının ikisinide sağlamıyorsunuz");


                }
            }else if (cinsiyet == 'E' || cinsiyet == 'e') {
                        if (prim >= 5500 && hizmetYılı >= 25) {
                            System.out.print("emekli olabilirsiniz");
                        } else if (prim < 5500 && hizmetYılı >= 25) {
                            System.out.print("emekli olabilmek için " + (5500 - prim) + " gün daha çalışmalısınız");

                        } else if (prim >= 5500 && hizmetYılı < 25) {
                            System.out.print("emekli olabilmek için " + (25 - hizmetYılı) + " yıl daha çalışmalısınız ");
                        } else {
                            System.out.println("malesef emeklilik şartlarının ikisinide sağlamıyorsunuz");

                        }
                    } else {
                        System.out.println("yanliş bir değer girdiniz");
                    }
                }
                }
            }




