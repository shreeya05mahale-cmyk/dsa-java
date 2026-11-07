package firstprogram;

import java.net.SocketOption;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter roll number: ");
        int rollNo = input.nextInt();
        System.out.println("Roll number is " + rollNo);
    }
}
