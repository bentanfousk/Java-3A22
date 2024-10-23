package tn.esprit.gestionZoo.entities;

public class Terrestrial extends Animal{
    protected int nbrLegs;

    public Terrestrial(){

    }
    public Terrestrial( String name,String family, int age, boolean isMammal ,int nbrLegs) {
        super(name,family,age,isMammal);
        this.nbrLegs = nbrLegs;
        System.out.println("Terrestrial constructor param");
    }
    public int getNbrLegs() {
        return nbrLegs;
    }
    public void setNbrLegs(int nbrLegs) {
        this.nbrLegs = nbrLegs;
    }
}
