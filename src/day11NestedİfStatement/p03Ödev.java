package day11NestedİfStatement;

import java.util.Scanner;
public class p03Ödev {
    public static void main(String[] args) {


        // kullanıcıdan gün ismini girmesini isteyiniz.girilen gün haftaici bir gün ise
        // "şimdi çalışma zamanı tatile ....gün var"şeklinde yazdırın
        // girilen gün haftasonu ise "şimdi dinlenme zamanı"yazdırın

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir gün ismi giriniz");
        String günİsmi = scanner.nextLine().toLowerCase();
        switch (günİsmi){
            case"pazartesi":
                System.out.println("şimdi çalışma zamanı tatile 5 gün kaldı");
                break;
            case "salı":
                System.out.println("şimdi çalışma zamanı tatile 4 gün kaldı");
                break;
            case "çarsamba":
                System.out.println("şimdi çalışma zamanı tatile 3 gün kaldı");
                break;
            case "perşembe":
                System.out.println("şimdi çalışma zamanı tatile 2 gün kaldı");
                break;
            case"cuma":
                System.out.println("tatile 1 gün kaldı");
                break;
            case "cumartesi":
            case"pazar":
                System.out.println("şimdi dinlenme zamanı");
                break;
            default:
                System.out.println("Geçerli bir gün ismi giriniz");

        }


    } 
    }