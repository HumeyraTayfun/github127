package day10IkıKatlıArraySoru;

public class c01IkıKatlıArrayÇarpımSorusu {

    public static void main(String[] args) {
        //SORU-3 Verilen 2 katli bir array’de bulunan tum sayilarin carpinini bize donduren bir
        //method olusturun

        int[][] arr = {{3, 4, 5}, {2, 3, 6, 7}};
        sayılarınÇarpımı(arr);

    }

    public static int sayılarınÇarpımı(int[][] arr) {

        int toplam = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                toplam *= arr[i][j];


            }

        }
        System.out.println("arraydeki çarpımların sonucu="+ toplam);
        return toplam;


    }
}
