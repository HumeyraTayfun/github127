package day16MultıDimensionalArrays;

public class c05Matrix {
    // Aşağıdaki şekilde çıktı veren programı print içerisinde
    // sadece bir tane # kullanarak yazıdırınız
       //#####
      //#####
     // #####
     //#####
    //#####

    public static void main(String[] args) {
        int satır=5;
        int sutun=5;
        for (int i = 0; i <satır; i++) {
            for (int j = 0; j < satır; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}

