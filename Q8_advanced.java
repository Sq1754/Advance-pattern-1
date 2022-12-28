import java.util.Scanner;

public class Q8_advanced {
	public static void main(String[]args) {
		
		// Q8 print solid parallelogram
		/*
		 *       *****
		 *      *****
		 *     *****
		 *    *****
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Give row number");
		int rows = sc.nextInt();
		
		for(int i =1;i<=rows;i++) {
			// for spaces
			for(int j=1;j<=rows-i;j++) {
				System.out.print(" ");
			}
			
			// for stars
			for(int j=1;j<=5;j++) {
				System.out.print("*");	
			}
			System.out.println();
		}
		
		
		//  print Hollow Parallelogram
		/*
		 *       *****
		 *      *   *
		 *     *   *
		 *    *   *
		 *   *****
		 */
		
		System.out.println("\nhollow\n");
		
		
		
		for(int i =1;i<=rows;i++) {
			// for spaces
			for(int j=1;j<=rows-i;j++) {
				System.out.print(" ");
			}
			
			// for stars
			for(int j=1;j<=5;j++) {
				// for empty part 
				if(i==1||j==1||i==rows||j==rows) {
					System.out.print("*");
				}
				else {System.out.print(" ");}
					
			}
			System.out.println();
		}
		
		
	}
}
