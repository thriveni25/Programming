package Arrays.com;

public class Third_Min {
	public static void main(String[] args) {
		
		int a[] = { 2, 2, 2, 6, 4, 3 };
		
		int min1 = Integer.MAX_VALUE;
		int min2 = 0;
		int min3 = 0;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]<min1) {
				min3=min2;
				min2=min1;
				min1=a[i];
			}
			else if(a[i]<min2 && a[i]!=min1) {
				min3=min2;
				min2=a[i];
			}
			else if(a[i]<min3 && a[i]!=min2 && a[i]!=min1) {
				min3=a[i];
			}
		}
		System.out.println(min3);
		System.out.println(min2);
		System.out.println(min1);

	}
}
