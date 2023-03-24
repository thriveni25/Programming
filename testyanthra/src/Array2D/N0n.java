package Array2D;

public class N0n {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {1,2,3};
		int k=1;
		 int c=0;
	        for(int i=0;i<nums.length;i++){
	            int sum=0;
	            for(int j=i;j<nums.length;j++){
	                
	            	sum=sum+nums[j];
	            	System.out.println(sum);
	                if(sum==k){
	                    c++;
	                    
	                }
	            }
	        }
	}

}
