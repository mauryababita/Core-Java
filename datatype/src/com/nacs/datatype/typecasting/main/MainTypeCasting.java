package com.nacs.datatype.typecasting.main;
import com.nacs.datatype.typecasting.TypeCasting;
public class MainTypeCasting {
	public static void main(String[] args) {
		TypeCasting typeCasting = new TypeCasting();
		int number = 10;
		// char charVriable = 'A';
		byte byteVriable = 77;
		typeCasting.wideningToFloat(number);
		// System.out.println(number);
		typeCasting.narrowingToChar((char) byteVriable);
		// System.out.println(byteVriable);
	}

}

