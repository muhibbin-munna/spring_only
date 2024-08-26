package org.example;

public class Pet {
    Animal animal;

    public Pet (){
        System.out.println("Pet constructor");
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public void manage () {
        animal.sound();
        System.out.println("I am your pet");
    }
}
