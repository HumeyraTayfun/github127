package day3ConcatenationStringBirleştirme;

public class c01Concatenation {
    public static void main(String[] args) {

        String a= "hello";
        String b= "world";
        System.out.println(a+b);
        System.out.println(a+ " "+ b);

        String a1="hello";
        int b2= 2;
        int c2= 3;
        System.out.println(a1+b2+c2);// hello23 yazdı
        System.out.println(c2+b2+a1);// 5hello
    }
}
