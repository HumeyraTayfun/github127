package day4IfStatements;

import java.util.Scanner;

public class c04İfStatementsörnek3 {
    public static void main(String[] args) {

        // ögrencinin notu 85 ve üstü ise AA,
        // 65 ve üstü degilse BB,
        // 50 ve üstü ise CC
        // GERİDE KALANLAR DD
        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen notunuzu giriniz");

        double not=scanner.nextDouble();
        if (not >= 85) {
            System.out.println("notunuz AA");
        } else if (not >= 65) {
            System.out.println("notunuz BB");
        } else if (not >= 50) {
            System.out.println("notunuz CC");
        } else {
            System.out.println("notunuz DD");// yapabildim
        }


    }
}