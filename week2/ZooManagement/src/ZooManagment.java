

public class ZooManagment {

    Animal[] animals;
    static final int NBRCAGES=25;
    String Name ;
    String city;
    int nbAnimeaux=0;

    ZooManagment(String Name, String city) {

        this.Name = Name;
        this.city = city;
        animals = new Animal[NBRCAGES];

    }

    @Override
    public String toString() {

        return "name:" + Name + " |city:" + city ;
    }

   public boolean addAnimal(Animal a) {
        if(searchAnimal(a)!=-1)
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
        while(index<nbAnimeaux && !animals[index].equals(animal)){
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


}