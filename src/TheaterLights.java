public class TheaterLights implements Stateable {

    @Override
    public void on() {
        System.out.println("Theater lights is ON");
    }

    @Override
    public void off() {
        System.out.println("Theater lights is OFF");
    }

    public void dim(int dim) {
        System.out.println("Theater lights is Dimming " + dim);
    }
}
