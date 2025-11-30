package command;

import command.garage.GarageDoor;
import command.garage.GarageDoorOpenCommand;
import command.light.Light;
import command.light.LightOffCommand;
import command.light.LightOnCommand;

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
