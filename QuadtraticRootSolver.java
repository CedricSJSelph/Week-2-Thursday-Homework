import java.util.Scanner;

public class QuadtraticRootSolver {

	public static void main(String[] args) {
		
		float A;
		float b;
		float c;
		float root_1;
		float root_2;
		float PosNegCheck;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a, b, c: ");
		
		A = input.nextFloat();
		b = input.nextFloat();
		c = input.nextFloat();
		
		PosNegCheck = (b*b) - (4 * A * c);
		
	
		if(PosNegCheck>0.0) {
			//Since positive, two roots
			
			root_1 = (float)((-b + Math.pow(PosNegCheck, .5))/(2*A));
			root_2 = (float)((-b - Math.pow(PosNegCheck, .5))/(2*A));
			
			System.out.print("This equation has two roots: " + root_1 + " and " + root_2);
			
		}else if(PosNegCheck == 0.0) {
			//Since 0, one root
			
			root_1 = -b / (2*A);
			
			System.out.println("This quadratic has one root: " + root_1);
		
		}else if(PosNegCheck<0.0) {
			//Since negative, no roots
			
			System.out.print("This quadratic has no real roots.");
			
		}else {
			System.out.println("***FATAL ERROR***");
		}
	}

}
