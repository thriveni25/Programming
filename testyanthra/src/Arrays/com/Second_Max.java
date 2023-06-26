package Arrays.com;

public class Second_Max {

	public static void main(String[] args) {
		int a[]= {41,9,3,0,2,6};
		
		int max1=a[0];
		int max2=a[1];
		
		for(int i=2;i<a.length;i++) {
			if(a[i]>max1) {
				max2=max1;
				max1=a[i];
			}
			else if(a[i]>max2 || max1==max2) {
				max2=a[i];
			}
		}
		System.out.println(max2);
		System.out.println(max1);


	}

}
