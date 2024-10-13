package practical03;

import java.util.Scanner;

public class Biscuits {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // declare any variables here
        int bis, box, pac, lp, lbi;

        // prompt for the number of biscuits
        System.out.print("Enter the number of biscuits: ");
        bis = scan.nextInt();

        // calculate the number of packets and leftover biscuits
        pac = bis/12;
        lbi = bis%12;
        // calculate the number of boxes and leftover packets
        box = pac/30;
        lp = pac%30;
        // output the results
        System.out.println("There are " +pac+" packet(s) of biscuit(s): "+box+" box(s) with "+
                lp+ " leftover packet(s) and "+lbi+" leftover biscuit(s)");
    }

}
