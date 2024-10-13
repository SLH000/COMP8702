package practical05;
import javax.imageio.stream.ImageInputStream;
public class Frog {
//Task 1
    /*String name = "Name not set";
    int age = 0;
    int id = -1; // -1 used to indicate it has not been set

    String printAgeGroup(){
        if ((this.age >= 0) && (this.age <=20)){
           return "young";
        }else if (this.age >= 21 && this.age <=50 ){
            return "juvenile";
        } return "adult";
    }
        public void print() {
        System.out.println("**** Start of print method ****");
        System.out.println("Frog's name is " + name);
        //System.out.println("Frog's age is " + age);
        System.out.println("Id  is " + id);*/
//Task 2
    private int age = 0;
    private int id = -1;
    private String name = "Name not set";
    public Frog(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }
    String printAgeGroup(){
        if ((this.age >= 0) && (this.age <=20)){
            return "Age group is young";
        }else if (this.age >= 21 && this.age <=50 ){
            return "Age group is juvenile";
        } return "Age group is adult";
    }
    public String getName() {return this.name;}
    public int getAge() {return this.age;}
    public int getId() {return this.id;}

//Task 3
    String reverseName(){
        for (int i = 0; i<this.name.length(); i++){
            char c = this.name.charAt(i);
            switch (c){
                case 'a', 'A' -> System.out.print('i');
                case 'n', 'N' -> System.out.print('i');
                case 'r', 'R' -> System.out.print('o');
                case 'F', 'f' -> System.out.print('o');
                default -> System.out.print(c);
            }
        }
        return "";
    }
//Task 4
        Frog greaterAge (Frog frog){
        if (this.age > frog.getAge()){
            return this;
        }return frog;
        }
    public void print() {
        System.out.println("**** Start of print method ****");
        System.out.println("Frog's name is " + name);
        //System.out.println("Frog's age is " + age);
        System.out.println("Id  is " + id);
    }
}
