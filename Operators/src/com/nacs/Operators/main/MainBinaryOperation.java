package com.nacs.Operators.main;

import com.nacs.Operators.BinaryOperation;
import com.nacs.Operators.UnaryOperation;
import com.nacs.Operators.BitwiseShiftOperation;

public class MainBinaryOperation {

	public static void main(String[] args) {
		BinaryOperation addition = new BinaryOperation();
		addition.setnum1(10);
		addition.setnum2(20);
		int addResult = addition.addToNum();
		System.out.println("Addition of two number:" + addResult);
		BinaryOperation substraction = new BinaryOperation();
		substraction.setnum1(addResult);
		substraction.setnum2(10);
		int subResult = substraction.subToNum();
		System.out.println("Substraction of two number:" + subResult);

		BinaryOperation multiply = new BinaryOperation();
		multiply.setnum1(subResult);
		multiply.setnum2(30);
		int multiplyResult = multiply.multiplyToNum();
		System.out.println(multiplyResult);

		BinaryOperation division = new BinaryOperation();
		division.setnum1(multiplyResult);
		division.setnum2(20);
		int divResult = division.DivisionToNum();
		System.out.println(divResult);

		BinaryOperation modulus = new BinaryOperation();
		modulus.setnum1(divResult);
		modulus.setnum2(20);
		int modResult = modulus.ModulToNum();
		System.out.println(modResult);

		UnaryOperation unaryOperation = new UnaryOperation(10);
		unaryOperation.postincrementby1();
		int temp = unaryOperation.getnum1();
		System.out.println(temp);
		UnaryOperation unaryOperation1 = new UnaryOperation();
		unaryOperation1.preincrementby1();
		int temp1 = unaryOperation1.getnum1();
		System.out.println(temp1);

		UnaryOperation unaryOperation2 = new UnaryOperation();
		unaryOperation2.predecrementby1();
		int temp2 = unaryOperation2.getnum1();
		System.out.println(temp2);

		UnaryOperation unaryOperation3 = new UnaryOperation();
		unaryOperation3.postdecrementby1();
		int temp3 = unaryOperation3.getnum1();
		System.out.println(temp3);

		UnaryOperation unaryOperation4 = new UnaryOperation(10);
		unaryOperation4.calcuOnesComplement();
		int temp4 = unaryOperation4.getnum1();
		System.out.println(temp4);

		BitwiseShiftOperation shiftOperation = new BitwiseShiftOperation(-41);
		shiftOperation.leftShiftwithPosition(1);
		System.out.println(shiftOperation.leftShiftwithPosition(2));
		System.out.println(shiftOperation.rightShiftwithPosition(2));

	}

}
