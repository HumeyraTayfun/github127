package day16MultıDimensionalArrays;

import java.util.Scanner;

public class c06matrıx2 {
    // Kullanıcıdan satır değeri isteyin ve konsola şu tip yazdırın
    // Kullanıcı 4 girerse alta doğru artarak 4 satır, sonraki 3 satır azalarak olacak
    // Kullanıcı 10 girerse alta doğru artarak 10 satır, sonraki 9 satır azalarak olacak
    // *
    // * *
    // * * *
    // * * * *
    // * * *
    // * *
    // *
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Lütfen satır sayısı giriniz");
        int satırAdedi= scanner.nextInt();

        if(satırAdedi<=0){
            System.out.println("Lütfen sıfırdan büyük bir değer giriniz");
        }else {
            for (int i = 1; i  <=satırAdedi; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            for (int i = satırAdedi-1; i >= 1; i--) {
                for (int j = 1; j <=i ; j++) {
                   System.out.print("*");
                }
                System.out.println();
            }
        }

    }
      }



