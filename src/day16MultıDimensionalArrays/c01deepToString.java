package day16MultıDimensionalArrays;

import java.util.Arrays;

public class c01deepToString {
    public static void main(String[] args) {
        // en dıştaki arrayi yazdırmaya yarar

        int[][] arr={{1,4,7},{3,5}};
       Arrays.deepToString(arr);
        System.out.println(Arrays.deepToString(arr));// [[1,4,7],[3,5]

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");//1 4 7 3 5

            }
        }
    }
}
