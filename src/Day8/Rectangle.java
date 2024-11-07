package Day8;


public class Rectangle { //Create a class Rectangle. 
 int length;
 int width;
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rectangle r = new Rectangle();
		r.length = 2;
	r.width = 2;
	  int area1 = r.length * r.width;
	  
	 Rectangle a = new Rectangle();
	 a.length = 3;
	 a.width = 3;
	 int area2 = a.length * a.width;
	 
	 if (area1 > area2) {
         System.out.println("Rectangle1 > Rectangle2");
     } else if (area1 < area2) {
         System.out.println("Rectangle1 < Rectangle2");
     } else {
         System.out.println("They are equal");
     }
 }
	 
	}

