package command.v0.stereo;

import command.v0.Command;

public class StereoOnWithCDCommand implements Command {
    Stereo stereo;

    @Override
    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(10);
    }

    @Override
    public void undo() {
        stereo.off();
    }
}
