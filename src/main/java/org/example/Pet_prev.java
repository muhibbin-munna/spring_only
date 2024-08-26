package org.example;

public class Pet_prev {

//    private int age;

//    public Pet(int age) {
//        this.age = age;
//    }
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }

    Cat cat;

    public Pet_prev(Cat cat) {
        this.cat = cat;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }


    public Pet_prev(){
        System.out.println("Pet constructor");
    }

    public void manage () {
        cat.sound();;
        System.out.println("I am your pet");
    }
}
