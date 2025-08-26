package com.nacs.Operators;

public class BinaryOperation {

	   int num1;
	   int num2;
	   
	   public BinaryOperation() {
		   
	   }
	   public BinaryOperation(int num1,int num2) {
		   this.num1=num1;
		   this.num2=num2;
	   }
	   
	   public int getnum1() {
		   return this.num1;
	   }
	   
	   public int getnum2() {
		   return this.num2;
	   }
	   public void setnum1(int num1) {
		   this.num1=num1;
	   }
	   public void setnum2(int num2) {
		   this.num2=num2;
	   }
	   public int addToNum() {
		   return num1+num2;
		  
	   }
	   public int subToNum() {
		   return num1-num2;
	   }
	   public int multiplyToNum() {
		   return num1*num2;
	   }
	   public int DivisionToNum() {
		   return num1/num2;
	   }
	   public int ModulToNum() {
		   return num1%num2;
	   }
	   public int bitwiseOprationOnTwoOperand() {
		   return num1&num2;
	   }
	   public int bitwiseOrOnTwoOperand() {
		   return num1|num2;
	   }
	   public int bitwiseXorOnTwoOperand() {
		   return num1^num2;
	   }
	}

