package day16MultıDimensionalArrays;

public class c03enBüyükEnküçükElemanıBulma {
    public static void main(String[] args) {
        // verılen bir mda da en buyuk ve en kucuk sayıları bul

        int[][] arr = {{1, 4, 7}, {3, 5}, {1, 9, 0, 8}, {2}};
        int enKüçükElement = arr[0][0];
        int enBüyükElement = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > enBüyükElement) {
                    enBüyükElement = arr[i][j];
                }
                if (arr[i][j] < enKüçükElement) {
                    enKüçükElement = arr[i][j];
                }

            }
        }
        System.out.println("Arraydeki en büyük sayı=" + enBüyükElement);
        System.out.println("Arraydeki en küçük sayı=" + enKüçükElement);
    }//Arraydeki en büyük sayı=9
    // Arraydeki en küçük sayı=0
}
