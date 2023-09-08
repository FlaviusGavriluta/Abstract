package org.example;

public class Cat extends Animal implements AnimalStuff{
    public Cat(int age, String name) {
        super(age, name);
    }

    @Override
    public void makeNoise() {
        System.out.println("Meow Meow!");
    }

    @Override
    public void poop() {
        System.out.println("Phlkalkasdfoasfpvb");
    }
}
