

public class ZooManagment {

    Animal [] animals;
    int NBRCAGES=25;
    String Name ;
    String city;

    ZooManagment(String Name, String city) {

        this.Name = Name;
        this.city = city;
        animals = new Animal[NBRCAGES];

    }
    public String toString() {
        return "name:" + Name + " |city:" + city ;
    }


//    void displayInformation(){
//        System.out.println(zooName + " has " + nbrCages + " cages");
//    }

}