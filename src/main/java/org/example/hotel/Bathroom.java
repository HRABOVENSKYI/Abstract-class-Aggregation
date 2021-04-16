package org.example.hotel;

public class Bathroom extends AbstractRoom {

    public Bathroom(double square) {
        super(square);
    }

    @Override
    public String toString() {
        return "BathRoom{" + super.toString() + "}";
    }
}
