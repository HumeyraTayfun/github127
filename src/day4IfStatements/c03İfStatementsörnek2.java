package day4IfStatements;

import java.util.Scanner;

public class c03İfStatementsörnek2 {
    public static void main(String[] args) {

        // kullanıcıdan bir harf isteyin,
        // girilen karakter küçük harf ise onu büyük harf olarak yazdırın yoksa girilen harfi yazdırın

        Scanner scanner= new Scanner(System.in);
        System.out.println("lütfen bir harf giriniz");
        char krk= scanner.next().charAt(0);
        if(krk>='a' && krk<='z'){
            System.out.println(Character.toUpperCase(krk));
        }else {
            System.out.println(krk);// yapabildim
        }
    }
}
