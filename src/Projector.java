public class Projector implements Stateable{

    public Projector() {
    }

    @Override
    public void on() {
        System.out.println("Projector is ON");
    }

    @Override
    public void off() {
        System.out.println("Projector is OFF");
    }

    public void tvMode() {
        System.out.println("Screen is TV mode");
    }

    public void wideScreenMode() {
        System.out.println("Screen is wide screen mode");
    }
}
