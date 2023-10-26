package tn.esprit.gestionzoo.entities;

import tn.esprit.gestionzoo.entities.AquaticAnimal;

public final  class Dolphin extends AquaticAnimal {
    private float swimmingSpeed;

    public Dolphin(String family, String name, int age, boolean isMammal, String habitat, float swimmingSpeed) {
        super(family, name, age, isMammal, habitat);
        this.swimmingSpeed = swimmingSpeed;
    }

    public float getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(float swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }
    public String toString() {
        return "TerrestrialAnimal{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", isMammal=" + isMammal() +
                ", habitat=" + getHabitat() +
                ", swimmingSpeed=" + swimmingSpeed +

                '}';
    }
}
