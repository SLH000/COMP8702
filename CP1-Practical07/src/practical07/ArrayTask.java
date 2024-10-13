package practical07;
/*public class ArrayTask {
    public static void main(String[] args) {
        int[] intList = {5, 20, 32, 7, 9};
        int [] copy = new int [5];
        int sum=0;
        int sum1=0;
        int sum2=0;
        for (int i = 0; i < intList.length; i++) {
            System.out.println("intList[" + i + "]: " + intList[i]);
        } System.out.println();
        //Task 1
        for (int i = intList.length-1; i>=0; i--)
            System.out.println("intList[" + i + "]: " + intList[i]);
        //Task 2
        for (int i = 0; i < intList.length; i++)
            sum +=intList[i];
        System.out.println("Sum = "+sum);
        System.out.println();
        //Task 3.2
        for (int i=0; i<intList.length; i++){
            copy[i] = intList[i];
            sum1 +=copy[i];}
        //Task 3
        for (int i = intList.length-1; i >=0; i--){
            intList[i] = intList[i]+1;
            sum2 += intList[i];
        System.out.println("intList[" + i + "]: " + intList[i]);}
        System.out.println("Sum = "+sum2);
        System.out.print("Sum of copy = " + sum1);}}*/

//Task 4
public class ArrayTask {
    public static void main (String[] args) {
/*        IntList list1 = new IntList();
        list1.printList();
        list1.insertAtEndofList(42);
        list1.printList();
        list1.insertAtEndofList(2);
        list1.printList();
        System.out.println(list1.getElementAt(3));
        System.out.println(list1.getElementAt(-1));
        System.out.println(list1.getElementAt(1));
        list1.insertAtEndofList(7);
        list1.insertAtEndofList(9);
        list1.printList();
        list1.insertAtEndofList(100);*/


                IntList list1 = new IntList();
                list1.insertAtEndofList(42);
                list1.insertAtEndofList(2);
                list1.insertAtEndofList(7);
                list1.printList();
                if(list1.contains(2)) {
                    System.out.println("Contains 2");
                }
                if(list1.contains(54)) {
                    System.out.println("Contains 54");
                }
        list1.delete(99);
        list1.delete(2);
        list1.printList();
        list1.insertAtEndofList(2);
        list1.printList();
    }
}