package day14methodOluşturmaSorusu;

public class c01methodSorusu {
    public static void main(String[] args) {
        // input olarak verılen satıs fıyatı,müsterı kartı var mı?
        // ve üyeliği kaç yıllık ? bilgilerini değerlendirip
        //- üye değilse:%5 indirim
        // -üyeliği var ama 5 yıldan az ise %10 indirim..
        //- üyeliği var ama 5 yıldan çok ise %15 indirim uygulayıp
        // asıl fıyatı, indirim miktarini ve
        // indirimli fiyatı yazdıranbir method oluşturun

        boolean üyeMi = false;
        double satışFiyatı = 250;
        int üyelikYılı = 6;
        indirimliFiyatYazdır(üyeMi, satışFiyatı, üyelikYılı);
    }

    public static void indirimliFiyatYazdır(boolean üyeMi, double satışFiyatı, int üyelikYılı) {

        if (üyeMi) {
            if (üyelikYılı > 5) {
                System.out.println("ürün fiyat=" + satışFiyatı);
                System.out.println("indirim miktarı:" + satışFiyatı * 0.15);
                System.out.println("indirimli fiyatı:" + (satışFiyatı - satışFiyatı * 0.15));
            } else {
                System.out.println("ürün fiyat=" + satışFiyatı);
                System.out.println("indirim miktarı:" + satışFiyatı * 0.10);
                System.out.println("indirimli fiyatı:" + (satışFiyatı - satışFiyatı * 0.10));
            }
        } else {
            System.out.println("ürün fiyat=" + satışFiyatı);
            System.out.println("indirim miktarı:" + satışFiyatı * 0.05);
            System.out.println("indirimli fiyatı:" + (satışFiyatı - satışFiyatı * 0.05));
        }

    }
}