package org.example.Shapes;

public class Dreptunghi implements Desenabil {
    int L, l;

    public Dreptunghi(int lungime, int latime) {
        this.L = lungime;
        this.l = latime;
    }

    @Override
    public void deseneaza() {
        System.out.println("desenam un dreptunghi cu lungimea de " + L + " si latimea de " + l);
    }
}
