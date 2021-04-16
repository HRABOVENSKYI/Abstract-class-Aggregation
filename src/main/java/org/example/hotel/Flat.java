package org.example.hotel;

import java.util.Arrays;

public class Flat {

    private int number;
    private Hall hall;
    private Bathroom bathroom;
    private Room[] rooms;

    public Flat(int number) {
        this.number = number;
        this.hall = new Hall(5);
        this.bathroom = new Bathroom(3);
        rooms = new Room[]{new Room(10)};
    }

    public Flat(int number, Hall hall, Bathroom bathroom, Room[] rooms) {
        this.number = number;
        this.hall = hall;
        this.bathroom = bathroom;
        this.rooms = rooms;
    }

    public Flat(int number, double hallSquare, double bathroomSquare, double... roomsSquare) {
        this.number = number;
        this.hall = new Hall(hallSquare);
        this.bathroom = new Bathroom(bathroomSquare);
        rooms = new Room[roomsSquare.length];
        for (int i = 0; i < roomsSquare.length; i++) {
            rooms[i] = new Room(roomsSquare[i]);
        }
    }

    public double getRoomsSquare() {
        double sum = 0;
        for (Room room : rooms) {
            sum += room.getSquare();
        }
        return sum;
    }

    public double square() {
        return hall.getSquare() + bathroom.getSquare() + getRoomsSquare();
    }

    @Override
    public String toString() {
        return "Flat{" +
                "number=" + number +
                ", hall=" + hall +
                ", bathroom=" + bathroom +
                ", rooms=" + Arrays.toString(rooms) +
                '}';
    }
}
