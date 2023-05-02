package test.programs.com;

import java.util.Arrays;

public class ArraysTest {

	public static void main(String[] args) {
		int a[]= {11,17,19,1,3,2,9,18,24};
	//	int a[]= {8,7,6,2,9,3};
		
		
		for (int i = 0; i < a.length; i++) {
			
			for (int j = i+1; j < a.length; j++) {
				
				if(a[i]%2!=0 && a[j]%2!=0)
				{
					if(a[i]<a[j]) {
//					a[i]=a[i]+a[j];
//					a[j]=a[i]-a[j];
//					a[i]=a[i]-a[j];
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					}
				}

				else if(a[i]%2==0 && a[j]%2==0)
				{
					if(a[i]>a[j]) {
//					a[i]=a[i]+a[j];
//					a[j]=a[i]-a[j];
//					a[i]=a[i]-a[j];
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					}
					
				}
			}
			
		}
		System.out.println(Arrays.toString(a));

	}

}
