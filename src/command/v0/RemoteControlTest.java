package command.v0;

import command.v0.garage.GarageDoor;
import command.v0.garage.GarageDoorOpenCommand;
import command.v0.light.LightOffCommand;
import command.v0.light.LightOnCommand;
import command.v0.light.LivingRoomLight;

public class RemoteControlTest {
    public static void main(String[] args) {
        var remote = new SimpleRemoteControl();
        var lightOnCommand = new LightOnCommand(new LivingRoomLight());
        remote.setCommand(lightOnCommand);
        remote.buttonWasPressed();

        var lightOffCommand = new LightOffCommand(new LivingRoomLight());
        remote.setCommand(lightOffCommand);
        remote.buttonWasPressed();

        System.out.println();
        var garageDoorOpenCommand = new GarageDoorOpenCommand(new GarageDoor());
        remote.setCommand(garageDoorOpenCommand);
        remote.buttonWasPressed();
    }
}
