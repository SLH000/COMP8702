/*
An application to help young children practice their mathematics.  The application
will tailor arithmetic problems based on the competency of the user.  Command line
interaction allows the user to define the level of difficulty and then provide 
answers to randomly generated problems.
 */
package mathshelper;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.nio.file.FileSystemNotFoundException;
import java.text.DecimalFormat;
import java.util.Scanner;
/**
 *
 * @author See Lok Ashley Ho SID:2284061 FAN:ho0418
 */
public class MathsHelper {
    private Scanner scan;
    private int numQuestions,yearLevel;
    private int correct, totalQAns;
    private int questionAsked;
    private double calculatedPercentage;
    private String yearName = "";
    private String input;
    private int questionNum = 0;
    private String out, log;
    private boolean playAgain=false;
    private boolean newSession=false;
    public MathsHelper() {
        scan = new Scanner(System.in);
    }

    DecimalFormat df = new DecimalFormat(".##");
    public void letsPlay() throws FileSystemNotFoundException {
        do{
            int questions = 0;
            displayWelcome();
            String respond ="";
            do {
                displayYearMenu();
                yearLevel = scan.nextInt();
            log+=yearLevel+"\n";
            //make sure the user input is from 0-7
            while (yearLevel < 0 || yearLevel > 7) {
                out="Invalid input, please try again \n\n";
                log+=out;
                printOutput(out);
                displayYearMenu();
                yearLevel = scan.nextInt();
                log+=yearLevel+"\n";
            }
            displayQuestionMenu();
            numQuestions = scan.nextInt();
            log+=numQuestions+"\n";
            //make sure the user input is 1-5
            while (numQuestions < 1 || numQuestions > 5) {
                out="Invalid input, please try again\n\n";
                log+=out;
                printOutput(out);
                displayQuestionMenu();
                numQuestions = scan.nextInt();
                log+=numQuestions+"\n";
            }
        } while (confirmSessionDetails(yearLevel, numQuestions) == false);
        do {
            //reset all variable
            questionAsked = 0;
            calculatedPercentage=0;
            totalQAns=0;
            correct =0;
            //every session
            out = "let's begin!\n";
            log += out;
            printOutput(out);
            //To change the frequency of the check can simply change the number "5" to any number
            do {
                if (questionAsked  > 0 && questionAsked  %5==0&&yearLevel<7&&calculatedPercentage>75) {
                        out = "You are doing well! Let’s increase the difficulty a little.\n";
                        log += out;
                        printOutput(out);
                        yearLevel += 1;
                        generateQuestion(yearLevel);
                    questionAsked ++;
                    } else if (questionAsked > 0 && questionAsked %5==0 && yearLevel>0 && calculatedPercentage<30) {
                        out = "It seems you are having some difficulty. Let’s reduce the difficulty a little.\n";
                        log += out;
                        printOutput(out);
                        yearLevel -= 1;
                        generateQuestion(yearLevel);
                        questionAsked ++;
                        }
                generateQuestion(yearLevel);
                questionAsked ++;
            } while (questionAsked  < questionNum);

            finalScore();
            do {
                out = "Did you want to have another go with the same settings (Y/N)?";
                log += out;
                printOutput(out);
                respond = scan.nextLine();
                log += respond + "\n";
                if (respond.equalsIgnoreCase("Y"))
                    playAgain = true;
                else
                    playAgain = false;
            } while (!respond.equalsIgnoreCase("N") && !respond.equalsIgnoreCase("Y"));

            String filename = String.valueOf(System.currentTimeMillis()) + ".txt";
            try (PrintWriter printWriter = new PrintWriter(filename)) {
                printWriter.println(log);
                printWriter.close();
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
        }while (playAgain==true);
        String ans="";
        do {
            out="Did you want to start a new session or quit (S/Q)?";
            log+=out;
            printOutput(out);
            ans = scan.nextLine();
            log+=ans;
                if (ans.equalsIgnoreCase("S"))
                    newSession = true;
                else
                newSession= false;
        }while (!ans.equalsIgnoreCase("S")&&!ans.equalsIgnoreCase("Q"));
            if (newSession==false) {
                String filename = String.valueOf(System.currentTimeMillis()) + ".txt";
                try (PrintWriter printWriter = new PrintWriter(filename)) {
                    printWriter.println(log);
                    printWriter.close();
                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                }
            }
        }while (newSession==true);
    }


    //-------------------------operational methods------------------------------
    /**
     * Prints messages to the console and prints to an output file
     *
     * @param str the text to be displayed on the console and printed to an
     *            output file
     */
    private void printOutput(String str) {
        System.out.print(str); }

    private void printOutput(String str, Double dou){
        System.out.print(str + dou);
    }
    /**
     * Defines the Welcome Message text
     */
    private void displayWelcome() {
/*        printOutput("+------------------------------------------------------------------------+\n");
        printOutput("|                      Welcome to the Math Helper.                       |\n");
        printOutput("|       Use this application to test your knowledge of mathematics.      |\n");
        printOutput("|      This program is intended for children from reception to year 7    |\n");
        printOutput("+------------------------------------------------------------------------+\n");*/
        out="+------------------------------------------------------------------------+\n";
        out+="|                      Welcome to the Math Helper.                       |\n";
        out+="|       Use this application to test your knowledge of mathematics.      |\n";
        out+="|      This program is intended for children from reception to year 7    |\n";
        out+="+------------------------------------------------------------------------+\n";
        log+=out;
        printOutput(out);
    }
    /**
     * Defines the Year Menu
     */
    private void displayYearMenu() {
/*        printOutput("What is your year level? Choose an option from the list below:\n");
        printOutput(" +: addition, -: subtraction, *: multiplication, /: division, %: division with remainder\n");
        printOutput("[0] Reception [+]\n");
        printOutput("[1] Year 1 [+, -]\n");
        printOutput("[2] Year 2 [+, -]\n");
        printOutput("[3] Year 3 [+, -, *, /]\n");
        printOutput("[4] Year 4 [+, -, *, /]\n");
        printOutput("[5] Year 5 [+, -, *, /, negative numbers]\n");
        printOutput("[6] Year 6 [+, -, *, /, negative numbers]\n");
        printOutput("[7] Year 7 [+, -, *, /, %, negative numbers]\n");*/
        out="What is your year level? Choose an option from the list below:\n";
        out+=" +: addition, -: subtraction, *: multiplication, /: division, %: division with remainder\n";
        out+="[0] Reception [+]\n";
        out+="[1] Year 1 [+, -]\n";
        out+="[2] Year 2 [+, -]\n";
        out+="[3] Year 3 [+, -, *, /]\n";
        out+="[4] Year 4 [+, -, *, /]\n";
        out+="[5] Year 5 [+, -, *, /, negative numbers]\n";
        out+="[6] Year 6 [+, -, *, /, negative numbers]\n";
        out+="[7] Year 7 [+, -, *, /, %, negative numbers]\n";
        log+=out;
        printOutput(out);
    }
    /**
     * Defines the Question Menu
     */
    private void displayQuestionMenu() {
/*        printOutput("How many questions would you like to attempt? Choose an option from the list below:\n");
        printOutput("[1] 10 questions\n");
        printOutput("[2] 20 questions\n");
        printOutput("[3] 30 questions\n");
        printOutput("[4] 40 questions\n");
        printOutput("[5] 50 questions\n");*/
        out="How many questions would you like to attempt? Choose an option from the list below:\n";
        out+="[1] 10 questions\n";
        out+="[2] 20 questions\n";
        out+="[3] 30 questions\n";
        out+="[4] 40 questions\n";
        out+="[5] 50 questions\n";
        log+=out;
        printOutput(out);
    }
    /**
     * Displays the confirmation message to the user and processes user input to
     * determine the accuracy of the information provided. If correct then
     * return true otherwise return false.
     *
     * @param year      the selected Year Menu item {0,1,2,3,4,5,6,7}
     * @param questions the selected Question Menu item {1,2,3,4,5}
     * @return boolean based on user's confirmation of correct data entry
     */
    private boolean confirmSessionDetails(int year, int questions) {
        switch (year) {
            case 0 -> yearName = "Reception";
            case 1 -> yearName = "Year 1";
            case 2 -> yearName = "Year 2";
            case 3 -> yearName = "Year 3";
            case 4 -> yearName = "Year 4";
            case 5 -> yearName = "Year 5";
            case 6 -> yearName = "Year 6";
            case 7 -> yearName = "Year 7";
        }
        switch (questions) {
            case 1 -> questionNum = 10;
            case 2 -> questionNum = 20;
            case 3 -> questionNum = 30;
            case 4 -> questionNum = 40;
            case 5 -> questionNum = 50;
        }
        out="You are a " + yearName + " student and want to do " + questionNum + " question. Is this correct (Y/N)?";
        log+=out;
        printOutput(out);
        scan.nextLine();
        input = scan.nextLine();
        log+=input +"\n";
        if (input.equalsIgnoreCase("Y"))
            return true;
        return false;
    }
    private void generateQuestion(int year) {
        int min=getMin(year);
        int max=getMax(year);
        int num1, num2, oper;
        char op = ' ';
        String result=" ";
        num1 = (int) ((Math.random() * ((max - min) + 1)) + min);
        num2 = (int) ((Math.random() * ((max - min) + 1)) + min);
        oper = (int)(Math.random()*((operatorBounds(year)-1)+1)+1);
        switch (oper){
            case 1-> op='+';
            case 2-> op='-';
            case 3-> op ='*';
            case 4-> op ='/';
            case 5-> op = '%';}
        switch (op){
            case '+'->result = String.valueOf(num1 + num2);
            case '-'->result = String.valueOf(num1-num2);
            case '*'->result=String.valueOf(num1*num2);
            case '/'->result=String.valueOf(num1/num2);
            case '%'->result=String.valueOf(num1/num2)+"r"+ String.valueOf(num1%num2);
        }
        out="Q"+ String.valueOf(totalQAns+1)+". "+String.valueOf(num1)+" "+Character.toString(op)+" "+String.valueOf(num2)+" = ";
        log+=out;
        printOutput(out);
        String userIn = scan.nextLine();
        log+=userIn+"\n";

        String hint ="";
        int numHint = 1; //all the result.length has to -1
        if(userIn.equalsIgnoreCase("H")){
            if (result.length()==1){
                evaluateAnswer(result, userIn);
                }
            else{
                do{
                    hint="";
                    for (int i = 0; i<result.length()-numHint; i++) {
                        hint += "-";
                    }
                    hint += result.substring(result.length()-numHint, result.length());
                    numHint++;
                    out=num1+" "+ op +" "+ num2 +" = "+ hint +" : \n";
                    log+=out;
                    printOutput(out);
                    userIn = scan.nextLine();
                    log+=userIn+"\n";
                    evaluateAnswer(result, userIn);
                } while (numHint<result.length() && userIn.equalsIgnoreCase("H"));
            }
            generateQuestion(year);
            questionAsked++;
        }else if (userIn.equalsIgnoreCase("q")) {
            try{
                PrintWriter output = new PrintWriter(System.currentTimeMillis()+ ".txt");
                output.print(log);
                output.close();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }System.exit(0);
        } else evaluateAnswer(result, userIn);
        }
    private void finalScore() {
        out = "your final score was " + calculatedPercentage;
        out += "%.\n";
        log += out;
        printOutput(out);
        if (calculatedPercentage < 40) {
            out = "Bad luck. Try practicing with some lower year levels to build your confidence and skills.\n";
            log += out;
            printOutput(out);
        } else if (calculatedPercentage <= 49) {
            out = "That was a good effort, but you may need to work on some expressions.\n";
            log += out;
            printOutput(out);
        } else if (calculatedPercentage <= 59) {
            out = "Congratulations you passed. Keep practicing at this year level to improve your score.\n";
            log += out;
            printOutput(out);
        } else if (calculatedPercentage <= 74) {
            out = "Well done. That was a good effort.\n";
            log += out;
            printOutput(out);
        } else if (calculatedPercentage <= 84){
            out="Good job. You should try the next year level in your next test.\n";
            log += out;
            printOutput(out);
        }else{
            out="Excellent work! You really know your stuff. Try the harder levels next time.\n";
            log += out;
            printOutput(out);
        }}

    /** Evaluate the user input in the generate question session:
     * Compare the String result and the String user input with .equal
     * If the answer is correct both totalQAns and correct will +1
     * If not only the totalQAns will +1
     * Then calculate the average and format it to 2 d.p*/

    private void evaluateAnswer(String result, String userIn) {
        if (userIn.equalsIgnoreCase(result)) {
            correct++;
            totalQAns++;
            out="Correct! Well Done!\n";
            log+=out;
            printOutput(out);
        }else{
            out="Bad luck that was incorrect. The correct answer was " + result +"\n";
            log+=out;
            printOutput(out);
            totalQAns++;}
        double average = ((double) correct/totalQAns)*100.00;
        calculatedPercentage = Double.parseDouble(df.format(average));
        out="Your current percentage is "+ calculatedPercentage;
        out+="%\n";
        log+=out;
        printOutput(out);
        }

    private int getMax(int year) {
       int max;
       switch(year){
           case (3),(4) ->max=99;
           case (5),(6)-> max=999;
           case (7) ->max=9999;
           default -> max=9;
       }return max;
    }
    private int getMin(int year) {
        int min;
        switch (year){
            /**case (4) -> min=-99; (for year level 4 to include -ve numbers)*/
            case(5),(6)->min=-999;
            case (7)-> min=-9999;
            default -> min=0;
        }return min;
    }
    private int operatorBounds (int year){
        int ob;
        switch (year){
            case (1),(2)->ob=2;
            case (3),(4),(5),(6)->ob=4;
            case(7)->ob=5;
            default -> ob=1;
        }return ob;
    }
    }


