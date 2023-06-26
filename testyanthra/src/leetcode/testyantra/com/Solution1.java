package leetcode.testyantra.com;
import java.util.*;
public class Solution1 {
	 public int removeElement(int[] nums, int val) {
	      int t=0;
	         for(int i = 0 ; i < nums.length ; i++){
	            if(nums[i]!=val){
	                nums[t]=nums[i];
	                    t++;
	            }
	        }
	        return t;  
	    }

	public static void main(String[] args) {
		int[] nums =  {0,1,2,2,3,0,4,2};
		int val = 2; 
		int[] expectedNums = new int [2]; 
		                           
		Solution1 s=new Solution1();
		int k = s.removeElement(nums, val); 

		assert k == expectedNums.length;
		Arrays.sort(nums, 0, k);
		for (int t = 0; t < k; t++) {
		    assert nums[t] == expectedNums[t];
		    System.out.print(nums[t]+" ");
		}

	}

	

}
