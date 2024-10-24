package tn.esprit.gestionZoo.entities;

public abstract class Aquatic extends Animal {
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

    public abstract void swim();

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if(obj ==null) return false;
        if(obj instanceof Aquatic a){
            return name.equals(a.name) && age == a.age && habitat.equals(a.habitat);
        }
        return false;
    }
}
