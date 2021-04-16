package org.example.figures;

import org.example.figures.AbstractFigure;

public class Rectangle extends AbstractFigure {

    private int sideA;
    private int sideB;

    public Rectangle() {
    }

    public Rectangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double perimeter() {
        return 2 * (sideA + sideB);
    }

    @Override
    public double square() {
        return sideA * sideB;
    }
}
