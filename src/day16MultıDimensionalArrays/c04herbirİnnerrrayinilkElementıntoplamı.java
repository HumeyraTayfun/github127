package day16MultıDimensionalArrays;

public class c04herbirİnnerrrayinilkElementıntoplamı {
    public static void main(String[] args) {
        // verilen bir mda deki her bir innerin ilk elementinin toplamı

        int[][] arr={{1,4,7},{3,5,6}};
        int toplam=0;
        for (int i = 0; i < arr.length; i++) {
            toplam += arr[i][0];
        }
        System.out.println(toplam);//4
    }
}
