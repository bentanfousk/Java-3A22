package tn.esprit.gestionZoo.entities;


public class Animal {

    private String family ;
    private String name;
    private int age;
    private boolean isMammal;

    public Animal() {}

    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }

    public String toString() {
        return "name:" + name + " |family:" + family + " |age:" + age + " |isMammal:" + isMammal ;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getFamily() {
        return family;

    }
    public void setFamily(String family) {
        this.family = family;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if(age < 0 )
            System.out.println("Invalid Age");
        else
            this.age = age;


    }
    public boolean isMammal() {
        return isMammal;
    }
    public void setMammal(boolean mammal) {
        isMammal = mammal;
    }


}
