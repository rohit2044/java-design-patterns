package command.light;

/**
 *  Receiver (with actions)
 */
public class Light {

    String name;
    private boolean isOn = false;

    public Light(String name) {
        this.name = name;
    }

    // action
    public void on() {
        isOn = true;
        System.out.println(name + " Light is now ON");
    }

    // action
    public void off() {
        isOn = false;
        System.out.println(name + " Light is now OFF");
    }
}
