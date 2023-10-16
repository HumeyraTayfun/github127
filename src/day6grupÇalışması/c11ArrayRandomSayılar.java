package day6grupÇalışması;

import java.util.Arrays;
import java.util.Random;

public class c11ArrayRandomSayılar {

    //10 elemanlı bir tamsayı dizisine 1 ile 100 arasında rastgele sayılar yerleştirildikten sonra
// bu sayılardan en büyüğünü bulup yazdıran kodu yazınız
    public static void main(String[] args) {
        int[] tamSayı=new int[10];
        Random random=new Random();
       // int rastgeleSayılar= random.nextInt(100);

        for (int i = 0; i < tamSayı.length; i++) {
           // tamSayı[i]+=rastgeleSayılar;
           // rastgeleSayılar++;
            int rastgeleSayılar= random.nextInt(100);
            tamSayı[i]+=rastgeleSayılar;
        }
        System.out.println(Arrays.toString(tamSayı));
        int enBüyükTamSayı=tamSayı[0];
        for (int i = 0; i <tamSayı.length ; i++) {
            if(tamSayı[i]>enBüyükTamSayı){
               enBüyükTamSayı=tamSayı[i];
            }
            
        }
        System.out.println("en büyük tam sayı=" + enBüyükTamSayı);
    }
}
