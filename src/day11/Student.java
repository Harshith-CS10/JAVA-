package day11;
//Accessing non static variables inside same class 
public class Student {
//non static variables
	int age = 20;
	String name = "Nikhil";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Student s = new Student();
 System.out.println("Student age : " +s.age);
 System.out.println("Student name :" +s.name);
	}

}
