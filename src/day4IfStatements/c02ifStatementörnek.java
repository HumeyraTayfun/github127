package day4IfStatements;

import java.util.Scanner;

public class c02ifStatementörnek {
    public static void main(String[] args) {

        // kullanıcıdan bir karakter girmesini isteyin.girilen karakterin büyük harf olup olmadıgını yazdırın

        Scanner scanner= new Scanner(System.in);
        System.out.println("lütfen bir karakter giriniz");
        char krk= scanner.next().charAt(0);
        if(krk>='A'&& krk<='Z') {
            System.out.println("girilen kaarakter büyük harf");
        } else {
            System.out.println("girilen karakter büyük harf değil ");// yapabildim
        }
    }
}
