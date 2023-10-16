package day9Arrays;

import java.util.Arrays;

public class c12BinarySearch {
    public static void main(String[] args) {
        // arrayde bır elemanın olmadıgını bulmaya yarar ama once array sort yapmak lazım

        String[] isimler= {"Esra","İbrahim","Ali"};
        Arrays.sort(isimler);
        System.out.println(Arrays.toString(isimler));//[Ali,Esra,İbrahim]
    }
}
