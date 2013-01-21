package net.okapibox.people;

import java.util.Random;
import java.util.Scanner;

import net.okapibox.updates.Updates;

public class Poison {
	public static boolean iWorks;//works with immunity
	public static int poisonlevel;
	public static boolean sWorks;//works with intelligence
	public static void start(){
		Scanner s = new Scanner(System.in);
		System.out.print("Poison amount (0 - 100): ");
		poisonlevel = s.nextInt();//SHOULD BE REPLACED BY A TEXT BOX
		if(Updates.dev){
			System.out.println("DEV: GOT POISON_LEVEL");
		}
		
		
		getICompat(poisonlevel);//DOES IT WORK
		if(Updates.dev){
			System.out.println("DEV: GOT I COMPAT");
		}
		getSCompat(poisonlevel);//^
		if(Updates.dev){
			System.out.println("DEV: GOT S COMPAT");
		}
		
		
		if(sWorks == true && iWorks == true){//If certain parts work
			System.out.println(Generation.namefin + " Was successfully poisoned");
		}else if(sWorks == true && iWorks == false){
			System.out.println(Generation.namefin + " Was fooled into being poisoned, But survived it. Try Again.");
		}else if(sWorks == false){
			System.out.println(Generation.namefin + " Wasn't fooled into being poisoned. Try again.");
		}
		if(Updates.dev){
			System.out.println("DEV: FINISHED SEQUENCE");
		}
	}
	private static void getICompat(int level){//checks if immunity works
		int a;
		int b;
		int co;
		Random r = new Random();
		a = r.nextInt(5);
		b = r.nextInt(5);
		co = level + (a * b) - (b - a);
		
		if(co > Generation.immunefin){
			iWorks = true;
		}else{
			iWorks = false;
		}
		if(Updates.dev){
			System.out.println("DEV: MODDED_IMMUNE_COMPAT: " + co);
		}
	}
	public static void getSCompat(int level){//checks if intelligence works
		int a;
		int b;
		Random r = new Random();
		
		a = r.nextInt(30);
		b = r.nextInt(30);
		if(level < (((100 - (Generation.smartfin)) - 2) - a) + b){
			sWorks = true;
		}else{
			sWorks = false;
		}
		if(Updates.dev){
			System.out.println("DEV: MODIFIED SMART: " + (((100 - (Generation.smartfin)) - 2) - a) + b);
		}
	}
}
