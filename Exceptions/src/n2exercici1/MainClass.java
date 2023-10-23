package n2exercici1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainClass {

	
	public static void main (String[] args) throws Exception{
		
		String messageByte = "Introduex un byte";
		String messageInt = "introdueix un int";
		String messageFloat = "introdueix un float";
		String messageDouble = "introdueix un double";
		String messageChar = "introdueix un character";
		String messageString = "introdueix un String";
		String messageBoolean = "introdueix un boolean (s = true // n = false)";
		
		byte byteAnswer = Sc.readByte(messageByte);
		int intAnswer = Sc.readInt(messageInt);
		float floatAnswer = Sc.readFloat(messageFloat);
		double doubleAnswer = Sc.readDouble(messageDouble);
		char charAnswer = Sc.readChar(messageChar);
		String stringAnswer = Sc.readString(messageString);
		boolean booleanAnswer = Sc.readYesNo(messageBoolean);
		
		Sc.printAll(byteAnswer, intAnswer, floatAnswer, doubleAnswer, charAnswer, stringAnswer, booleanAnswer);

	}
	
	
}
