package n2exercici1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainClass {

	
	public static void main (String[] args) {
		
		boolean invalidEntryUser = true;
		
		String messageByte = "Introduex un byte";
		String messageInt = "introdueix un int";
		String messageFloat = "introdueix un float";
		String messageDouble = "introdueix un double";
		String messageChar = "introdueix un character";
		String messageString = "introdueix un String";
		String messageBoolean = "introdueix un boolean (s = true // n = false)";
		
		boolean exceptionCaptured = false;
		
		byte byteAnswer = Sc.readByte(messageByte);
		int intAnswer = Sc.readInt(messageInt);
		float floatAnswer = Sc.readFloat(messageFloat);
		double doubleAnswer = Sc.readDouble(messageDouble);
		char charAnswer = ' ';
		String stringAnswer = "";
		boolean booleanAnswer = true;
		
		
		do {
			try {
				charAnswer = Sc.readChar(messageChar);
				exceptionCaptured = false;
			}catch(Exception e){
				e.printStackTrace();
				exceptionCaptured = true;
			}
		}while(exceptionCaptured);
		
		do {
			try {
				stringAnswer = Sc.readString(messageString);
				exceptionCaptured = false;
			}catch(Exception e) {
				e.printStackTrace();
				exceptionCaptured = true;
			}
		}while(exceptionCaptured);
		
		do {
			try {
				booleanAnswer = Sc.readYesNo(messageBoolean);
				exceptionCaptured = false;
			}catch(Exception e) {
				e.printStackTrace();
				exceptionCaptured = true;
			}
		
		}while(exceptionCaptured);
		
		
		
		Sc.printAll(byteAnswer, intAnswer, floatAnswer, doubleAnswer, charAnswer, stringAnswer, booleanAnswer);

	}
	
	
}
