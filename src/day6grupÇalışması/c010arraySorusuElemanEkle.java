package day6grupÇalışması;

import java.util.Arrays;

public class c010arraySorusuElemanEkle {
    public static void main(String[] args) {
       // Soru 7- Verilen bir array’e istenen bir elemani ekleyip bize donduren bir method yazin,
        //eski array’e yeni degeri atayin

        int[] arr= {2,3,4,5};
        int eklenecekEleman= 6;
        arr=arrayeElemanEkle(arr,eklenecekEleman);
        System.out.println(Arrays.toString(arr));

    }
    public static int[] arrayeElemanEkle(int[] arr,int eklenecekEleman){
       int[] yeniArr= new int[arr.length+1];
        for (int i = 0; i <arr.length ; i++) {
            yeniArr[i]=arr[i];
            yeniArr[arr.length]=eklenecekEleman;

        }
        return yeniArr;
    }
}
