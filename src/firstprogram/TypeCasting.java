package firstprogram;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        float num = sc.nextFloat();
//        System.out.println("Number: " + num);
//
//        int n = (int)(67.34);
//        System.out.println(n);

//        int a = 257;
//        byte b = (byte)(a); //257 % 256 = 1 (256 is max)
//        System.out.println(b);

        //byte a = 50;
        // a = a * 2; will result in an error because a * 2 is an int

        byte b = 42;
        char c = 'a';
        short s = 1024;
        float f = 5.67f;
        int i = 50000;
        double d = 0.1234;
        double result = (f * b) + (i / c) - (d - s);
        // float + int + double = double
        System.out.println((f * b) + " " + (i / c) + " " + (d - s));
        System.out.println(result);
    }
}
