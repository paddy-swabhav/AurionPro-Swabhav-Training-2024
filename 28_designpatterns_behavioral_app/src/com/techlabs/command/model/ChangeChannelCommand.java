package com.techlabs.command.model;

public class ChangeChannelCommand implements ICommand{
	private TV tv;
	 
    public ChangeChannelCommand(TV tv) {
        this.tv = tv;
    }
 
    @Override
    public void execute() {
        tv.changeChannel();
    }

}
