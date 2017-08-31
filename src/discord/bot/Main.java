package discord.bot;
import sx.blah.discord.api.IDiscordClient;
import sx.blah.discord.api.events.EventDispatcher;

public class Main {
	private static final String BOT_TOKEN = "TOKEN GOES HERE"; // Your bot's token (fill in)
	public static IDiscordClient client = Example.createClient(BOT_TOKEN, true); // The client or the bot object
	// Creates client object - make sure the BOT_TOKEN field is set to a value!
	
    public static void main (String[] args) {
        EventDispatcher dispatcher = client.getDispatcher(); // Gets the EventDispatcher instance for this client instance
        dispatcher.registerListener(new AnnotationListener()); // Registers the @EventSubscriber listener
	}
}