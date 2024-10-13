package practical06;

public class Counter {
    // An instance variable to keep track of which number we are up to
    private int currentCount, stepSize;
    private char op;

    // The constructor receives an int as a parameter and stores
    // it in currentCount
    public Counter(int startValue) {
        currentCount = startValue;
        stepSize =1; // Task 4
    }
    // A method to print out the next n numbers
    public void countUp(int n) {
        System.out.println("Creating Counter object with a starting value of " + currentCount);
        System.out.println("*** Counting up " + n);
        for (int step = 1; step <= n; step++) {
            System.out.println("counter = " + currentCount);
            currentCount += 1;}}
    public void countDown(int n) { //Task 1 & 2
        System.out.println("*** Counting down " + n);
        for (int step = 1; step <= n; step++) {
            currentCount -= 1;
            System.out.println("counter = " + currentCount);
            if (currentCount <= 0) {
                break;}}}
    public void countUp(int n, int stepSize) { //Task 3
        System.out.println("Creating Counter object with a starting value of " + currentCount + " and a step size of " + stepSize);
        System.out.println("*** Counting up " + n);
        for (int step = 1; step <= n; step++) {
            System.out.println("counter = " + currentCount);
            currentCount = currentCount + stepSize;}}
//Task 4
    public Counter(int startValue, int steps) {
        currentCount = startValue;
        stepSize = steps;}
    /* If, else if
    public void countUp(int n, char op){
        System.out.println("Creating Counter object with a starting value of "+ currentCount + " and a step size of " + stepSize);
        System.out.println("*** Counting up " + n +", operation is " + op);
        if(op == '+'){
            for (int step = 1; step <=n; step++){
                System.out.println("counter = "+ currentCount);
                currentCount = currentCount + stepSize;}
        }else if (op == '-'){
            for (int step =1; step <=n; step++){
                System.out.println("counter = "+ currentCount);
                currentCount = currentCount - stepSize;}
        }else if (op == '*') {
            for (int step = 1; step <= n; step++) {
                System.out.println("counter = " + currentCount);
                currentCount = currentCount * stepSize;}
        } System.out.println("Invalid operation");
    } */
    //Switch
    public void countUp(int n, char op){
        System.out.println("Creating Counter object with a starting value of "+ currentCount + " and a step size of " + stepSize);
        System.out.println("*** Counting up " + n +", operation is " + op);
        switch (op){
            case ('+'):
                for (int step = 1; step <=n; step++){
                    System.out.println("counter = "+ currentCount);
                    currentCount = currentCount + stepSize;}
                break;
            case ('-'):
                for (int step =1; step <=n; step++){
                    System.out.println("counter = "+ currentCount);
                    currentCount = currentCount - stepSize;}
                break;
            case ('*'):
                for (int step = 1; step <= n; step++) {
                    System.out.println("counter = " + currentCount);
                    currentCount = currentCount * stepSize;}
                break;
            default:System.out.println("Invalid operation");}}

    }

