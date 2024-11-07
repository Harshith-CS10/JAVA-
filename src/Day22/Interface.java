package Day22;

import java.util.Scanner;

interface Calculator
{
	void add();
	void sub();
}

class MyCalculator1 implements Calculator
{
	public void add()
	{
		int a = 20;
		int b = 10;
		int c = a+b;
		System.out.println(c);
	}
	public void sub()
	{
		int a = 20;
		int b = 10;
		int c = a-b;
		System.out.println(c);
	}
}

class MyCalculator2 implements Calculator
{
	public void add()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first number");
		int a = s.nextInt();
		System.out.println("Enter the second number");
		int b = s.nextInt();
		int c = a+b;
		System.out.println(c);
	}
	public void sub()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first number");
		int a = s.nextInt();
		System.out.println("Enter the second number");
		int b = s.nextInt();
		int c = a-b;
		System.out.println(c);
	}
}

class MyCalculator3 implements Calculator
{
	public void add()
	{

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first number");
		int a = s.nextInt();
		System.out.println("Enter the second number");
		int b = s.nextInt();
		if(b==0)
		{
			System.out.println("Second number is zero");
		}
		else
		{
			int c = a + b;
			System.out.println(c);
		}
	}
	public void sub()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first number");
		int a = s.nextInt();
		System.out.println("Enter the second number");
		int b = s.nextInt();
		if(b==0)
		{
			System.out.println("Second number is zero");
		}
		else
		{
			int c = a - b;
			System.out.println(c);
		}
	}
}

public class Interface {

	public static void main(String[] args) {
		
		MyCalculator1 m1 = new MyCalculator1();
		MyCalculator2 m2 = new MyCalculator2();
		MyCalculator3 m3 = new MyCalculator3();
		
		m1.add();
		System.out.println("=======================");
		m1.sub();
		System.out.println("=======================");
		m2.add();
		System.out.println("=======================");
		m2.sub();
		System.out.println("=======================");
		m3.add();
		System.out.println("=======================");
		m3.sub();


	}

}