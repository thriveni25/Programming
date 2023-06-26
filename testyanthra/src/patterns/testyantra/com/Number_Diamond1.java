package patterns.testyantra.com;

import java.util.Scanner;

public class Number_Diamond1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num: ");
		int size = sc.nextInt();

		int space = size / 2;
		int num = 1;

		for (int i = 1; i <=size; i++) {
			int c=1;
			for (int j = 0; j < space; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <=num; j++) {
				if(j%2==0)
					System.out.print("* ");
				else if(c<=size) {
					System.out.print(c+" ");
				c++;
				}
			}
			if (i <=size / 2) {
				space--;
				num += 2;
			} else {
				space++;
				num -= 2;
			}
			
			System.out.println();
		}
		
		/*int space = size / 2;
		int num = 1;

		for (int i = 1; i <= size; i++) {

			for (int j = 1; j <= space; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= num; j++) {
				if (j <= num)
					System.out.print(j + " ");
				if (j < num)
					System.out.print("* ");
			}
			if (i <= size / 2) {
				space--;
				num++;
			} else {
				space++;
				num--;
			}

			System.out.println();
		}*/


	}

}
