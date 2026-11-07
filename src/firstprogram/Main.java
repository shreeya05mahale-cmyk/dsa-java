package firstprogram;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Scanner input = new Scanner(System.in);
        System.out.println(input.nextInt());

        int rollNo = 23; //4
        char letter = 'r';
        String name = "Shreeya"; //Primitive datatype = Cannot be broken down
        float marks = 78.45f; //4 //All decimal values are by default double, to store float, add f
        double largeDecimal = 34553232.4558987; //8
        long largeInteger = 2345683908503L; //If no decimals by default it is considered integer
        boolean check = false;

        Integer rNo = 39; //Integer here is a wrapper class, to get additional functionalities
    }
}
