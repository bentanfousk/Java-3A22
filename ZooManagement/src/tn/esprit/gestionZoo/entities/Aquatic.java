package tn.esprit.gestionZoo.entities;

public class Aquatic extends Animal {
     protected String habitat;

     public Aquatic() {}

    public Aquatic(String name,String family, int age, boolean isMammal, String habitat) {
         super(name, family, age, isMammal);
         this.habitat = habitat;
    }

    public String getHabitat() {
         return habitat;
    }
    public void setHabitat(String habitat) {
         this.habitat = habitat;
    }

    @Override
    public String toString(){
         return super.toString() + "Habitat: " + habitat;
    }

    public void swim(){
        System.out.println("This aquatic animal is swimming");
    }
}
