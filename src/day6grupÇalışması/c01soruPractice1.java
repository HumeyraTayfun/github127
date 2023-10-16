package day6grupÇalışması;

import java.util.Scanner;

public class c01soruPractice1 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen bir metin giriniz");
        String girilenMetin= scanner.nextLine();
        String yeniHal= "("+girilenMetin+")";
// bir kullanıcıdan alınan metni parantez içine alın
// eger metin java kelimesi içeriyorsa bu kelimenin hemen öncesine ve sonrasına yıldız koyun
// içermiyorsa bu metin java içermiyor yazın. aslında soru bu
// ama ben ındeks ile yapmadıgım için konsolda (java çok güzel)*java* yazdı

        if (girilenMetin.contains("java"))
        {
            System.out.println( yeniHal+"*"+"java"+"*");
        } else {
            System.out.println("bu metin java kelimesi icermıyor");
        }
}
}


