package Day6;

public class pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		for (int i = 1; i <=5; i++) { 
            for (int j = 1; j <= i; j++) { // Inner loop for each column
                System.out.print("*");
            }
			System.out.println("             "); //for next line
			
			//System.out.println("             ");//for space between line
		}
	}

}
