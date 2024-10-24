package tn.esprit.gestionZoo.entities;

public class Penguin extends Aquatic{
    protected float swimmingDepth;

    public Penguin(){
        System.out.println("Penguin");

    }
    public Penguin(String name, int age, String family,boolean isMammal,String habitat, float swimmingDepth){
        super(name, family, age, isMammal, habitat);
        this.swimmingDepth = swimmingDepth;

    }

    public float getSwimmingDepth() {
        return swimmingDepth;
    }
    public void setSwimmingDepth(float swimmingDepth) {
        this.swimmingDepth = swimmingDepth;
    }


    @Override
public String toString(){
        return super.toString() + "swimmingDepth: " + swimmingDepth;
}

@Override
    public void swim(){
    System.out.println("Penguin swimming");
}
}
