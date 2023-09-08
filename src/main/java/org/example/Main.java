package org.example;

public class Main {
    public static void main(String[] args) {
        Cat myCat = new Cat(2, "Kitty");
        myCat.makeNoise();
        myCat.printName();
        myCat.poop();

        Dog myDog = new Dog(4, "Rocky");
        myDog.makeNoise();
        myDog.printName();
        myCat.poop();
    }
}