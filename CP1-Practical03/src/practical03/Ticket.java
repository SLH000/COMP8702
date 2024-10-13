package practical03;/* This program asks for an age and displays the cost of the ticket */

import java.text.NumberFormat;
import java.util.Scanner;

public class Ticket {
    public static void main(String[] args) {
        int age;
        int ticket = 12;
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your age ");
        age = scan.nextInt();

        if (age <= 8 || age >= 65) {
            ticket = 6;
        }else{
            ticket = 12;
        }
        NumberFormat nf =  NumberFormat.getCurrencyInstance();
        String tp = nf.format(ticket);
        System.out.println("Your ticket costs " + tp);
    }
}