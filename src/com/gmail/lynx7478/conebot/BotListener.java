package com.gmail.lynx7478.conebot;


import com.gmail.lynx7478.conebot.bot.Command;

import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class BotListener extends ListenerAdapter 
{
	
	@Override
	public void onMessageReceived(MessageReceivedEvent e)
	{
		if(!e.getAuthor().equals(ConeBot.getJDA().getSelfUser()))
		{
			System.out.println(e.getMessage().toString());
			System.out.println(e.getMessage().toString().startsWith("!"));
			if(e.getMessage().toString().contains("!"))
			{
				System.out.println("Detected a message that contains '!'");
				String[] wholeString = e.getMessage().toString().split("!");
				System.out.println("Split string.");
				String cmd = wholeString[1];
				System.out.println("Command I got: " + cmd);
				
				for(Command command : ConeBot.getCommandHandler().getCommands())
				{
					if(cmd.contains(command.getCommand()))
					{
						command.doFunc(e.getChannel(), e.getAuthor());
					}
				}
			}
		}
		
		return;
	}

}
