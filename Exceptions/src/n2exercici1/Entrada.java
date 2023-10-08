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
		
		readByte(messageByte);
		readInt(messageInt);
		readFloat(messageFloat);
		readDouble(messageDouble);
		readChar(messageChar);
		readString(messageString);
		readYesNo(messageBoolean);

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
	
	public static char readChar(String missatgeChar) {
		
		char charUser = ' ';
		String entryUser = "";
		boolean invalidEntryUser = true;
		
		do {
			try {
				System.out.println(missatgeChar);
				//sc.nextLine();
				entryUser = sc.nextLine();
				
				
				if(entryUser.length() == 1) {
					invalidEntryUser = false;
					charUser = entryUser.charAt(0);
				}else {
					charUser = (Character) null;;
				}
				
			}catch(Exception e) {
				System.out.println("error de format");
				//sc.nextLine();
			}
			
			//sc.nextLine();
			
		}while(invalidEntryUser);

	        return charUser;
	}
	
	public static String readString(String messageBoolean) throws Exception{
		
			String stringUser = "";
			
			System.out.println(messageBoolean);
			stringUser = sc.nextLine();
			
			if(stringUser.length() == 2) {
				System.out.println("ta bien");
				
			}else {
				throw new Exception("mu mal");
			}
			
			
		
		return stringUser;
	}

	public static boolean readYesNo(String messageBoolean) {
		
		
		String entryUser = "";
		boolean booleanUser = true;
		boolean invalidEntryUser = true;
				
		do {
			try {
				System.out.println(messageBoolean);
				//sc.nextLine();
				entryUser = sc.nextLine();
				
				
				if(entryUser.equals("s") || entryUser.equals("n")) {
					invalidEntryUser = false;
					if(entryUser.equals("n")) {
						booleanUser = false;
					}
					
				}else {
					entryUser = null;
				}
				
				
			}catch(Exception e) {
				System.out.println("error de format");
			}
			

			
		}while(invalidEntryUser);

	    return booleanUser;
		

	}

	

}
