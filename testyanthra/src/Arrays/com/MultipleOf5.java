package Arrays.com;

public class MultipleOf5 {

	public static void main(String[] args) {
		int[] a=new int[5];
		a[0]=19;
		a[1]=22;
		a[2]=13;
		a[3]=45;
		a[4]=51;
		for(int i=0;i<a.length;i++) {
			if(a[i]%5==0) {
				System.out.println(a[i]+" is multiple of 5");
			}
			else {
				System.out.println(a[i]+" is not multiple of 5");
			}
		}
	}

}
