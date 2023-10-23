package n2exercici1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Sc {
	
	static Scanner sc = new Scanner(System.in);
	
public static byte readByte(String missatgeEdat){
		
		byte byteUser = 0;
		boolean invalidEntryUser = true;
		
		do {
			
			try{
				
				System.out.println(missatgeEdat);
				byteUser = sc.nextByte();
				invalidEntryUser = false;
				
			}catch(InputMismatchException  e) {
				System.out.println("error de format");
				
			}
			
			sc.nextLine();
		
		}while(invalidEntryUser);
		
	
		return byteUser;
	}
	
	public static int readInt(String missatgeInt) {
		
		int intUser = 0;
		boolean invalidEntryUser = true;
				
			do {
				
				try{
						
					System.out.println(missatgeInt);
					intUser = sc.nextInt();
					invalidEntryUser = false;
					
				}catch(InputMismatchException  e) {
					System.out.println("error de format");
					
						
				}
				
				sc.nextLine();
				
			}while(invalidEntryUser);	
					
		return intUser;	
	}
			
	public static float readFloat(String missatgeFloat) {
		
		float floatUser = 0f;
		boolean invalidEntryUser = true;

		
		do {
			
			try{
				
				System.out.println(missatgeFloat);
				floatUser = sc.nextFloat();
				invalidEntryUser = false;
				
			}catch(InputMismatchException  e) {
				System.out.println("error de format");
				
				
			}
			
			sc.nextLine();
			
		}while(invalidEntryUser);	
			
		return floatUser;	
	}
	
	public static double readDouble(String missatgeDouble) {
		
	double doubleUser = 0;
	boolean invalidEntryUser = true;

		do {
			
			try{
				
				System.out.println(missatgeDouble);
				doubleUser = sc.nextDouble();
				invalidEntryUser = false;
				
			}catch(InputMismatchException  e) {
				System.out.println("error de format");
				
			}
			
			sc.nextLine();
			
		}while(invalidEntryUser);	
			
		return doubleUser;	
	}
	
	public static char readChar(String messageChar) throws Exception {
		
		char charUser = ' ';
		String entryUser = "";
		
			System.out.println(messageChar);
			entryUser = sc.nextLine();
			
			if(entryUser.length() == 1) {	
				charUser = entryUser.charAt(0);
				 return charUser;
			}else {
				
				throw new Exception("error de format");
			}
		    
	}
	
	public static String readString(String messageString) throws Exception{
		
			String stringUser = "";
			
				System.out.println(messageString);
				stringUser = sc.nextLine();
				
				if(stringUser.length() < 10) {	
					return stringUser;
				}else {
					throw new Exception("error de format");
				}
		
	}

	public static boolean readYesNo(String messageBoolean) throws Exception{
		
		
		String entryUser = "";
		boolean booleanUser = true;
			
		System.out.println(messageBoolean);
		entryUser = sc.nextLine();

		if(entryUser.equals("s")) {
			booleanUser = true;
			return booleanUser;
		}else if(entryUser.equals("n")) {
			booleanUser = false;
			return booleanUser;
		}else {
			throw new Exception("error de format");
			}	
		

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
