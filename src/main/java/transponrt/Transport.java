package transponrt;

/**
 * @version 1.1
 * @autor Martin Fernandez
 */
public class Transport {
    String name;
    int price;

    public Transport(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }


}
