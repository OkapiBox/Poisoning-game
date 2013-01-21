package net.okapibox.main;

public class Thingy {
	public static String end;
	public static void getEnd(int smart){
		if(smart == 1 || smart == 21 || smart == 31 || smart == 41 || smart == 51 || smart == 61 || smart == 71 || smart == 81 || smart == 91){
			end = "st";
		}else if(smart == 2 || smart == 22 || smart == 32 || smart == 42 || smart == 52 || smart == 62 || smart == 72 || smart == 82 || smart == 92){
			end = "nd";
		}else if(smart == 3 || smart == 23 || smart == 33 || smart == 43 || smart == 53 || smart == 63 || smart == 73 || smart == 83 || smart == 93){
			end = "rd";
		}else{
			end = "th";
		}
			
			
			
			
	}
}
