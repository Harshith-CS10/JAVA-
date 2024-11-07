package Day9;
class Addition1{
	int c;
	void add(int x, int y)
	{
		
		c = x+y;
		System.out.println(c);
	}
}
public class demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition1 ref = new Addition1();
		int a = 10;
		int b = 20;
		ref.add(a,b);
	}

}
