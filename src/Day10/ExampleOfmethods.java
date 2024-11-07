package Day10;

class Rectangle
{
int area(int l, int b)
{
return l*b;	

}

float area(float l, int b)
{
return l*b;
}
int area(int l, int b, int h)
{
return l*b*h;	
}
}

public class ExampleOfmethods{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Rectangle r = new Rectangle();
int a = 10, b = 20;
float m = 45.5f, n = 36.7f;
System.out.println(r.area(a,b));
System.out.println(r.area(m,b));
System.out.println(r.area(n, b));

	}

}
