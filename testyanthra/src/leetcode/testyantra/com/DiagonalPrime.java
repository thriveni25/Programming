package leetcode.testyantra.com;

public class DiagonalPrime {

	public static int diagonalPrime(int[][] nums) {
		int maxPrime = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				if (i == j || i + j == nums.length - 1 && (isPrime(nums[i][j]))) {
					maxPrime = Math.max(maxPrime, nums[i][j]);
				}
			}
		}

		return maxPrime;
	}

	private static boolean isPrime(int num) {
		if (num < 2) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		int[][] nums = { { 1, 2, 3 }, { 5, 6, 7 }, { 9, 10, 11 } };
		System.out.println(diagonalPrime(nums));
	}
}
