package day9Arrays;

import java.util.Arrays;

public class c01ArrayÇalışma {
    public static void main(String[] args) {

        int[] arr= {4,1,7,5};
       // System.out.println(Arrays.toString(arr));// eger arraylerın hepsını yazdırmak ıstıyorsak
        // bu sekılde yazarız konsolda [4,1,7,5] yazar

        int[] arr2= {4,1,7,5};
        System.out.println(arr2[0]);// 4 yazdı
        System.out.println(arr2[1]);// 1 yazdı
        System.out.println(arr2[arr2.length-1]);//5 son elementi yazdırmak ıcın

    }
}
