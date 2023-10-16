package day18marketSorusu;

import java.util.Scanner;

public class c01wiseT127Market {
   // ======= WISE T127 MARKET=======
    // İlk programa girildiğinde bizi bir menü karşılasın bu secenekler
    // 1. Şarküteri ürünleri
    // 2. Manav ürünleri
    // 3. Market ürünleri
    // seçime göre
    // 4. Ürünleri listele ve
    // 5. fiyatları gelsin
    // 6. sonunda fiş yazdırsın
    static Scanner scanner= new Scanner(System.in);
    //static int seçim= scanner.nextInt();
    static String ürünAdı="";
    static int ürünKodu;
    static double ürünFiyatı;
    static int ürünMiktarı;
    static double toplam;
    static String sepet="";
    static boolean ekÜrün= false;

    public static void main(String[] args) {

      girişEkranı();
   }

    private static void girişEkranı() {
        System.out.println("===== WISE T127 MARKET=====");
        System.out.println("===== HOŞGELDİNİZ=====");
        System.out.println("Lütfen yapmak istediğiniz işlemi giriniz");
        System.out.println("Manav için 1 \n Şarküteri için 2 \n Market ürünleri için 3 \n Fiş yazdırmak için 4 \n Çıkış yapmak için 5");
        int seçim=scanner.nextInt();
        if(!(seçim >=1 && seçim <=5)){
            System.out.println("yanliş bir giriş yaptınız. Tekrar deneyiniz");
        }else {
            switch (seçim){
                case 1:
                    manav();
                    break;
                case 2:
                    şarküteri();
                    break;
                case 3:
                    market();
                    break;
                case 4:
                    fişyazdır();
                case 5:
                    çıkış();
                    break;
                default:


            }
        }

    }

    private static void manav() {
        System.out.println("manav reyonuna hoşgeldiniz");
        System.out.println("Lütfen almak istediğiniz ürünün ürün kodunu giriniz");
        System.out.println("Elma fiyatı: 25 TL ÜK: 11 \n Yerli Muz fiyatı: 40 TL ÜK:12 \n Domates fiyatı:20 TL ÜK:13 \n" +
                "Çilek fiyatı:100 TL ÜK:14 \n Karnabahar fiyatı:50 TL ÜK:15 ");
        while (!ekÜrün){
            ürünKodu=scanner.nextInt();
            if (ürünKodu>=11 && ürünKodu<=15){
                System.out.println("Kaç kg alacaksınız");
                ürünMiktarı=scanner.nextInt();
                switch (ürünKodu){
                    case 11:
                        ürünAdı="Elma";
                        ürünFiyatı= 25;
                        System.out.println(ürünMiktarı + "kg"+ ürünAdı + "fiyatı:"+ ürünFiyatı*ürünMiktarı + "TL'dir.");
                        break;
                    case 12:
                        ürünAdı="Yerli muz";
                        ürünFiyatı= 40;
                        System.out.println(ürünMiktarı + "kg" + ürünAdı + "fiyatı:" + ürünFiyatı*ürünMiktarı + "TL'dir.");
                        break;
                    case 13:
                        ürünAdı="Domates";
                        ürünFiyatı=20;
                        System.out.println(ürünMiktarı + "kg" + ürünAdı + "fiyatı:" + ürünFiyatı*ürünMiktarı + "TL'dir.");
                        break;
                    case 14:
                        ürünAdı="Çilek";
                        ürünFiyatı=100;
                        System.out.println(ürünMiktarı + "kg" + ürünAdı + "fiyatı:" + ürünFiyatı*ürünMiktarı + "TL'dir");
                        break;
                    case 15:
                        ürünAdı="Karnabahar";
                        ürünFiyatı=50;
                        System.out.println(ürünMiktarı + "kg" + ürünAdı + "fiyatı:" + ürünFiyatı*ürünMiktarı+ "TL'dir");
                        break;
                   // default:
                      //  System.out.println("Ana menüye dönmek için 0'a basınız");
                       // girişEkranı();
                }
                toplam+=ürünFiyatı*ürünMiktarı;
                System.out.println("sepet tutarı:"+toplam);
                sepet+=ürünAdı + " : " + ürünFiyatı+"\n";
                System.out.println(sepet);
                System.out.println("ürün eklemek için kod giriniz.Ana menüye dönmek için 0'a basınız");
            }else if(ürünKodu==0){
                girişEkranı();

            }
        }
    }

    private static void şarküteri() {
        System.out.println("şarküteri reyonuna hoşgeldiniz");
    }

    private static void market() {
        System.out.println("Market reyonuna hoşgeldiniz");
    }

    private static void fişyazdır() {
        System.out.println("fiş yazdırılıyor");
    }

    private static void çıkış() {
        System.out.println("Çıkış yapılıyor");
    }


}


