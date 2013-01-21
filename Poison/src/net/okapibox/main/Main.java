package net.okapibox.main;

import java.util.Scanner;

import net.okapibox.people.Generation;
import net.okapibox.people.Poison;
import net.okapibox.updates.Updates;

public class Main {
	private static long timer1;//creates a long that is going to be used as a time measure
	public static void main(String args[]){//main program
		int start;
		int en;
		Scanner s = new Scanner(System.in);//new scanner
		if(Updates.dev){
			System.out.println("DEV: STARTED SCANNER");
		}
		StartUp.start();//startup screen
		System.out.println("enter any single-digit number to start.");//SHOULD BE REPLACED BY A BUTTON
		start = s.nextInt();//BUTTON
		if(Updates.dev){
			System.out.println("DEV: GOT ENTRY");
		}
		if(start == 0 || start == 1 || start == 2 || start == 3 || start == 4 || start == 5 || start == 6 || start == 7 || start == 8 || start == 9){//if its ok
			timer1 = System.currentTimeMillis();//then start the timer
			if(Updates.dev){
				System.out.println("DEV: SET UP TIMER");
			}
			Generation.gen();//create a person
			if(Updates.dev){
				System.out.println("DEV: MADE A PERSON");
			}
			Poison.start();//begin poison sequence, with selection
			if(Updates.dev){
				System.out.println("DEV: STARTED POISONING");
			}
			System.out.println("That took you " + ((System.currentTimeMillis() - timer1) / 1000) + " Seconds!");//tells how long it took you
			if(Updates.dev){
				System.out.println("DEV: ENDED TIMER");
			}
			System.out.println("Restart? Enter 1");//AGAIN: SHOULD BE REPLACED BY A BUTTON
			en = s.nextInt();//BOTTON
			if(Updates.dev){
				System.out.println("DEV: GOT INPUT");
			}
			if(en == 1){
				restartMode();//Same thing minus startup screen
			}else{//no restart?
				System.out.println("Canceled D:");
			}
		}else if(start == 1998){
			System.out.println("DEV MODE");
			Updates.dev = !Updates.dev;
			main(args);
		}
	}
	public static void restartMode(){//same thing minus startup screen
		int en;
		Scanner s = new Scanner(System.in);
		timer1 = System.currentTimeMillis();//then start the timer
		if(Updates.dev){
			System.out.println("DEV: SET UP TIMER");
		}
		Generation.gen();//create a person
		if(Updates.dev){
			System.out.println("DEV: MADE A PERSON");
		}
		Poison.start();//begin poison sequence, with selection
		if(Updates.dev){
			System.out.println("DEV: STARTED POISONING");
		}
		System.out.println("That took you " + ((System.currentTimeMillis() - timer1) / 1000) + " Seconds!");//tells how long it took you
		if(Updates.dev){
			System.out.println("DEV: ENDED TIMER");
		}
		System.out.println("Restart? Enter 1");//AGAIN: SHOULD BE REPLACED BY A BUTTON
		en = s.nextInt();//BOTTON
		if(Updates.dev){
			System.out.println("DEV: GOT INPUT");
		}
		if(en == 1){
			restartMode();//Same thing minus startup screen
		}else{//no restart?
			System.out.println("Canceled D:");
		}
	}
}
