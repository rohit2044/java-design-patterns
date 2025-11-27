package command.v0;

import command.v0.garage.GarageDoor;
import command.v0.garage.GarageDoorOpenCommand;
import command.v0.light.Light;
import command.v0.light.LightOnCommand;
import command.v0.light.LivingRoomLight;

public class RemoteControlTest2 {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new LivingRoomLight();
        GarageDoor garageDoor = new GarageDoor();

        LightOnCommand lightOn = new LightOnCommand(light);
        GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(garageDoor);

        remote.setCommand(lightOn);
        remote.buttonWasPressed();
        remote.setCommand(garageOpen);
        remote.buttonWasPressed();
    }
}
