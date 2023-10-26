package tn.esprit.gestionzoo.entities;

import tn.esprit.gestionzoo.entities.Animal;

sealed public abstract class AquaticAnimal extends Animal permits Dolphin, Penguin {
    private String habitat;

    public AquaticAnimal(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
    @Override
    public String toString() {
        return "TerrestrialAnimal{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", isMammal=" + isMammal() +
                ", habitat=" +  habitat +
                '}';
    }
    public abstract void swim(){
        System.out.println("This aquatic animal is swimming.");}


    public boolean equals(Object obj){
        if(obj == null){
            return false ;
        }
        if(obj.getClass() != this.getClass()){
            return false;
        }
        AquaticAnimal aquatic=(AquaticAnimal)obj;
        return this.getName().equals(aquatic.getName()) && this.habitat.equalsIgnoreCase(aquatic.habitat) && this.getAge() == aquatic.getAge(); }
}





