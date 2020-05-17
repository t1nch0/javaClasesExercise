package transponrt;

/**
 * @version 1.1
 * @autor Martin Fernandez
 */
public class Car extends Land {
    boolean useGas;

    @Override
    String displayData() {
        return "name= " + name + ", price= " + price + ", hasMotor " + hasMotor + ", useGas= " + useGas;
    }

    Car(String name, int price, boolean hasMotor, boolean useGas) {
        super(name, price, hasMotor);
        this.useGas = useGas;

    }
}
