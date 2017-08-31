package discord.bot;

import sx.blah.discord.api.events.EventSubscriber;
import sx.blah.discord.handle.impl.events.ReadyEvent;
import sx.blah.discord.handle.impl.events.guild.channel.message.MessageReceivedEvent;
import sx.blah.discord.util.MessageBuilder;

public class AnnotationListener extends Main { /* extend Main to have access to
	its variables, if you need them */
	public static final String PREFIX = ">"; // The bot's command prefix

	@EventSubscriber /* The annotation for handling events. If you don't use it,
	your listener will not register events. */
	public void ready (ReadyEvent event) { // Dispatched when the bot is ready
		System.out.println("Ready!");
	}
	
	@EventSubscriber
	public void messageReceived (MessageReceivedEvent event) { /* Dispatched whenever
		a message is received */
		if (event.getMessage().getContent().startsWith(PREFIX + "help")) {
			new MessageBuilder(Main.client)
					.withContent("Beep boop. I am a bot.")
					.withChannel(event.getChannel())
					.send();
		}
	}
	
}