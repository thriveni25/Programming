package patterns.testyantra.com;

import java.util.Scanner;

public class Diamond_Pattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num: ");
		int size = sc.nextInt();

		int space = size / 2;
		int star = 1;
		for (int i = 1; i <= size; i++) {
			for (int j = 1; j <= space; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= star; j++) {
				System.out.print("* ");
			}
			if (i <=size / 2) {
				space--;
				star = star + 2;
			} else {
				space++;
				star = star - 2;
			}
			System.out.println();
		}

	}

}
