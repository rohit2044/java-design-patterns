package command;

import command.light.Light;
import command.light.LightOffCommand;
import command.light.LightOnCommand;

public class RemoteLoader {

    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living Room");
        LightOnCommand lightOnCommand = new LightOnCommand(livingRoomLight);
        LightOffCommand lightOffCommand = new LightOffCommand(livingRoomLight);

//        remoteControl.setCommand(0, livingRoomLight::on, livingRoomLight::off); // lambdas

        remoteControl.setCommand(0, lightOnCommand, lightOffCommand);
        remoteControl.onButtonPushed(0);
//        remoteControl.offButtonPushed(1); // Null Object design pattern

        System.out.println("Pushing undo button..");
        remoteControl.undoButtonPushed();
    }
}
