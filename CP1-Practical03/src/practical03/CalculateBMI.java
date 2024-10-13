package practical03;// CalculateBMI.java - calculate the BMI and then categorise
// it based on tablular values
import java.util.Scanner;
public class CalculateBMI {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double weight, height, bmi;
        String n;

        //Prompt the user to enter their weight in kilograms
        System.out.print("Enter your weight in kg: ");
        weight = scan.nextDouble();
        //Prompt the user to enter their height in metres
        System.out.print("Enter your height in m: ");
        height = scan.nextDouble();
        // Calculate BMI
        bmi = weight/ (height*height);
        // Display the result
        if (bmi<=18.5){
            n = "Underweight";
        }else if (18.5< bmi && bmi <24.9){
            n = "Normal";
        }else if(25<bmi && bmi <29.9){
            n="Overweight";
        }else{
            n="Obese";
        }
        System.out.println("Your BMI is "+bmi+", "+"which means you are in the "+n+" range.");
    }
}