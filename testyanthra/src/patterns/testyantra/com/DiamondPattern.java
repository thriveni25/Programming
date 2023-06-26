package patterns.testyantra.com;

import java.util.Scanner;

public class DiamondPattern {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size:");
		int size = scanner.nextInt();
		
		int space = size/2;
		int star = 1;
		
		
		for(int i=0; i<size; i++) {
//			int count = 0;
			for(int j=0; j<size; j++ ) {
				if(j<space) {
					System.out.print("  ");
				}else {
					for(int k=0; k<star; k++) {
						System.out.print("* ");
					}
					break;
				}
			}
			if(i<size/2) {
				space--;
				star += 2;
			}else {
				space++;
				star -= 2;
			}
			
			System.out.println();
		}
	}
}
