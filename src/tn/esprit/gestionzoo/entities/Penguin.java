package tn.esprit.gestionzoo.entities;

import tn.esprit.gestionzoo.entities.AquaticAnimal;

public final class Penguin extends AquaticAnimal {
    private float swimmingDepth;

    public Penguin(String family, String name, int age, boolean isMammal, String habitat, float swimmingSpeed) {
        super(family, name, age, isMammal, habitat);
        this.swimmingDepth= swimmingSpeed;
    }

    public float getSwimmingSpeed() {
        return swimmingDepth;
    }

    public void setSwimmingSpeed(float swimmingSpeed) {
        this.swimmingDepth = swimmingSpeed;
    }
    public String toString() {
        return "TerrestrialAnimal{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", isMammal=" + isMammal() +
                ", habitat=" + getHabitat() +
                ", swimmingSpeed=" + swimmingDepth +

                '}';
    }
}
