package Day12;

public class Student2 {
	
	String name;
	
	Student2(String name)
	{
		
		this.name = name;
	}
	//override
	
	public String toString() {
		return "[name="+ name+"]";
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student2 s1= new Student2("Tom");
		Student2 s2= new Student2("jerry");
		
		
		System.out.println(s1);
		System.out.println(s2);
	}

}
