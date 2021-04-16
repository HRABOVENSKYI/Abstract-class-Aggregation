package org.example.hotel;

public class Room extends AbstractRoom {

    public Room(double square) {
        super(square);
    }

    @Override
    public String toString() {
        return "Room{" + super.toString() + "}";
    }
}
