package org.example.Shapes;

public abstract class Forma {
    int x, y;

    public Forma(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public abstract void deseneaza();
}
