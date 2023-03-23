package Arrays.com;

public class BinarySearch {

	public static void main(String[] args) {
		int []a= {10,20,30,40,50,60,70,80,90};
		int low=0;
		int high=a.length;
		int mid=(low+high)/2;
		int key=30;
		boolean flag=false;
		while(low<=high) {
			mid = (low+high)/2;
		if(key==a[mid]) {
			flag=true;
			break;
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
		if(flag==true) System.out.println("Element found at index  "  +mid);
		else System.out.println("Element not found");
	}

}
