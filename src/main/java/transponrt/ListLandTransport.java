package transponrt;

import java.util.ArrayList;
import java.util.List;


/**
 * @version 1.1
 * @autor Martin Fernandez
 */
public class ListLandTransport {
    public List<Land> land = new ArrayList<>();

    void addLand(Land land) {

        this.land.add(land);
    }

    void display() {
        land.forEach(s -> System.out.println(s.displayData()));
    }
}
