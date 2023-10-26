package tn.esprit.gestionzoo.entities;

public class Zoo {
    private Animal[] animals;
    private String name;
    private String city;
    private final int NBR = 25;
    private int i;
    public Animal[] aquaticAnimals;
    int aquaticAnimalsCount ;

    public Zoo(String name, String city) {
        animals = new Animal[NBR];
        this.name = name;
        this.city = city;
        aquaticAnimals = new Animal[10];

    }

    public void addAquaticAnimal(AquaticAnimal aquatic)
    {
        if(aquaticAnimalsCount<10){
            aquaticAnimals[aquaticAnimalsCount]=aquatic ;
            aquaticAnimalsCount++;
        }
        else{
            System.out.println("tableau Plein");
        }
    }

    public void displayAquaticAnimals(){
        for(Animal a: aquaticAnimals){
            if(a != null)
                a.swim();
        }

    }

    public float maxPenguinDepth(){
        float max=0;
        for (int i=0;i<aquaticAnimalsCount ;i++){
            if(aquaticAnimals[i] instanceof Penguin){
                if(max<((Penguin) aquaticAnimals[i]).getSwimmingSpeed()){
                    max=((Penguin) aquaticAnimals[i]).getSwimmingSpeed();
                }
            }
        }
        return max ;
    }

    public void displayNumberOfAquaticsByType(){
        float nbd=0;
        float nbp=0;
        for (AquaticAnimal a: aquaticAnimals){
            if(a instanceof Penguin){
                nbp++;
            }
            else {
                nbd++;
            }
        }
        System.out.println("nb de dophin:"+nbd+"nb de penguins"+nbp );
    }





    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public int getNBR() {
        return NBR;
    }

    public Animal[] getAnimals() {
        return animals;
    }

    @Override
    public String toString() {
        return "Zoo Name: " + name + "\nCity: " + city + "\nNumber of Cages: " + NBR;
    }

    public void addAnimal(Animal animal) {
        if (animal == null) {
            System.out.println("Animal cannot be null.");
            return;
        }

        if (isZooFull(this)) {
            System.out.println("The zoo is full.");
            return;
        }

        for (int i = 0; i < animals.length; i++) {
            if (animals[i] == null) {
                animals[i] = animal;
                System.out.println(animal + " has been added to the zoo.");
                return;
            }
        }

        System.out.println("Something went wrong while adding the animal.");
    }

    public int searchAnimal(Animal animalToFind) {
        int i = 0;
        while (i < NBR) {
            if (animals[i] != null && animals[i].equals(animalToFind)) {
                return i; // L'animal a été trouvé à l'indice i
            }
            i++;
        }

        return -1; // L'animal n'a pas été trouvé dans the zoo
    }


    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.getNBR() > z2.getNBR()) {
            return z1;
        } else if (z1.getNBR() < z2.getNBR()) {
            return z2;
        } else {
            return null;
        }
    }

    public static boolean isZooFull(Zoo zoo) {
        return (zoo.getNBR() >= zoo.getAnimals().length);
    }
}


