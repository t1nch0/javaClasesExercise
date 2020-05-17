package transponrt;

/**
 * @version 1.1
 * @autor Martin Fernandez
 */
public class Bicycle extends Land {
    boolean exerciseBike;

    @Override
    String displayData() {
        return "name= " + name + ", price= " + price + ", hasMotor " + hasMotor + ", exercise= " + exerciseBike;
    }

    Bicycle(String name, int price, boolean hasMotor, boolean exerciseBike) {
        super(name, price, hasMotor);
        this.exerciseBike = exerciseBike;

    }
}
