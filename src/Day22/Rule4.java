package Day22;
//Rule 4. Specialized methods cannot be accessed directly 
//using interface type reference.
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
	
	public void mul()
	{
		int a = 2;//Specialized method
		int b = 5;
		int c = a*b;
		System.out.println(c);
		
	}
	
}

public class Rule4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyCalculator1 c = new MyCalculator1();
		Calculator c1;//interface type reference
		c1 = c;
		c1.add();
		c1.sub();
		c1.mul();//specialized methods cannot be accesses using interface type reference
		((MyCalculator1)(c)).mul();
		
	}

}
