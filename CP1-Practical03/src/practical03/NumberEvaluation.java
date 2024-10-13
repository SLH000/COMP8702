package practical03;
import java.util.Scanner;
/**
 * @author moon0016
 */
public class NumberEvaluation {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // prompt the user for a number
        int num1;
        String npz;
        String eo;

        System.out.print("Enter a number: ");
        num1 = scan.nextInt();

        // determine whether it is positive, negative, or zero
        if (num1 < 0) {
            npz = " is negative";
        } else if (num1 > 0) {
            npz = " is positive";
        } else {
            npz = " is zero";
        }
        // determine whether it is odd or even
        if (num1%2 == 0){
            eo = "even";
        }else{
            eo = "odd";
        }
        // output the results
        System.out.println("The number "+num1+npz+ " and "+eo);


    }
}

