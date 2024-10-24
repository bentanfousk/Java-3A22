package tn.esprit.gestionZoo.entities;

public class ZooManagment {



    private static final int NBRCAGES=25;
    private String Name ;
    private String city;
    private int nbAnimeaux=0;
    private int nbAquatics=0;
    private Animal[] animals;
    private Aquatic[] aquaticAnimals;



    public ZooManagment() {
        animals=new Animal[NBRCAGES];
    }

    public ZooManagment(String Name, String city) {

        this.Name = Name;
        this.city = city;
        animals = new Animal[NBRCAGES];
        aquaticAnimals = new Aquatic[10];

    }

    public String getName() {
        return Name;
    }
    public String getCity() {
        return city;
    }
    public int getNbAnimeaux() {
        return nbAnimeaux;
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public void setName(String name) {
        if(name.isEmpty())
            System.out.println("Name is empty");
        else
            this.Name = name;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public void setNbAnimeaux(int nbAnimeaux) {
        this.nbAnimeaux = nbAnimeaux;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public void setAquaticAnimals(Aquatic[] aquaticAnimals) {
        this.aquaticAnimals = aquaticAnimals;
    }
    public Aquatic[] getAquaticAnimals() {
        return aquaticAnimals;
    }

    @Override
    public String toString() {

        return "name:" + Name + " |city:" + city ;
    }

   public boolean addAnimal(Animal a) {
        if(searchAnimal(a)!=-1 || isZooFull())
            return false;



        if (nbAnimeaux < NBRCAGES) {
            animals[nbAnimeaux++] = a;
            return true;

        }
        return false;

   }
   public void showAnimals() {
        if(nbAnimeaux<1){
            System.out.println("No animals found");
        }
        else {
            for(int i=0;i<nbAnimeaux;i++){

                System.out.println("Animal "+ (i+1) +": "+animals[i].toString());
            }
        }
   }

    public int searchAnimal(Animal animal){
        int index=0;
        while(index<nbAnimeaux && !animals[index].getName().equals(animal.getName())){
            index++;
        }

        if(index==nbAnimeaux){
            return -1;
        }

        return index;

    }

    public boolean removeAnimal(Animal animal){
        int index=searchAnimal(animal);
        if(index!=-1){
            for(int i=index+1;i<nbAnimeaux;i++){
                animals[i]=animals[i+1];
            }
            nbAnimeaux--;
            animals[index]=null;
            return true;
        }
        return false;

    }

    public boolean isZooFull(){
        return nbAnimeaux == NBRCAGES;
    }


    public ZooManagment comparerZoo(ZooManagment z1, ZooManagment z2){
        if(z1.nbAnimeaux> z2.nbAnimeaux){
            return z1;
        }
        else
            return z2;
    }

    public void addAquaticAnimal(Aquatic aquatic){
       aquaticAnimals[nbAquatics]=aquatic;
       nbAquatics++;

    }

    public float maxPenguinSwimmingDepth(){
       float max=0f;
       for (int i=0;i<nbAquatics;i++){
           if(aquaticAnimals[i] instanceof Penguin){
               if(((Penguin)aquaticAnimals[i]).getSwimmingDepth()>max){
                   max=((Penguin)aquaticAnimals[i]).getSwimmingDepth();
               }
           }
       }
       return max;
    }

    public void displayNumberOfAquaticsByType(){
        int nbPenguis=0;
        int nbDolphins=0;
        for(Aquatic a : aquaticAnimals){
            if(a!=null){
                if(a instanceof Penguin){
                    nbPenguis++;

                }
                else if(a instanceof Dolphin){
                    nbDolphins++;
                }
            }
        }
        System.out.println("Number of Penguins : "+nbPenguis);
        System.out.println("Number of Dolphins : "+nbDolphins);
    }

}

