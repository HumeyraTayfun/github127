package day9Arrays;

public class c09ArrayArananElemanıBul {
    public static void main(String[] args) {
        //soru 4- Verilen bir array’de istenen bir elemanin var olup olmadigini ve varsa kac kere
        //kullanildigini yazdiran bir method olusturun.

        int[] arr = {3, 4, 5, 6, 4, 8, 6, 1};
        int arananSayı = 4;
        elemanSayısıYazdır(arr, arananSayı);
    }

    public static void elemanSayısıYazdır(int[] arr, int arananSayı) {
        int sayaç = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arananSayı) {
                sayaç++;
            }
           // if (sayaç == 0) {
             //   System.out.println("Aranan eleman arrayde yok");
           // }
            // System.out.println("aranan eleman arrayde" + sayaç + "kere kulanılmıştır");

        }
        if (sayaç == 0) {
            System.out.println("Aranan eleman arrayde yok");
        }else

        System.out.println("aranan eleman arrayde " +  sayaç  +  " kere kulanılmıştır");
    }
        }

