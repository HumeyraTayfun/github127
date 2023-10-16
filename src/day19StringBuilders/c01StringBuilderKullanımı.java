package day19StringBuilders;

public class c01StringBuilderKullanımı {
    public static void main(String[] args) {
        // string immutable olduğundan her değişiklikte yeni objeler oluşturacaktır.özellikle kullanıcı sayısı
        // ve metin veriler fazla olduğunda hafıza kullanımı açısından string yerine stringbuilder kullanılabilir.

        // stringbuilder oluşturulurken 3 farklı şekılde oluşturulabilir.
        StringBuilder sb1= new StringBuilder();
        // kapasitesi 16 olan boş bir sb oluşturur
        System.out.println(sb1.capacity());

        StringBuilder sb2= new StringBuilder("ali can");
        // yazılan strınge uygun kapasitede sb oluşturur
        System.out.println(sb2.capacity());
        System.out.println(sb2.length());

        StringBuilder sb3= new StringBuilder(7);
        // kapasitesi 7 olan bir sb oluşturur
        System.out.println(sb3.capacity());

        StringBuilder sb4= new StringBuilder("java candır");
        sb4.append(".");
        System.out.println(sb4);
        String str= "hava çok güzel";
        sb4.append(str,5,8);
        System.out.println(sb4);// java candır.çok

        sb4.insert(5,"çok ");
        System.out.println(sb4);// java çok candır.çok

        sb4.insert(19,str,9,14);
        System.out.println(sb4);

        // append sona ekler
        // insert  araya eklemek için

        sb4.delete(16,25);
        System.out.println(sb4);// java çok candır.
        // sondaki karakteri silin
        sb4.deleteCharAt(sb4.length()-1);
        System.out.println(sb4);// java çok candır

        // index saymadan "çok" silin

        sb4.indexOf("çok");
        int indexçok= sb4.indexOf("çok");
        sb4.delete(indexçok,indexçok+4);
        System.out.println(sb4);// java candır
        sb4.reverse();
        System.out.println(sb4);// rıdnac avaj
        sb4.reverse();
        System.out.println(sb4);

        StringBuilder sb5= new StringBuilder("java güzeldir");
        StringBuilder sb6= new StringBuilder("hava güzeldir");
        System.out.println(sb5.compareTo(sb6));//2
        StringBuilder sb7= new StringBuilder("java güzeldir");
        System.out.println(sb6.compareTo(sb7));// -2 int döner
        System.out.println(sb5.compareTo(sb7));// 0
        // eger hiçbir fark yoksa 0 yazdırır
        // stringbuilder ların eşitliğini anlamak için equals kullanılmaz.eger iki stringbuılderların aynı olduğunu
        // kontrol etmek istersek sb.compareTo(sb2) yazarız.sonuç olarak bize 0 döndürürse iki sb aynıdır.Aynı değise
        //baştan kontrol ederek ilerler ve buldugu ılk farklı harflerin arasında (ASCII TABLE) kaç sayı oldugunu
        // döndürür.

        // bir string vebir stringbuilder karşılaştırılırmı?
        //javada farklı non primitive data türleri == ile karşılaştırılmaz. bir string ile bir stringbuilderı
        // equals() ile karşılaştırmanıza java CTE vermez ama metinler aynı olsa bile false döner.
        // compare kullanmak mantıklı


        sb5.replace(0,4,"hava");
        System.out.println(sb5);// hava güzeldir

    }
}
