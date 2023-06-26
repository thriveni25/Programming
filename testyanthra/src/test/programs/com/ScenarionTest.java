package test.programs.com;

public class ScenarionTest {

	public static int solve(int[] nums, int start, int end) {

		int prevTwo = 0;
		int prevOne = 0;
		int max = 0;
		for (int i = start; i < end; i++) {
			max = Math.max(prevTwo + nums[i], prevOne);
			prevTwo = prevOne;
			prevOne = max;
		}
		return max;

	}

	public static void main(String[] args) {
		int[] nums = {2,3,2};
		int n = nums.length;
		System.out.println(Math.max(solve(nums, 0, n - 1), solve(nums, 1, n)));
	}
}
