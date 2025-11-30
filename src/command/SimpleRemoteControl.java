package command;

/**
 * Invoker
 */

// Decoupled from receiver
public class SimpleRemoteControl {

    Command slot;

    public SimpleRemoteControl() {}

    public void setCommand(Command slot) {
        this.slot = slot;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
