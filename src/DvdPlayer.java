public class DvdPlayer extends Amplifier implements Playable, Stateable {

    private String channelAudio;

    @Override
    public void on() {
        System.out.println("Dvd player is ON");
    }

    @Override
    public void off() {
        System.out.println("Dvd player is OFF");
    }

    @Override
    public void eject() {
        System.out.println("Dvd player is Eject");
    }

    @Override
    public void pause() {
        System.out.println("Dvd player is Pause");
    }

    @Override
    public void play(String movie) {
        System.out.println(movie + " is Playing");
    }

    @Override
    public void stop() {
        System.out.println("Dvd player is Stopping");
    }

    @Override
    public void setSound(String sound) {
        super.setSound(sound);
    }

    public void setTwoChannelAudio(String channelAudio) {
        this.channelAudio = channelAudio;
    }

    public void play() {
        System.out.println("DVD player is playing");
    }
}
