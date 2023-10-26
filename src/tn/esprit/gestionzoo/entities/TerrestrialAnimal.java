package tn.esprit.gestionzoo.entities;

import tn.esprit.gestionzoo.entities.Animal;

public final  class TerrestrialAnimal extends Animal {
    private int nbrLegs;

    public TerrestrialAnimal(String family, String name, int age, boolean isMammal, int nbrLegs) {
        super(family, name, age, isMammal);
        this.nbrLegs = nbrLegs;
    }

    public int getNbrLegs() {
        return nbrLegs;
    }

    public void setNbrLegs(int nbrLegs) {
        this.nbrLegs = nbrLegs;
    }

    @Override
    public String toString() {
        return "TerrestrialAnimal{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", isMammal=" + isMammal() +
                ", nbrLegs=" + nbrLegs +
                '}';
    }
}