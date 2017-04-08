package com.gmail.lynx7478.conebot.bot;

import net.dv8tion.jda.core.entities.MessageChannel;
import net.dv8tion.jda.core.entities.User;

public class Command 
{	
	
	private String cmd;
	
	private Function func;
	
	public Command(String cmd, Function func)
	{
		this.cmd = cmd;
		this.func = func;
	}
	
	public String getCommand()
	{
		return cmd;
	}
	
	public void doFunc(MessageChannel cnl, User usr)
	{
		func.func(cnl, usr);
	}

}
