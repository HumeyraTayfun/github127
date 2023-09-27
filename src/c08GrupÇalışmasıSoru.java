import java.util.Scanner;

public class c08GrupÇalışmasıSoru {
    public static void main(String[] args) {


        //SORU-5 Kullanicidan toplanmak uzere pozitif tamsayilar isteyinKullaniciya bitirmek
        //istediginde 0'a basmasini soyleyin
        //Kullanici bitirmek istediginde toplam kac adet pozitif tam sayi girdiginive
        //bunlarin toplaminin kac oldugunu yazdirin
        //Kullanici negatif sayi girerse "negatif sayi kullanamazsiniz " yazdirin bu
        //negatif sayiyi sayi adedine ve toplama eklemeyin

        Scanner scanner=new Scanner(System.in);

        int sayı=44;
        int toplam=0;
        int adet=0;
        while(sayı!=0){
            System.out.println("lütfen toplanmak üzere pozitif tam sayılar girin ve bitirmek için 0 tuşuna basın");
         sayı=scanner.nextInt();

            if (sayı<0){
                System.out.println("negatif sayı kullanamazsınız");
        }else if(sayı!=0){
            adet++;
                toplam+=sayı;
            }


        }

        System.out.println("girilen sayıların toplamı="+toplam);
        System.out.println("girilen sayıların adedi="+adet);



    }
}
