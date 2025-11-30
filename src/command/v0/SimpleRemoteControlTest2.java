package command.v0;

import command.v0.garage.GarageDoor;
import command.v0.garage.GarageDoorOpenCommand;
import command.v0.light.Light;
import command.v0.light.LightOnCommand;

public class SimpleRemoteControlTest2 {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light("Living Room");
        GarageDoor garageDoor = new GarageDoor();

        LightOnCommand lightOn = new LightOnCommand(light);
        GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(garageDoor);

        remote.setCommand(lightOn);
        remote.buttonWasPressed();
        remote.setCommand(garageOpen);
        remote.buttonWasPressed();
    }
}
