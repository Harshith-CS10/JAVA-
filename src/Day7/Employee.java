package Day7;

public class Employee {
	protected int id;
    protected int age;
    protected String name;
    protected boolean isPermanent;
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee();
        emp.id = 1;
        emp.name = "Harshith";
        emp.isPermanent = true;
        
        
        emp.age =(int)35.5;
      

        System.out.println("Successfully started");
    }
	}


