import java.util.Scanner;

public class DigitSort {

	public static void main(String[] args) {

		int a;
		int b;
		int c;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter 3 numbers: ");
		
		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();
		
		//if a largest
		if( a > b && a > c) {
			
			if( b > c) {
				
				System.out.print("The order is: " + c + " , " + b + " , " + a);
				
			}else if(c>b){
				
				System.out.print("The order is: " + b + " , " + c + " , " + a);
			}else {}

		}
		
		//If b largest 
		if(b > a && b > c) {
			
			if( a > c) {
				
				System.out.print("The order is: " + c + " , " + a + " , " + b);
				
			}else if(c>a){
				
				System.out.print("The order is: " + a + " , " + c + " , " + b);
				
			}else {}
			
			
		}
		
		//If c largest 
		if(c > a && c > b) {
			
			if( a > b) {
				
				System.out.print("The order is: " + b + " , " + a + " , " + c);
				
			}else if(b>a){
				
				System.out.print("The order is: " + a + " , " + b + " , " + c);
				
			}else {}
		}

	}

}
