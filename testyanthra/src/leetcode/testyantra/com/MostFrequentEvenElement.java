package leetcode.testyantra.com;

import java.util.Arrays;

public class MostFrequentEvenElement {

	public static void main(String[] args) {
		int nums[]= {0,1,2,2,4,4,1};
		int j=0;
		int l=nums.length-j;
	    int newarr[]=new int[l];
	     Arrays.sort(newarr); 
	      int res=0;
	      int count1=0;
	      for(int i=0;i<nums.length;i++){
	          if(nums[i]%2==0){
	              newarr[j++]=nums[i];
	          }
	      }
//	     if(j==0){
//	         return -1;
//	     }
	     {
	             for(int i=0;i<newarr.length-1;i++){
	               int count=0;
	             for(int j1=i+1;j1<newarr.length;j1++)
	                    {
	                    if(newarr[i]==newarr[j1]){
	                     count++;
	                    }
	                }
	                if(count>count1)
	                {
	                 count1=count;
	                 res=newarr[i];
	                }
	           
	            }
	     }
	           // return res;
	     System.out.println(Arrays.toString(newarr));
	     System.out.println(j+"j");
	     System.out.println(l+"l");
	     
	     
	     class Solution {
	    	    public int mostFrequentEven(int[] nums) {

	    	    int j=0;
	    	    int l=nums.length-j;
	    	    int newarr[]=new int[l];
	    	   
	    	     Arrays.sort(newarr); 
	    	      int res=0;
	    	      int count1=0;
	    	      for(int i=0;i<nums.length;i++){
	    	          if(nums[i]%2==0){
	    	              newarr[j++]=nums[i];
	    	          }
	    	      }
	    	     if(j==0){
	    	         return -1;
	    	     }
	    	     else{
	    	             for(int i=0;i<newarr.length-1;i++){
	    	               int count=0;
	    	             for(int j1=i+1;j1<newarr.length;j1++)
	    	                    {
	    	                    if(newarr[i]==newarr[j1]){
	    	                     count++;
	    	                    }
	    	                }
	    	                if(count>count1)
	    	                {
	    	                 count1=count;
	    	                 res=newarr[i];
	    	                }
	    	           
	    	            }
	    	     }
	    	            return res;
	    	    }
	    	}
	}

}
