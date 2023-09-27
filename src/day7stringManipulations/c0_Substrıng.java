package day7stringManipulations;

public class c0_Substrıng {
    public static void main(String[] args) {

        String str= "Java en güzel programlama dili";
        System.out.println(str.substring(3,4));// 3 olsun 4 olmasın demek a yazdırır
        String index3tekiHarf=str.substring(3,4);
        System.out.println(index3tekiHarf);
        // substrıng bastan sona yazdırır o yuzden baslangıcı ve bitisi belirtmemiz lazım
    }
}
