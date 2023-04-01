package Arrays.com;

import java.util.ArrayList;

public class SubArray {

	public static ArrayList<Integer> main(String[] args) {
		int a[]= {1,2,3,4,5};
		int n=a.length;
		int s=0;
		ArrayList<Integer> arr1= new ArrayList<>();
		for(int i=0;i<n;i++) {
			int sum=0;
			for(int j=i;j<n;i++) {
				sum+=a[j];
				if (sum==s) {
					break;
				}
				
				for(Integer g:a)
				{
					arr1.add(g);
				}
			
			}
		
		}
		return arr1;
	}

}
