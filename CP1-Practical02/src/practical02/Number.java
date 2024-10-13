package practical02;

import java.util.Scanner;

public class Number {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String message;
        String message2;

        System.out.println("Enter a line:");
        message = scan.nextLine();

        System.out.println("Enter another line: ");
        message2 = scan.nextLine();


        int k = Integer.parseInt(message + message2) + 1;

        System.out.println("Number= " + k);
        System.out.println("The complete number is " + (message + message2) + " and adding 1 gives " + k + ".");

    }
}
