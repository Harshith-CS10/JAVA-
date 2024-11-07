package Day21;
abstract class Bird
{
	abstract void eat();
	abstract void fly();
}

abstract class Eagle extends Bird
{
	void fly()
	{
		System.out.println("Eagle flies at great heights");
	}
}
class SerpentEagle extends Eagle
{
	void eat()
	{
		System.out.println("-----------");
	}
	}
public class Demo1 {

	public static void main(String[] args) {
		SerpentEagle s = new SerpentEagle();
		s.eat();
		s.fly();

	}

}
