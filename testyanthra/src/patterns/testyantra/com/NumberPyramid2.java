package patterns.testyantra.com;

import java.util.Scanner;

public class NumberPyramid2 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size:");
		int size = scanner.nextInt();
		
		int space = size/2;
		int num = 1;
		
		for(int i=0; i<size; i++) {
			int count = 1;
			for(int j=0; j<space; j++) {
				System.out.print("  ");
			}
			for(int j=1; j<=num; j++){
				System.out.print(count+" ");
				if(j<=num/2) {
					count++;
				}else
					count--;
			}
			if(i<size/2) {
				space--;
				num+=2;
			}else {
				space++;
				num-=2;
			}
			System.out.println();
		}
	}
}
