package leetcode.testyantra.com;


	public class Solution {
		    public int removeDuplicates(int[] nums) {
		     
			int i =0 ;
		   
			for(int j=1; j<nums.length ; j++){
				if(nums[i] !=nums[j]){
					i++;

		            nums[i] = nums[j];
		        }
		    
		    }
		    return (i+1);
		    
		    }
		    public static void main(String[] args) {
		    	int[] nums = {1,1,2}; 
		    	int[] expectedNums = new int [nums.length];
		    	 Solution s=new  Solution ();

		    	int k =s.removeDuplicates(nums);

		    	assert k == expectedNums.length;
		    	for (int i = 0; i < k; i++) {
		    	    assert nums[i] == expectedNums[i];
		    	    System.out.println(nums[i]+" ");
		    	}
		    	
			}
		

	}


