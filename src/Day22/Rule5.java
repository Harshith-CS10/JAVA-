package Day22;
//Rule 5 --> If a class partially implements interface , 
//it must declare itself as abstract.
interface Calculator
{
	void add();
	void sub();
}

abstract class MyCalculator1 implements Calculator
{
	public void add()
	{
		int a = 20;
		int b = 10;
		int c = a+b;
		System.out.println(c);
	}
}

public class Rule5 {

	public static void main(String[] args) {
		

	}

}



//interface Calculator {
//    void add();
//    void sub();
//}
//
//abstract class MyCalculator1 implements Calculator {
//    public void add() {
//        int a = 20;
//        int b = 10;
//        int c = a + b;
//        System.out.println(c);
//    }
//}
//
//// Subclass to implement the remaining method
//class MyCalculator2 extends MyCalculator1 {
//    @Override
//    public void sub() {
//        int a = 20;
//        int b = 10;
//        int c = a - b;
//        System.out.println(c);
//    }
//}
//
//public class Rule5 {
//    public static void main(String[] args) {
//        MyCalculator2 calc = new MyCalculator2();
//        calc.add();  // Outputs: 30
//        calc.sub();  // Outputs: 10
//    }
//}
