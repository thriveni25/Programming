package leetcode.testyantra.com;

public class BinarySearch {

	 public static int search(int[] a, int key) {
	       int low=0;
			int high=a.length-1;
			int mid=0;
			
			while(low<=high) {
				mid = (low+high)/2;
			if(key==a[mid]) {
				return mid;
			
			}
			else if(key>a[mid]) {
				low=mid+1;
				high=high;
				
			}
			else {
				high=mid-1;
				low=low;
			  }
	        }
			  return -1;
	    }
	public static void main(String[] args) {
		
		int[] a= {-1,0,3,5,9,12};
		
		System.out.println(search(a,2));

	}

}
