package test.programs.com;

public class Rob {
	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 1 };

		int sum = 0;
		if (a.length % 2 == 1) {
			int max = 0, max1 = 0;
			for (int i = 1; i < a.length; i++) {
				if (i % 2 == 0) {
					max = max + a[i];
				} else {
					max1 = max1 + a[i];
				}

			}

			sum = Math.max(max, max1);
		}

		else {
			int max = 0, max1 = 0;
			for (int i = 0; i < a.length; i++) {
				if (i % 2 == 0) {
					max = max + a[i];
				} else {
					max1 = max1 + a[i];
				}

			}
			sum = Math.max(max, max1);

		}
		System.out.println(sum);
	}

}
