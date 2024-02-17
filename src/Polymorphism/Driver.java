package Polymorphism;

public class Driver {
    private static Ship[] ships = new Ship[3];

    public static void main(String[] args) {
        ships[0] = new Ship("Mayflower", "1620");
        ships[1] = new CruiseShip("RMS Titanic", "1912", 3547);
        ships[2] = new CargoShip("Madrid Maersk", "2017", 20568);

        for (Ship ship : ships) {
            ship.print();
            System.out.println();
        }
    }
}
