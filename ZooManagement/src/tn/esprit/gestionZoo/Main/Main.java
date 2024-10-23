package tn.esprit.gestionZoo.Main;

import  tn.esprit.gestionZoo.entities.*;



public class Main {

    public static void main(String[] args) {
        Animal lion=new Animal("cats","lion",20,true);
        Animal bob=new Animal("cats","bob",20,true);
        Animal me3za=new Animal("cats","me3za",20,true);
        ZooManagment zoo=new ZooManagment("myZoo","Tunis");


        zoo.showAnimals();
        if(zoo.addAnimal(lion)) System.out.println("lion added");
        if(zoo.addAnimal(bob)) System.out.println("bob added");
        if(zoo.addAnimal(me3za)) {System.out.println("me3za added");}
        else System.out.println("me3za not added");



        System.out.println(zoo.toString());
        zoo.showAnimals();
//        System.out.println(zoo.searchAnimal(lion));
//        System.out.println(zoo.searchAnimal(bob));
//        System.out.println(zoo.searchAnimal(me3za));



    Penguin penguin=new Penguin();
    Dolphin dolphin=new Dolphin();
    Aquatic aquatic=new Aquatic();
    aquatic.swim();
    dolphin.swim();
    penguin.swim();


    }
}