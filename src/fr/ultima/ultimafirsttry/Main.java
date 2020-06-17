package fr.ultima.ultimafirsttry;

import org.bukkit.plugin.java.JavaPlugin;

import fr.ultima.ultimafirsttry.commands.CommandTest;

public class Main extends JavaPlugin {
	
	@Override
	public void onEnable() {
		System.out.println("Bitenbois");
		getCommand("test").setExecutor(new CommandTest());
	}
	
	@Override
	public void onDisable() {
		System.out.println("Ok c'est bon j'arrete");
	}

}
