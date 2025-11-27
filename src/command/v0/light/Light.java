package command.v0.light;

public abstract class Light {

    String name;
    private boolean isOn = false;

    public void on() {
        isOn = true;
        System.out.println(name + " Light is now ON");
    }

    public void off() {
        isOn = false;
        System.out.println(name + " Light is now OFF");
    }
}
