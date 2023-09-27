public class c06Arraysorular {

    public static void main(String[] args) {
        //Soru 1-Verilen 2 katli bir array’de bulunan cift sayilari toplayip, sonucu yazdiran bir
        //method olusturun.

        int[][] arr = {{3, 1, 2, 4}, {1, 2}, {3, 4, 5}, {10}, {2, 7}};
        //  çiftSayılarıToplaYazdır(int[][] arr,int çiftSayılar);
        //int çiftSayılarıTopla = 0;
      //  int toplam = çiftSayılarıTopla;
        System.out.println(çiftSayılarıTopla(arr));
      //  System.out.println("çift sayılarıntoplamı=" + toplam);


    }


    public static int çiftSayılarıTopla(int[][] arr) {
        int toplam = 0;

        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] % 2 == 0) {
                    toplam += arr[i][j];
                }
             //  System.out.println("çift sayılarıntoplamı=" + toplam);


            }
         return toplam;
       // System.out.println("çift sayılarıntoplamı=" + toplam);
    }

}