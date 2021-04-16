package org.example.figures;

import org.example.figures.AbstractFigure;

public class Circle extends AbstractFigure {

    private int x;
    private int y;
    private int radius;

    public Circle() {
    }

    public Circle(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double square() {
        return Math.PI * Math.pow(radius, 2);
    }
}
