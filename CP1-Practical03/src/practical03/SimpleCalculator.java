package practical03;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // 1. Get the input number
        int num, r;
        int s = 0;

        System.out.print("Enter an integer from 0-10: ");
        num = scan.nextInt();
        // 2. generate a random number, use Math.random()
        r = (int) (Math.random() * (10-0+1));
        // 3. get the calculation type
        System.out.println("Main menu");
        System.out.println("1. for add");
        System.out.println("2. for subtract");
        System.out.println("3. for multiply");

        System.out.print("What is your choice: ");
        int a = scan.nextInt();

        // 4. if the number is not valid output a message
        if (a != 1 && a != 2 && a != 3) {
            System.out.println("The input is invalid");
        } else if (a == 1) { // 5. else perform the calculation
           s = r + num;
            // 6. display the results
            System.out.println("The result is "+s);
        } else if (a == 2) {
            s = r - num;
            System.out.println("The result is "+s);
        } else {
            s = r * num;
            System.out.println("The result is "+s);
        }

    }
}
