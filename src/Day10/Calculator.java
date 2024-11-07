package Day10;

public class Calculator {
  int add(int a , int b )
  {
	  return a + b;
  }
  
  int add(int a , int b, int c )
  {
	  return a + b + c;
  }
  double add (double a, double b)
  {
	  return a + b;
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator c = new Calculator();
		int x = 10, y = 20, z = 30;
        double m = 45.5d, n = 36.7d;

        System.out.println(c.add(x, y));
        System.out.println(c.add(x, y, z));
        System.out.println(c.add(m, n));
  }

}
