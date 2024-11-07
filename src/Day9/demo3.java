package Day9;
class Addition2 {
	int c;
	int add(int x, int y)
	{
		c = x + y;
		return c;
	}
}
public class demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Addition2 ref = new Addition2();
int a = 10;
int b = 20;
int res = ref.add(a, b);
System.out.println(res); //Brings from the addres stored in the ref i. main stack
	}

}
