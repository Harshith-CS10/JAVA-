package Day12;

//public class EqualsMethod {
//	
//	int age;
//	EqualsMethod(int age)
//	{
//		
//		this.age = age;
//	}
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//         EqualsMethod e = new EqualsMethod(20);
//         EqualsMethod e1 = new EqualsMethod(25);
//         
//         
//         System.out.println(e == e1);
//         System.out.println(e.equals(e1));
//	}
//
//}
import java.util.Objects;

public class ExampleForEqualsMethod {

	int age;
	
	ExampleForEqualsMethod(int age)
	{
		this.age = age;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ExampleForEqualsMethod other = (ExampleForEqualsMethod) obj;
		return age == other.age;
	}


	public static void main(String[] args) {
		
		ExampleForEqualsMethod e = new ExampleForEqualsMethod(20);
		ExampleForEqualsMethod e1 = new ExampleForEqualsMethod(25);
		
		System.out.println(e == e1);
		System.out.println(e.equals(e1));
		

	}

}