public class Amplifier extends Tuner implements Stateable {

    Tuner tuner;

    @Override
    public void on() {
        System.out.println("Ampli ON");
    }

    @Override
    public void off() {
        System.out.println("Ampli OFF");
    }

    public void setTuner(Tuner tuner) {
        this.tuner = tuner;
    }

    public void setDvdPlayer(DvdPlayer dvdPlayer) {
        dvdPlayer.play();
    }

    public void setCdPlayer(CdPlayer cdPlayer) {
        cdPlayer.play();
    }

    public void setSound(String sound) {
        Audio audio = new Audio();
        audio.setSound(sound);
        System.out.println(audio.getSound() + " Audio is set");
    }

    public void setVolume(int volume) {
        Audio audio = new Audio();
        audio.setVolume(volume);
        System.out.println("Volume is " + audio.getVolume());
    }
}
