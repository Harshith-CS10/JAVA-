package Day10;

import java.util.Scanner;
public class UserInputs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s = new Scanner(System.in);

  System.out.println("Enter the first nymber :");
  int a = s.nextInt();
  
  System.out.println("Enter the first nymber :");
  int b = s.nextInt();
  
  System.out.println("The sum of a and b :");
  int c = a+b;
  System.out.println(c);
  
  
 s.close(); // if s.close is not used then warning is given i.e Resource is leaked
  
 
// System.out.println("Enter the first nymber :");
// float a = s.nextInt();
// 
// System.out.println("Enter the first nymber :");
// float b = s.nextInt();
// 
// System.out.println("The sum of a and b :");
// float c = a+b;
// System.out.println(c);
// 
// 
//s.close(); // if s.close is not used then warning is given i.e Resource is leaked
// 
	}

}
