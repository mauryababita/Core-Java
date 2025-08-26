package com.nacs.Operators;

public class BitwiseShiftOperation {
	int num1;

	public BitwiseShiftOperation() {
		
	}

	public BitwiseShiftOperation(int num1) {
		this.num1 = num1;

	}
	public int getnum1() {
		return num1;
	}
	public void setnum1(int num1) {
		this.num1=num1;
	}
	public int leftShiftwithPosition(int position) {
		return num1<<position;
	}
	
	public int rightShiftwithPosition(int position) {
		return num1>>position;
}
	public int unsignRightShiftWithPosition(int position) {
		return num1>>>position;
	}

}
