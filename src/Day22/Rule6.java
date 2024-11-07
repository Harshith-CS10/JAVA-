package com.day15;
//Rule 6 --->A class can implement multiple interfaces 
//because diamond shape problem does not exist as interface
//will not have parent

interface Calculator1
{
	void add();
	void sub();
}
interface Calculator2
{
	void mul();
	void div();
}
class MyCalculator implements Calculator2, Calculator1
{
	public void add()
	{
		
	}
	public void sub()
	{
		
	}
	public void mul()
	{
		
	}
	public void div()
	{
		
	}
}

public class Rule6 {

	public static void main(String[] args) {
		

	}

}
