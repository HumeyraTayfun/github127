package day10IkıKatlıArraySoru;

public class c02IkiKatliToplamSorusu {
    public static void main(String[] args) {
        //SORU-1 Verilen 2 katli bir array’de ayni index’e sahip elementleri toplayip, yeni
        //olusturacagimiz tek katli bir array’e bu toplamlari atayin.
        //input : int[][] arr = {{3,4,5}, {2,3,6,7}};
        //output: [5, 7, 11]

        int[][] arr = {{3, 4, 5}, {2, 3, 6, 7}};
        arrayToplama(arr);

    }

    public static void arrayToplama(int[][] arr){
        var arrayLength = arr.length;
        int [] result = new int[arrayLength];

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                //if ()
                result[j] = arr[i][j] + arr[i + 1][j];
            }
        }

       for(int k = 0; k < result.length; k++){
           System.out.println("dizi elemanları: "+ result[k]);
       }
    }
}
