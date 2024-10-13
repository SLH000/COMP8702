package practical07;
public class IntList {
    private int[] array = new int[4];
    private int listLength = 0;
    public void printList() {
        for (int i = 0; i < array.length; i++) {
            if (array[0] == 0) {
                System.out.println("List is empty");
                break;
            } else if (array[i] > 0) {
                System.out.println("Printing List...");
                for (i = 0; i < listLength; i++) {
                    System.out.println("Element " + i + " = " + array[i]);
                }}}}
    public void insertAtEndofList(int endNum) {
        if (listLength < array.length){
            array[listLength] = endNum;
        listLength++;
        System.out.println(endNum + " inserted");}
        else
            System.out.println("Insertion of "+endNum+" failed");}
    public int getElementAt(int n){
        if (n<0 || n> listLength){
        System.out.println("Invalid index: " + n);
        return 0;}
        return (array[n]);}
    public boolean contains (int para){
        if (para<listLength){
            return true;}
        return false;}
    public int delete (int para){
        for(int i=0; i<listLength; i++) {
            if(para==array[i])
        return array;
    }}
}

