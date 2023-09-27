package day9Arrays;

import java.util.Arrays;

public class c04ArrayÇalışmasıSoru {
    public static void main(String[] args) {
        //verilen int bir arraydeki tüm elementlerin değerlerini ıkı arttırın

        int[] arr={3,5,7,10};
        System.out.println("Arrayin ilk hali:"+ Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            arr[i] += 2;
        }
            System.out.println("Arrayin son hali="+Arrays.toString(arr));

    }
}
