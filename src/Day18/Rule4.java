package Day18;


class test1 extends Object
{
int x, y ;
Test1(int x , int y)
{
	this.x = x;
	this.y = y;
}
}

class Test2 extends Test1
{
	int a, b;
	Test2()
	{
		a = 300;
		b = 400;
	}
	Test2(int a, int b)
	{
		this.a = a;
		this.b = b;
		
	}
	void display()
	{
		System.out.println(x);
		System.out.println(y);
		System.out.println(a);
		System.out.println(b);
	}
}

public class Rule4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
