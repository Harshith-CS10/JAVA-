package Day18;

class CreditClass
{
	int cardNo = 123456789;
	int pin = 2222;		
	
}
class Hacker extends CreditCard   //extend for child class 
{
	void viewDetails()
	{
		System.out.println(cardNo);
		System.out.println(pin);
	}
	
	void changeDetails()
	{
		cardNO = 1111111;
		pin = 3333;
	}
}

public class ChildClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
