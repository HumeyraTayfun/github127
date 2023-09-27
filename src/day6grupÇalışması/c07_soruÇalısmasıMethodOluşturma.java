package day6grupÇalışması;

import java.util.Scanner;

public class c07_soruÇalısmasıMethodOluşturma {
    // Soru 4-kullanıcıdan 2 tane char isteyin ve bunu methoda argument olarak yazıp
    // method içerisinde 2 char'ın değerini toplayıp konsola yazdırın.
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir harf giriniz");
        char harf1 = scanner.next().charAt(0);

        System.out.println("Lütfen bir harf daha giriniz");
        char harf2 = scanner.next().charAt(0);

       toplaYazdır(harf1,harf2);// methodu cagırdım.asagıda olusturdum yukarda cagırdım
    }
       public static void toplaYazdır(char harf1,char harf2){
          System.out.print("verilen ıkı harfin toplamı="+(harf1+harf2));

}
}
