package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;

public class Main {
    public static void main(String[] args) {
        Zoo myZoo = new Zoo("zooo", "friguia");

        Animal lion = new Animal("Felidae", "Simba", 5, true);
        Animal elephant;
        elephant = new Animal("Elephantidae", "Dumbo", 3, true);

        AquaticAnimal shark = new AquaticAnimal("Fish", "Sardine", 2, true, "Sea");
        TerrestrialAnimal terrestrial = new TerrestrialAnimal("Panda", "Narla", 4, true, 2);
        Dolphin dolphin = new Dolphin("Delphinidae", "Flipper", 5, true, "Ocean", 14.5f);
        Penguin penguin = new Penguin("Spheniscidae", "Skipper", 3, true, "Ocean", 25.3f);



        // Ajout des animaux aquatiques au zoo
        myZoo.addAquaticAnimal(shark);

        myZoo.addAquaticAnimal(shark);
        myZoo.addAquaticAnimal(dolphin);
        myZoo.addAquaticAnimal(penguin);





        dolphin.swim(); // Appelle la méthode swim() héritée de la classe AquaticAnimal


        // Ajout d'animaux au zoo
        myZoo.addAnimal(lion);
        myZoo.addAnimal(elephant);
        myZoo.addAnimal(dolphin);

        // Recherchez un animal par ses caractéristiques
        //Animal searchAnimal = new Animal("Felidae", "Simba", 5, true);
       // int foundIndex = myZoo.searchAnimal(searchAnimal);
        //if (foundIndex != -1) {
          //  System.out.println("L'animal a été trouvé à l'indice " + foundIndex);
       // } else {
         //   System.out.println("L'animal n'a pas été trouvé.");
       // }
   // }
    }
}