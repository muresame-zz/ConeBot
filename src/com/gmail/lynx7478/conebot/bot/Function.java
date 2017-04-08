package com.gmail.lynx7478.conebot.bot;

import net.dv8tion.jda.core.entities.MessageChannel;
import net.dv8tion.jda.core.entities.User;

public interface Function {
	
	void func(MessageChannel cnl, User usr);

}
