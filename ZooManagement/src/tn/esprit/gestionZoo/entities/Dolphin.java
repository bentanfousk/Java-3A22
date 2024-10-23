package tn.esprit.gestionZoo.entities;

public class Dolphin extends Aquatic{
    protected float swimmingSpeed;

    public Dolphin(){}

    public Dolphin(String name, int age, String family,boolean isMammal,String habitat, float swimmingSpeed){
        super(name, family, age, isMammal, habitat);
        this.swimmingSpeed = swimmingSpeed;
    }
    public float getSwimmingSpeed() {
        return swimmingSpeed;
    }
    public void setSwimmingSpeed(float swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }


    @Override
    public String toString() {
        return super.toString() + "swimmingSpeed: " + swimmingSpeed;
    }

    @Override
    public void swim(){
        System.out.println("Swimming Dolphin");
    }

}
