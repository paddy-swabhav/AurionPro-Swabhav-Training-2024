package com.techlabs.command.test;

import com.techlabs.command.model.AdjustVolumeCommand;
import com.techlabs.command.model.ChangeChannelCommand;
import com.techlabs.command.model.ICommand;
import com.techlabs.command.model.RemoteControl;
import com.techlabs.command.model.Stereo;
import com.techlabs.command.model.TV;
import com.techlabs.command.model.TurnOffCommand;
import com.techlabs.command.model.TurnOnCommand;

public class CommandPatternTest {

	public static void main(String[] args) {
        // Create devices
        TV tv = new TV();
        Stereo stereo = new Stereo();
 
        // Create command objects
        ICommand turnOnTVCommand = new TurnOnCommand(tv);
        ICommand turnOffTVCommand = new TurnOffCommand(tv);
        ICommand adjustVolumeStereoCommand = new AdjustVolumeCommand(stereo);
        ICommand changeChannelTVCommand = new ChangeChannelCommand(tv);
 
        // Create remote control
        RemoteControl remote = new RemoteControl();
 
        // Set and execute commands
        remote.setCommand(turnOnTVCommand);
        remote.pressButton(); // Outputs: TV is now on
 
        remote.setCommand(adjustVolumeStereoCommand);
        remote.pressButton(); // Outputs: Volume adjusted
 
        remote.setCommand(changeChannelTVCommand);
        remote.pressButton(); // Outputs: Channel changed
 
        remote.setCommand(turnOffTVCommand);
        remote.pressButton(); // Outputs: TV is now off
    }
}
