package net.okapibox.main;

import net.okapibox.updates.Updates;

public class StartUp {
	public static void start(){//prints this:
		System.out.println("---------------------------------------------------");
		System.out.println("Welcome to the people poisoner game");
		System.out.println("Version: " + Updates.ver);
		System.out.println("by Uly");
		System.out.println("The game will give you a person to poison.");
		System.out.println("The person needs enough poison to kill them,");
		System.out.println("Based on their immunity (to be given below).");
		System.out.println("They also need a small enough amount so that");
		System.out.println("They won't notice the poison. Their intelligence");
		System.out.println("Will be given below.");
		System.out.println("---------------------------------------------------");
		if(Updates.dev){
			System.out.println("DEV: SHOWED STARTUP SCREEN");
		}
	}
}
