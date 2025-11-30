package command.v0;

import command.v0.garage.GarageDoor;
import command.v0.garage.GarageDoorOpenCommand;
import command.v0.light.Light;
import command.v0.light.LightOffCommand;
import command.v0.light.LightOnCommand;

public class SimpleRemoteControlTest {
    public static void main(String[] args) {
        var remote = new SimpleRemoteControl();
        var lightOnCommand = new LightOnCommand(new Light("Living Room"));
        remote.setCommand(lightOnCommand);
        remote.buttonWasPressed();

        var lightOffCommand = new LightOffCommand(new Light("Dining Room"));
        remote.setCommand(lightOffCommand);
        remote.buttonWasPressed();

        System.out.println();
        var garageDoorOpenCommand = new GarageDoorOpenCommand(new GarageDoor());
        remote.setCommand(garageDoorOpenCommand);
        remote.buttonWasPressed();
    }
}
