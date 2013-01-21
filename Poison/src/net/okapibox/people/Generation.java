package net.okapibox.people;

import java.util.Random;

import net.okapibox.updates.Updates;

public class Generation {
	/*
	 * ints for randomization++
	 */
	private static int namea;//the random int that corresponds to a name
	private static int immunea;//the random int that is used to create a random immune level
	private static int smarta;//the random int that is used to create a random intelligence level
	
	private static String poop[] = {"John", "Harry", "Ben", "Larry", "Curly", "Moe", "Charles", "Frank", "Alicia", "Rogerio",
		"Kate", "Jessica", "Sally", "Sue", "Joe", "Maya", "Herbert", "Helga", "Lucy", "Mary", "Cleatus", "Bailey", "Daniel",
		"Rhakesh", "Penny", "Potato", "Stone", "Trevor", "Michiko", "Takeshi", "Atsushi", "Jefferson", "Dylan", "Elliot", "Noah", 
		"Eamon", "Gavin", "Brock", "William", "Alina", "Joanna", "Jon", "John", "Mimi", "Ugg", "Jambo", "Django", "Ezra", "Liam",
		"Ulysses", "Owen", "Brigette", "Marvin", "Gabe", "Walker", "Adam", "Eve", "Joshua", "Cavan", "Julia", "Cole", "Maddie", 
		"Azusa", "Lyric", "Jeffrey", "Brent", "Sakura", "Edgar", "Matthew", "Sidney", "Dracula", "Enrique", "Ruth", "Brodie", 
		"Mariah", "Jamal", "Jamarcus", "Tre", "Shawntelle", "Carrie", "Leonard", "Angelo", "Sheldon", "Jim", "Kaley", "Simon", 
		"Howard", "Lakshmi", "Kunal", "Melissa", "Bernadette", "Mayim", "Amy", "Kevin", "Stuart", "Brian", "Dallas", "Leslie", "Ian", "LeVar"};//ALL the names
	/*
	 * All these to be used in other classes.
	 */
	public static String namefin;//final name
	public static int immunefin;//final immunity
	public static int smartfin;//final intelligence
	
	/*
	 * Generates people! :D
	 */
	public static void gen(){
		Random name = new Random();//idk why three randoms, should only use one
		Random immune = new Random();//^
		Random smart = new Random();//^
		if(Updates.dev){
			System.out.println("DEV: SET UP RANDOMS");
		}
		
		namea = name.nextInt(Updates.names);//chooses a random int not greater than the number of name, but more than 0
		getName(namea);//get name method, I do this for organization
		immunea = immune.nextInt(100);//Random int, 0-100
		getImmunity(immunea);//method for modifying the immunity
		smarta = smart.nextInt(99);//random int, 0-99
		getSmart(smarta);//method for modyfying intelligence
		if(Updates.dev){
			System.out.println("DEV: MADE RANDOMS");
		}
		if(100 - smartfin > immunefin && immunefin >= 0 && immunefin <= 100){//if it's in the correct parameters for being solvable,
			System.out.println("Your Target: Name: " + namefin + ", Immunity Level: " + immunefin + "%" + ", Intelligence: " + smartfin + "th Percentile");//then print out the person's stats
			if(Updates.dev){
				System.out.println("DEV: PRINTED PERSON");
			}
		}else{//otherwise,
			gen();//you should TRY AGAIN to make THE RIGHT human.
			if(Updates.dev){
				System.out.println("DEV: WRONG PERSON. RESTARTING...");
			}
		}
		
	}
	public static void getName(int name){//V
		namefin = poop[name];//chooses the name that corresponds to the random number!
		if(Updates.dev){
			System.out.println("DEV: GOT NAME: " + namefin);
		}
	}
	public static void getImmunity(int immune){
		int a;
		int b;
		int c;
		int d; //ints
		Random nameb = new Random();//new random
		
		a = nameb.nextInt(100 - immune);//many randoms generated
		b = nameb.nextInt(100 - immune);
		c = nameb.nextInt(100 - immune);
		d = nameb.nextInt(100 - immune);
		immunefin =  (c - d) + (a - b) + immune;//complex randomization
		if(Updates.dev){
			System.out.println("DEV: GOT IMMUNITY: " + immunefin);
		}
	}
	public static void getSmart(int smart){//just for organization, doesn't do much.
		smartfin = smart;
		if(Updates.dev){
			System.out.println("DEV: GOT INTELLIGENCE: " + smartfin);
		}
	}
}
