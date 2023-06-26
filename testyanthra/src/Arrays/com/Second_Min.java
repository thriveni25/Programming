package Arrays.com;

public class Second_Min {

	public static void main(String[] args) {
		int a[]= {41,9,3,0,2,6};
		
		int min1=a[0];
		int min2=a[1];
		
		for(int i=2;i<a.length;i++) {
			if(a[i]<min1) {
				min2=min1;
				min1=a[i];
			}
			else if(a[i]<min2 || min1==min2) {
				min2=a[i];
			}
		}
		System.out.println(min2);
		System.out.println(min1);

	}

}
