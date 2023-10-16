package day16MultıDimensionalArrays;

import java.util.Arrays;

public class c02multiDimensional2 {
    public static void main(String[] args) {
        int[][] arr = {{3, 1, 2, 4}, {1, 2}, {3, 4, 5}, {10}, {2, 7}};
        System.out.println(arr.length);//5
        System.out.println(arr[0]);// referansını yazdı
        System.out.println(Arrays.toString(arr[0]));//[3,1,2,4]
        System.out.println(arr[1].length);//2
        System.out.println(arr[1][1]);//2

        int toplam = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                toplam += arr[i][j];
            }
           // System.out.println("arraydeki tüm sayıların toplamı" + toplam);buraya yazma
        }
        System.out.println("arraydeki tüm sayıların toplamı = " + toplam);
    }


}