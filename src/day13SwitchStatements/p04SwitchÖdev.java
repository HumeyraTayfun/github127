package day13SwitchStatements;

import java.util.Scanner;

public class p04SwitchÖdev {
    public static void main(String[] args) {

        // kullanıcıdan ay numarasını alıp ay ismini giriniz

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen bir ay numarası giriniz");
        int numMonth=scanner.nextInt();
        switch (numMonth){
            case 1:
                System.out.println("ocak");
                break;
            case 2:
                System.out.println("şubat");
                break;
            case 3:
                System.out.println("Mart");
                break;
            case 4:
                System.out.println("Nisan");
                break;
            case 5:
                System.out.println("Mayıs");
                break;
            case 6:
                System.out.println("Haziran");
                break;
            case 7:
                System.out.println("Temmuz");
            case 8:
                System.out.println("Ağustos");
                break;
            case 9:
                System.out.println("Eylül");
                break;
            case 10:
                System.out.println("Ekim");
            case 11:
                System.out.println("Kasım");
                break;
            case 12:
                System.out.println("Aralık");
                break;
            default:
                System.out.println("Geçersiz bir ay numarası girdiniz");
        }
    }
}
