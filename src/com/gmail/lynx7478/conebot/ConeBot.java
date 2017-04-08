package com.gmail.lynx7478.conebot;

import javax.security.auth.login.LoginException;

import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.exceptions.RateLimitedException;

public class ConeBot {
	
	private static JDA jda;
	
	public static final String BOT_TOKEN = "MzAwMDA4MTU5NzY5MTMzMDU3.C8mL4Q.dAYakCMQjwxbXAmKCaY3Z7zJ-3o";
	
	private static CommandHandler commandHandler;

	@SuppressWarnings("deprecation")
	public static void main(String[] args) 
	{
		try {
			jda = new JDABuilder(AccountType.BOT).addListener(new BotListener()).setToken(BOT_TOKEN).buildBlocking();
		} catch (LoginException | IllegalArgumentException | InterruptedException | RateLimitedException e) {
			e.printStackTrace();
		}
		
		commandHandler =  new CommandHandler();
		
		System.out.println("Cone Bot initilized and connected to servers.");
	}
	
	public static CommandHandler getCommandHandler()
	{
		return commandHandler;
	}
	
	public static JDA getJDA()
	{
		return jda;
	}

}
