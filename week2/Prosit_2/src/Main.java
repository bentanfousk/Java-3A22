import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Animal lion=new Animal("cats","lion",20,true);
        ZooManagment zoo=new ZooManagment("myZoo","Tunis");
        System.out.println(zoo.toString());
        System.out.println(lion.toString());

    }
}