package day21Constructors;

public class c01Car {
    String marka = "Marka atanmamış";
    String model = "Model atanmamış";
    String renk = "Renk atanmamış";
    int yıl = 1900;
    int fiyat;

    c01Car() {
      //renk="kırmızı";
    }

    c01Car(String mrk, String mdl) {
        marka=mrk;
        model=mdl;
        //renk="kırmızı";

    }
    c01Car(String mrk,String mdl,String rnk){
        marka=mrk;
        model=mdl;
        renk=rnk;

    }
    c01Car(String marka,String model,int yıl,int fiyat){
        this.marka=marka;
       this.model=model;
        this.yıl=fiyat;
        this.fiyat=100;

    }








        public String toString () {
            return "özellıkler" +
                    "marka='" + marka + '\'' +
                    ", model='" + model + '\'' +
                    ", renk='" + renk + '\'' +
                    ", yıl=" + yıl +
                    ", fiyat=" + fiyat;

        }
    }

