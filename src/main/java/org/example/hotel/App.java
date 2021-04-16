package org.example.hotel;

public class App {

    public static void main(String[] args) {

        Flat flat1 = new Flat(1);
        Flat flat2 = new Flat(2, new Hall(2), new Bathroom(3),
                new Room[] {new Room(4), new Room(5)});
        Flat flat3 = new Flat(3, 4, 5, 6, 4, 4);

        Flat[] flats = new Flat[] {flat1, flat2, flat3};

        for (Flat flat : flats) {
            System.out.println(flat);
        } // Flat{number=1, hall=Hall{square=5.0}, bathroom=BathRoom{square=3.0}, rooms=[Room{square=10.0}]}
          // Flat{number=2, hall=Hall{square=2.0}, bathroom=BathRoom{square=3.0}, rooms=[Room{square=4.0}, Room{square=5.0}]}
          // Flat{number=3, hall=Hall{square=4.0}, bathroom=BathRoom{square=5.0}, rooms=[Room{square=6.0}, Room{square=4.0}, Room{square=4.0}]}

    }
}
