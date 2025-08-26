package com.nacs.Operators;

public class UnaryOperation {
	int num1;
	public UnaryOperation() {
		
	}
	public UnaryOperation(int num1) {
		this.num1=num1;
		
	}
	public int getnum1() {
		return num1;
	}
	public void setnum1(int num1) {
		this.num1=num1;
	}
	
	public void preincrementby1() {
		++num1;
	}
	
	public void postincrementby1() {
		num1++;
	}
	public void predecrementby1() {
		--num1;
	}
	public void postdecrementby1() {
		num1--;
	}
	
	public void calcuOnesComplement() {
		num1=~num1;
	}

}
