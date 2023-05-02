package Arrays.com;

import java.util.Arrays;

public class Prime {

	public static void main(String[] args) {
		int[] a=new int[5];
		a[0]=9;
		a[1]=2;
		a[2]=71;
		a[3]=18;
		a[4]=3;
		
		for(int i=0;i<a.length;i++) {
			int count=0;
			for(int j=1;j<=a[i];j++) {
				if(a[i]%j==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.println(a[i]+" ");
			}
		}
		

	}
}
