package net.okapibox.main;

import java.util.Random;
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
		StartUp.start();//startup screen
		System.out.println("enter any single-digit number to start.");//SHOULD BE REPLACED BY A BUTTON
		start = s.nextInt();//BUTTON
		if(start == 0 || start == 1 || start == 2 || start == 3 || start == 4 || start == 5 || start == 6 || start == 7 || start == 8 || start == 9){//if its ok
			timer1 = System.currentTimeMillis();//then start the timer
			Generation.gen();//create a person
			Poison.start();//begin poison sequence, with selection
			System.out.println("That took you " + ((System.currentTimeMillis() - timer1) / 1000) + " Seconds!");//tells how long it took you
			System.out.println("Restart? Enter 1");//AGAIN: SHOULD BE REPLACED BY A BUTTON
			en = s.nextInt();//BOTTON
			if(en == 1){
				restartMode();//Same thing minus startup screen
			}else{//no restart?
				System.out.println("Canceled D:");
			}
		}else{//no restart?
			System.out.println("Canceled D:");
		}
	}
	public static void restartMode(){//same thing minus startup screen
		int en;
		Scanner s = new Scanner(System.in);
		timer1 = System.currentTimeMillis();
		Generation.gen();
		Poison.start();
		System.out.println("That took you " + ((System.currentTimeMillis() - timer1) / 1000) + " Seconds!");
		System.out.println("Restart? Enter 1");
		en = s.nextInt();
		if(en == 1){
			restartMode();
		}else{
			System.out.println("Canceled D:");
		}
	}
}
