package patterns.testyantra.com;

import java.util.Scanner;

public class Number_Diamond {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num: ");
		int size = sc.nextInt();
		
		int space = size/2;
		int num = 1;
		
		for(int i=0; i<size; i++) {
			for(int j=0; j<space; j++) {
				System.out.print("  ");
			}
			for(int j=0; j<num; j++) {
				if(j%2!=0) {
					System.out.print("$ ");
				}else
					System.out.print(1+" ");
				
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
