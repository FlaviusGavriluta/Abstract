package org.example.Shapes;

public class Cerc extends Forma implements Desenabil {
    int raza;

    public Cerc(int x, int y, int raza) {
        super(x, y);
        this.raza = raza;
    }

    @Override
    public void deseneaza() {
        System.out.println("Desenăm un cerc la coordonatele (" + x + ", " + y + ") cu raza " + raza);
    }
}
