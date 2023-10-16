package day6grupÇalışması;

public class c09whileLoopSorusu {
    public static void main(String[] args) {
        //Soru 1- While loop kullanarak 2 basamakli 7 ile bolunebilen pozitif tamsayilari
       // yazdirin

        int sayı=10;
        int adet=0;
        while (sayı<=99){
            //sayı++;
            if (sayı%7==0){
                adet++;
               System.out.print(sayı+" ");
               // sayı++;
            }
           // System.out.print(sayı);
            sayı++;
            //adet++;
        }
        System.out.println(adet);
    }
}
