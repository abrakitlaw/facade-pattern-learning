public class Tuner implements Stateable {

    private String frequency;


    @Override
    public void on() {
        System.out.println("Tuner is ON");
    }

    @Override
    public void off() {
        System.out.println("Tuner is OFF");
    }

    public void setAM(String am) {
        frequency = am;
    }

    public void setFM(String fm) {
        frequency = fm;
    }

    public void setFrequency(int frequency) {
        System.out.println("Frequency is " + frequency);
    }
}
