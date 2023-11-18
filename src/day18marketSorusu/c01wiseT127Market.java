package day18marketSorusu;

import java.util.InputMismatchException;
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
    static String fis ="";


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
        System.out.println("Şarküteri Reyonuna Hoşgeldiniz\n" +
                "Lütfen Satın Almak İstediğiniz Ürünün Kodunu Giriniz\n" +
                "\n" +
                "Ürün Kodu : 21 - Kıyma Fiyatı : 250 ₺\n" +
                "Ürün Kodu : 22 - Peynir Fiyatı : 200 ₺\n" +
                "Ürün Kodu : 23 - Süt Fiyatı : 25 ₺\n" +
                "Ürün Kodu : 24 - Yumurta Fiyatı : 90 ₺\n" +
                "Ürün Kodu : 25 - Yoğurt Fiyatı : 30 ₺\n" +
                "\n" +
                "Ana Menüye Dönmek İçin 0(sıfır)'a basınız");
        System.out.print("Seçiminiz : ");

        while (!ekÜrün){
            try {
                ürünKodu= scanner.nextInt();

                if (ürünKodu >= 21 && ürünKodu <= 25){
                    System.out.println("Kaç kg/lt/koli almak istersiniz?");

                    ürünMiktarı=scanner.nextInt();
                    switch (ürünKodu){
                        case 21 :
                           ürünAdı="Kıyma";
                          ürünFiyatı=250;
                            System.out.println(ürünMiktarı + "kg " +ürünAdı + " Fiyatı : " + ürünFiyatı*ürünMiktarı + "₺");
                            break;
                        case 22 :
                            ürünAdı="Peynir";
                            ürünFiyatı=200;
                            System.out.println(ürünMiktarı + "kg " + ürünAdı + " Fiyatı : " + ürünFiyatı*ürünMiktarı + "₺");
                            break;
                        case 23 :
                            ürünAdı="Süt";
                           ürünFiyatı=25;
                            System.out.println(ürünMiktarı + "lt " + ürünAdı + " Fiyatı : " + ürünFiyatı*ürünMiktarı + "₺");
                            break;
                        case 24 :
                         ürünAdı="Yumurta";
                         ürünFiyatı=90;
                            System.out.println(ürünMiktarı + "koli " +ürünAdı + " Fiyatı : " + ürünFiyatı*ürünMiktarı + "₺");
                            break;
                        case 25 :
                            ürünAdı="Yoğurt";
                            ürünFiyatı=30;
                            System.out.println(ürünMiktarı + "kg " + ürünAdı + " Fiyatı : " + ürünFiyatı*ürünMiktarı + "₺");
                            break;
                    }
                    ürünFiyatı=ürünFiyatı*ürünMiktarı;
                    toplam+=ürünFiyatı;
                    System.out.println("Toplam Sepet Tutarı : " + toplam);
                    sepet+=ürünAdı+" fiyatı : "+ürünFiyatı+" ₺";
                    fis+=ürünMiktarı+" "+ürünAdı+" "+ürünFiyatı + " " + "\n";
                    System.out.println("Başka ürün almak isterseniz lütfen kodunu giriniz.\n" +
                            "Ana Menüye Dönmek İçin 0(sıfır)'a basınız");
                }else if (ürünKodu==0){
                    girişEkranı();
                }else {
                    System.out.println("Hatalı Giriş Yaptınız, Lütfen Tekrar Deneyin");
                    System.out.print("Seçiminiz : ");
                    scanner.nextLine();
                }
            } catch (InputMismatchException e) {
                System.out.println("Hatalı giriş yaptınız, lütfen tekrar deneyin.+++");
                scanner.next();
                şarküteri();
            }
        }
    }

    private static void market() {
        System.out.println("Market Reyonuna Hoşgeldiniz\n" +
                "Lütfen Satın Almak İstediğiniz Ürünün Kodunu Giriniz\n" +
                "\n" +
                "Ürün Kodu : 31 - Cips Fiyatı : 25 ₺\n" +
                "Ürün Kodu : 32 - Kola Fiyatı : 45 ₺\n" +
                "Ürün Kodu : 33 - Ayçiçek Yağı : 200 ₺\n" +
                "Ürün Kodu : 34 - Tuvalet Kağıdı Fiyatı : 150 ₺\n" +
                "Ürün Kodu : 35 - Deterjan Fiyatı : 130 ₺\n" +
                "\n" +
                "Ana Menüye Dönmek İçin 0(sıfır)'a basınız");
        System.out.print("Seçiminiz : ");

        while (!ekÜrün){
            try {
                ürünKodu = scanner.nextInt();

                if (ürünKodu >= 31 && ürünKodu <= 35){
                    System.out.println("Kaç kg/lt/koli almak istersiniz?");

                    ürünMiktarı=scanner.nextInt();
                    switch (ürünKodu){
                        case 31 :
                            ürünAdı="Cips";
                            ürünFiyatı=25;
                            System.out.println(ürünMiktarı + "paket " + ürünAdı + " Fiyatı : " + ürünFiyatı*ürünMiktarı + "₺");
                            break;
                        case 32 :
                            ürünAdı="Kola";
                           ürünFiyatı=45;
                            System.out.println(ürünMiktarı + "adet " + ürünAdı + " Fiyatı : " + ürünFiyatı*ürünMiktarı + "₺");
                            break;
                        case 33 :
                           ürünAdı="Ayçiçek Yağı";
                            ürünFiyatı=200;
                            System.out.println(ürünMiktarı + "lt " + ürünAdı + " Fiyatı : " + ürünFiyatı*ürünMiktarı + "₺");
                            break;
                        case 34 :
                            ürünAdı="Tuvalet Kağıdı";
                            ürünFiyatı=150;
                            System.out.println(ürünMiktarı+ "koli " +ürünAdı + " Fiyatı : " + ürünFiyatı*ürünMiktarı + "₺");
                            break;
                        case 35 :
                            ürünAdı="Deterjan";
                            ürünFiyatı=130;
                            System.out.println(ürünMiktarı + "kg " + ürünAdı + " Fiyatı : " + ürünFiyatı*ürünMiktarı + "₺");
                            break;
                    }
                    ürünFiyatı=ürünFiyatı*ürünMiktarı;
                    toplam+=ürünFiyatı;
                    System.out.println("Toplam Sepet Tutarı : " + toplam);
                    sepet+=ürünAdı+" fiyatı : "+ürünFiyatı+" ₺";
                    fis+=ürünMiktarı+" "+ürünAdı+" "+ürünFiyatı + " " + "\n";
                    System.out.println("Başka ürün almak isterseniz lütfen kodunu giriniz.\n" +
                            "Ana Menüye Dönmek İçin 0(sıfır)'a basınız");
                }else if (ürünKodu==0){
                   girişEkranı();
                }else {
                    System.out.println("Hatalı Giriş Yaptınız, Lütfen Tekrar Deneyin");
                    System.out.print("Seçiminiz : ");
                    scanner.nextLine();
                }
            } catch (InputMismatchException e) {
                System.out.println("Hatalı giriş yaptınız, lütfen tekrar deneyin.+++");
                scanner.next();
                market();
            }
        }
    }

    private static void fişyazdır() {
        System.out.println("Fişiniz : \n" +
                fis+" \n" +
                "Toplam Tutar : "+ toplam + "₺\n" +
                " \n" + "Bizi Tercih Ettiğiniz İçin Teşekkür Ederiz!");

        String fiscikis = "Ana Menüye Dönmek İçin 0(sıfır)'a Basınız\n" +
                "Çıkmak İçin 1'e Basınız";
        System.out.println(fiscikis);

        while (true) {
            System.out.print("Seçiminiz : ");
            try {
                int secim = scanner.nextInt();
                if (secim == 0) {
                    girişEkranı();
                    break;
                } else if (secim == 1) {
                    çıkış();
                    break;
                } else {
                    System.out.println("Hatalı Giriş Yaptınız, Lütfen Tekrar Deneyin");
                }
            } catch (InputMismatchException e) {
                System.out.println("Hatalı Giriş Yaptınız, Lütfen Tekrar Deneyin");
                scanner.next();
            }
        }
    }


    private static void çıkış() {
        System.exit(0);
        System.out.println("Çıkış yapılıyor");
    }


}


