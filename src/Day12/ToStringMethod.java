package Day12;

public class ToStringMethod {
	
	//override
public String toString()
{
	
return "Vanisha "
		+ "harshith "
		+ "Dess"
		+ "Deekshith";
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ToStringMethod e = new ToStringMethod();
		
		System.out.println(e); //implicitly it call to string()
		System.out.println(e.toString()); //explicitly calling toString method()
		
	}

}
