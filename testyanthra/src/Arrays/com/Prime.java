package Arrays.com;

public class Prime {

	public static void main(String[] args) {
		int[] a=new int[5];
		a[0]=19;
		a[1]=22;
		a[2]=13;
		a[3]=45;
		a[4]=51;
		for(int i=0;i<a.length;i++) {
			if(a[i]<=1) {
				System.out.println("Not prime");
				return;
			}
			
			for(int j=0;j<=a[i]/2;j++) {
			if(a[i]%2==0) {
				System.out.println("Not prime");
				break;
				
			}
			
			}
			System.out.println(a[i]);
		}

	}
}
