package principleleastknowledge;

public class TestDrive {

    public static void main(String[] args) {
        Car car = new Car();

        Key key = new Key();
        key.setTurns(true);

        car.start(key);
    }
}
