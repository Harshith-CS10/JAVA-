
public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int choice = 1;
//switch(choice)
//{
//case 1 : System.out.println("In case -1");
//         break;
//case 2 : System.out.println("In case -2");
//         break;
//default : System.out.println("Invalid");         
//         
//}
		int a = 12;
        int b = 23;
        int c = 7;
		if (a >= b) {
		    if (a >= c) {
		        System.out.println("Largest number is: " + a);
		    } else {
		        System.out.println("Largest number is: " + c);
		    }
		} else {
		    if (b >= c) {
		        System.out.println("Largest number is: " + b);
		    } else {
		        System.out.println("Largest number is: " + c);
		    }}

		char grade = 'A';

		switch (grade) {
		    case 'A':
		    case 'B':
		    case 'C':
		    case 'D':
		    case 'F':
		        System.out.println("Valid grade: " + grade);
		        break;
		    default:
		        System.out.println("Invalid grade: " + grade);
		
		
	}

}}
//1. Program to find largest in 3 numbers using if else if and nested if?
//2. Program for Grade Validation using switch statement?
 
