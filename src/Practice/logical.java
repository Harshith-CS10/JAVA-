package Practice;

public class logical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x=2;
System.out.println(x);

//Logical operator

int i = 1;
int j = 2;

boolean result1 = i == 1 && i >= 1;//and

System.out.println(result1);

boolean result2 = i > 5 || i == 1;//or

System.out.println(result2);

System.out.println(!true);
System.out.println(!(20<5));
System.out.println("======================");
//Ternary 

int  p = 10;
int q = 12;
boolean max = p > q ? true : false;
System.out.println(max);

}
}