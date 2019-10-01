package principleleastknowledge;

public class Car {

    Engine engine;

    public Car() {
        engine = new Engine();
    }

    public void start(Key key) {
        Doors doors = new Doors();

        boolean authorized = key.isTurns();

        if (authorized) {
            engine.start();
            updateDashboardDisplay();
            doors.lock();
        }
    }

    private void updateDashboardDisplay() {
        System.out.println("Welcome...");
    }
}
