package practical02;

import java.util.Scanner;

public class TellerMachine {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // declare any variables here
        int total = 0;
        int c20 = 0;
        int c5 = 0;
        int c1 = 0;
        System.out.println("Enter an amount of cents in the range 0 to 100: ");
        total = scan.nextInt();

        c20 = total/20;
        c5 = total % 20 /5;
        c1 = (total % 20) % 5;

        System.out.println("Dispensing...\n" + (c20) + " 20c coin(s) \n" + (c5)  + " 5c coin(s) \n" + (c1) + " 1c coin(s)\n");



        // Output the values here.

    }
}