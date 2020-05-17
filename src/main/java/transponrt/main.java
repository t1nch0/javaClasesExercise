package transponrt;

/**
 * @version 1.1
 * @autor Martin Fernandez
 */
public class main {
    public static void main(String[] args) {
        ListLandTransport trans = new ListLandTransport();
        trans.addLand(new Bicycle("cross", 1500, false, false));
        trans.addLand(new Car("Audi", 20000, true, false));
        trans.display();
    }
}

