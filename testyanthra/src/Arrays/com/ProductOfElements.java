package Arrays.com;

public class ProductOfElements {

	public static void main(String[] args) {
		int prod=1;
		int[] a=new int[5];
		a[0]=1;
		a[1]=2;
		a[2]=3;
		a[3]=4;
		a[4]=5;
		for(int i=0;i<a.length;i++) {
			prod=prod*a[i];
		}
		System.out.println("Product :"+prod);
	}

}
