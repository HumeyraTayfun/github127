package day4IfStatements;

import java.util.Scanner;

public class c01Ifstatement {
    public static void main(String[] args) {

        Scanner scanner= new Scanner (System.in);
        System.out.println("Lütfen notunuzu giriniz");
        double not= scanner.nextDouble();
        if(not>=50){
            System.out.println("sınıfı geçtin");
        } else if (not<=50){
            System.out.println("malesef kaldınız");// yapabildim

            }



    }
}
