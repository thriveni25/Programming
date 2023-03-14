package Arrays.com;

public class EvenOrOdd {

	public static void main(String[] args) {
		int[] a=new int[5];
		a[0]=19;
		a[1]=22;
		a[2]=13;
		a[3]=45;
		a[4]=51;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==1) {
				System.out.println(a[i]+"odd num");
			}
			else {
				System.out.println(a[i]+"even num");
			}
		}

	}

}
