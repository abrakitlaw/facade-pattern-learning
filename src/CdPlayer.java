public class CdPlayer implements Playable, Stateable {

    @Override
    public void on() {
        System.out.println("Cd player is ON");
    }

    @Override
    public void off() {
        System.out.println("Cd player is OFF");
    }

    @Override
    public void eject() {
        System.out.println("Cd player is eject");
    }

    @Override
    public void pause() {
        System.out.println("Cd player is pause");
    }

    @Override
    public void play(String movie) {
        System.out.println(movie + " is playing");
    }

    @Override
    public void stop() {
        System.out.println("Cd player is stopping");
    }

    public void play() {
        System.out.println("Cd player is playing");
    }
}
