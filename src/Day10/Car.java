package Day10;

public class Car {
	 String make;
	 String model;
	 short year;
	 int price;
	 void attri()
		{
		 make = "Toyota";
		model = "Supra";
			year = 2010;
			price = 1000000;
		
		}
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car();
//		c.make = "Toyota";
//		c.model = "Supra";
//			c.year = 2010;
//			c.price = 1000000;
		c.attri();
		
		System.out.println("Make: " + c.make);
        System.out.println("Model: " + c.model);
        System.out.println("Year: " + c.year);
        System.out.println("Price: $" + c.price);
		
		
	}

}
