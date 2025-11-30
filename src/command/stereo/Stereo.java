package command.stereo;

public class Stereo {

    public void on() {
        System.out.println("Turning on stereo...");
    }

    public void setCD() {
        System.out.println("Setting CD to good kid, M.A.A.D city");
    }

    public void setVolume(int vol) {
        System.out.println("Setting volume to " + vol);
    }

    public void off() {
        System.out.println("Turning off stereo...");
    }
}
