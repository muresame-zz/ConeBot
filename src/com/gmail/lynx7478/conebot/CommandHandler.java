package com.gmail.lynx7478.conebot;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import com.gmail.lynx7478.conebot.bot.Command;
import com.gmail.lynx7478.conebot.bot.Function;

import net.dv8tion.jda.core.MessageBuilder;
import net.dv8tion.jda.core.entities.MessageChannel;
import net.dv8tion.jda.core.entities.User;
import net.dv8tion.jda.core.entities.impl.MessageImpl;

public class CommandHandler {
	
	private ArrayList<Command> commands;
	
	public CommandHandler()
	{
		commands = new ArrayList<Command>();
		
		// Add the commands here.
		commands.add(new Command("nya", new Function()
				{

					@Override
					public void func(MessageChannel cnl, User usr) 
					{
						try {
							cnl.sendFile(new File("C:\\Users\\Gabi\\Documents\\Java\\Workspace\\ConeBot\\images\\nya.gif"), new MessageBuilder().append(usr.getAsMention() + " Kawaii desu!").build()).queue();
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
			
				}));
		commands.add(new Command("test", new Function()
				{

					@Override
					public void func(MessageChannel cnl, User usr) 
					{
						cnl.sendMessage("Works!").queue();
					}
			
				}));
		commands.add(new Command("cat", new Function()
				{

					@Override
					public void func(MessageChannel cnl, User usr) 
					{
						cnl.sendMessage(usr.getAsMention() + " Here, have a cat! " + "http://thecatapi.com/api/images/get?format=src&type=gif").queue();
					}
			
				}));
	}
	
	public ArrayList<Command> getCommands()
	{
		return commands;
	}

}
