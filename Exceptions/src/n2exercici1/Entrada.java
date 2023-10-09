package n2exercici1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Entrada {

	static Scanner sc = new Scanner(System.in);
	
	public static void main (String[] args) throws Exception{
		
		String messageByte = "Introduex un byte";
		String messageInt = "introdueix un int";
		String messageFloat = "introdueix un float";
		String messageDouble = "introdueix un double";
		String messageChar = "introdueix un character";
		String messageString = "introdueix un String";
		String messageBoolean = "introdueix un boolean (s = true // n = false)";
		
		byte byteAnswer = readByte(messageByte);
		int intAnswer = readInt(messageInt);
		float floatAnswer = readFloat(messageFloat);
		double doubleAnswer = readDouble(messageDouble);
		char charAnswer = readChar(messageChar);
		String stringAnswer = readString(messageString);
		boolean booleanAnswer = readYesNo(messageBoolean);
		
		printAll(byteAnswer, intAnswer, floatAnswer, doubleAnswer, charAnswer, stringAnswer, booleanAnswer);

	}
	
	public static byte readByte(String missatgeEdat){
		
		byte byteUser = 0;
		boolean invalidEntryUser = false;
		
		do {
			
			try{
				
				System.out.println(missatgeEdat);
				byteUser = sc.nextByte();
				invalidEntryUser = false;
				
			}catch(InputMismatchException  e) {
				System.out.println("error de format");
				invalidEntryUser = true;
			}
			
			sc.nextLine();
		
		}while(invalidEntryUser);
		
	
		return byteUser;
	}
	
	public static int readInt(String missatgeInt) {
		
		int intUser = 0;
		boolean invalidEntryUser = false;
				
			do {
				
				try{
						
					System.out.println(missatgeInt);
					intUser = sc.nextInt();
					invalidEntryUser = false;
					
				}catch(InputMismatchException  e) {
					System.out.println("error de format");
					invalidEntryUser = true;
						
				}
				
				sc.nextLine();
				
			}while(invalidEntryUser);	
					
		return intUser;	
	}
			
	public static float readFloat(String missatgeFloat) {
		
		float floatUser = 0f;
		boolean invalidEntryUser = false;

		
		do {
			
			try{
				
				System.out.println(missatgeFloat);
				floatUser = sc.nextFloat();
				invalidEntryUser = false;
				
			}catch(InputMismatchException  e) {
				System.out.println("error de format");
				invalidEntryUser = true;
				
			}
			
			sc.nextLine();
			
		}while(invalidEntryUser);	
			
		return floatUser;	
	}
	
	public static double readDouble(String missatgeDouble) {
		
	double doubleUser = 0;
	boolean invalidEntryUser = false;

		do {
			
			try{
				
				System.out.println(missatgeDouble);
				doubleUser = sc.nextDouble();
				invalidEntryUser = false;
				
			}catch(InputMismatchException  e) {
				System.out.println("error de format");
				invalidEntryUser = true;
			}
			
			sc.nextLine();
			
		}while(invalidEntryUser);	
			
		return doubleUser;	
	}
	
	public static char readChar(String messageChar) {
		
		char charUser = ' ';
		String entryUser = "";
		boolean invalidEntryUser = true;
		
		do {
			
			System.out.println(messageChar);
			entryUser = sc.nextLine();
			
			if(entryUser.length() != 1) {	
				try {
					throw new Exception("error de format");
				
				}catch(Exception e) {
					e.printStackTrace();
				}
			}else {
				charUser = entryUser.charAt(0);
				invalidEntryUser = false;
			}
	
			
		}while(invalidEntryUser);
		
	        return charUser;
	}
	
	public static String readString(String messageString){
		
			String stringUser = "";
			boolean invalidEntryUser = true;
			
			do {
				System.out.println(messageString);
				stringUser = sc.nextLine();
				
				if(stringUser.length() > 10) {	
					try {
						throw new Exception("error de format");
					
					}catch(Exception e) {
						e.printStackTrace();
					}
				}else {
					invalidEntryUser = false;
				}
			
			}while(invalidEntryUser);
		
		return stringUser;
	}

	public static boolean readYesNo(String messageBoolean) {
		
		
		String entryUser = "";
		boolean booleanUser = true;
		boolean invalidEntryUser = true;
		
		do {
			
			System.out.println(messageBoolean);
			entryUser = sc.nextLine();

				if(entryUser.equals("s") || entryUser.equals("n")) {
					invalidEntryUser = false;
					
				}else {
					try {
						throw new Exception("error de format");
					
					}catch(Exception e) {
						e.printStackTrace();
					}
					
				}
				
		}while(invalidEntryUser);
		
		if(entryUser.equals("n")) {
			booleanUser = false;
		}
		
	    return booleanUser;
		

	}

	public static void printAll(byte byteAnswer, int intAnswer, float floatAnswer, double doubleAnswer, char charAnswer, String stringAnswer, boolean booleanAnswer) {
		
		System.out.println("\nDADES INTRODUÏDES"
				+ "\nbyte: " + byteAnswer
				+ "\nint: " + intAnswer
				+ "\nfloat: " + floatAnswer
				+ "\ndouble: " + doubleAnswer
				+ "\nchar: " + charAnswer
				+ "\nstring: " + stringAnswer
				+ "\nboolean: " + booleanAnswer);
		
		
	}

}
