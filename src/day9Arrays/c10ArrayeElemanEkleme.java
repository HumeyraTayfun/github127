package day9Arrays;

import java.util.Arrays;

public class c10ArrayeElemanEkleme {
    public static void main(String[] args) {
        // verilen bir arraye istenen bir elemanı ekleyıp bize döndüren bir method yazın
        // eski arraye yeni degeri atayın

        int[] arr1 = {4, 5, 6, 7};
       int[] yeniArr = {4, 5, 6, 7, 8,};
      arr1=yeniArr;
      int eklenecekEleman=20;

      arr1=arrayeElemanEkle(arr1,eklenecekEleman);
        System.out.println("arr1in son hali:" + Arrays.toString(arr1));
    }

    public static int[] arrayeElemanEkle(int[] arr1, int eklenecekEleman) {
     int[] yeniArr=new int[arr1.length+1];
        for (int i = 0; i < arr1.length; i++) {
           yeniArr[i]=arr1[i];
            yeniArr[yeniArr.length-1]=eklenecekEleman;
        }
        return yeniArr;
    }
}
