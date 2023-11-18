package day21Constructors;

public class c02CarRunner {


    public static void main(String[] args) {


        c01Car car1 = new c01Car();
        //class adı  obje adı atama iş  keyword constructor
       // System.out.println(car1.marka);
       // System.out.println(car1.model);
        System.out.println(car1);

       c01Car car2= new c01Car();
       car2.marka="Toyota";
       car2.model="Corolla";
       car2.renk= "kırmızı";
       car2.yıl= 2000;
       car2.fiyat=100000;
        System.out.println(car2);

        c01Car car3= new c01Car("Porshe","carrera");
        System.out.println("car3==>"+ car3);

        c01Car car4= new c01Car("honda","cıvıc","sarı");
        System.out.println(car4);

        c01Car car5=new c01Car("opel","corsa",2010,500000);
        System.out.println("car5 özellıkler: " + car5);
    }



}