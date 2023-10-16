package day9Arrays;

import java.util.Arrays;

public class c11ArraysSort {
    public static void main(String[] args) {
        // array.sort sıraya koymaya yarar

        int[] arr= {3,9,1,0,12,87,4,6};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));// [0,1,3,4,6,9,12,87]
    }
}
