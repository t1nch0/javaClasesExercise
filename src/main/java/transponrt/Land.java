package transponrt;

/**
 * @version 1.1
 * @autor Martin Fernandez
 */
public abstract class Land extends Transport {
    boolean hasMotor;

    public Land(String name, int price, boolean hasMotor) {
        super(name, price);
        this.hasMotor = hasMotor;
    }

    String displayData() {
        return "name= " + name + ", price= " + price + ", hasMotor " + hasMotor;
    }


}
