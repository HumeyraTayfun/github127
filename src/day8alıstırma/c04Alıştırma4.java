package day8alıstırma;

public class c04Alıştırma4 {
    public static void main(String[] args) {
         /*
Yıldızlar (*) ile baklava deseni oluşturabileceğiniz bir kod yazınız.
       Sonuç böyle olmalıdır;

              *
             * *
            * * *
           * * * *
          * * * * *
           * * * *
            * * *
             * *
              *

          şeklini konsola yazdiriniz.
*/
     int enGenişSatır=5;
        for (int i = 1; i <=enGenişSatır ; i++) {

            for (int j =1 ; j <= enGenişSatır-i ; j++) { // bastaki bosluklar icin
                System.out.print(" ");
            }

            for (int j = 1; j <=i ; j++) { // yildizlar icin
                System.out.print("* ");
            }
            System.out.println("");
        } // en genis satira ka


        for (int i = enGenişSatır-1; i >=1 ; i--) {
            for (int j = 1; j <=enGenişSatır-i ; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }

            System.out.println("");
        }



    }
}
