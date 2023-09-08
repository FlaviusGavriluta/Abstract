package org.example;

public class Dog extends Animal implements AnimalStuff {
    public Dog(int age, String name) {
        super(age, name);
    }

    @Override
    public void makeNoise() {
        System.out.println("Woff Woff!");
    }

    @Override
    public void poop() {
        System.out.println("Brrrasdfasdf");
    }
}
