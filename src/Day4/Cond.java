package Day4;

public class Cond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 /*System.out.println("Start");
  
  int n = 5;
  if (n <=10);
  System.out.println("======================");
  
  
  
  // if else
  
  int a = 10;
  int b = 20;
  
  if(a<b)
  {
	  System.out.println(a + " is lesser than or equal to" + b);
	  
  }
  else if(a>b)
  {
	  System.out.println(a   +   " is greater than or equal to" + b);
  }
  
  else {
	  System.out.println(a + " is equal to " + b);
  }
  
  System.out.println("======================");
  
  
  
  
  
  n=
  
  
  
  
  
  */
		
		int n = 82;
		
		
		if(n>= 0 && n <=34)
		{
			System.out.println(n + " is Fail");
			
		}
		
		else if (n>= 35 && n <= 50) 
		{
			System.out.println(n + " is Second Class");
			
		}
		else if(n>=50 && n <= 80) {
			System.out.println(n + " is First Class");
		}
		else {
			System.out.println(n + " is Distintction");
		}
		
	}

}
