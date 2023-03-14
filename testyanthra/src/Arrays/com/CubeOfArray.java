package Arrays.com;

public class CubeOfArray {

	public static void main(String[] args) {
		 int cube=1;
		 int[] a= {1,2,3,4,5};
			/*a[0]=1;
			a[1]=2;
			a[2]=3;
			a[3]=4;
			a[4]=5;*/
			for(int i=0;i<a.length;i++) {
				
					cube=a[i]*a[i]*a[i];
				
				System.out.println("cube of "+a[i]+" = "+cube);
			}
			

	}

}
