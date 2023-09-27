package day9Arrays;

public class c05ArrayÇalışmasıSoru2 {
    public static void main(String[] args) {
        //verilen string bir arrayde istenen harfi içeren elementleri yazdırın

        String[] isimler = {"hüseyin", "mehmet", "esra", "ercan", "ömer" };
        String istenenHarf = "a";
        for (int i = 0; i < isimler.length; i++) {

            if (isimler[i].contains(istenenHarf)) {
                System.out.print(isimler[i] + " ");// esra ercan
            }
        }

            }
        }
