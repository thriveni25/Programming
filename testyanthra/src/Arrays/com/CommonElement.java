package Arrays.com;

public class CommonElement {

	public static void main(String[] args) {
		int[] a = {2, 3, 5, 9, 10, 2, 8, 1,0};
		int[] b = {1, 3, 7, 6, 5, 8, 9, 3, 6};
		
		for(int i=0; i < a.length; i++){
			for(int j=0;j<b.length;j++) {
				if(a[i]==b[j]) {
					System.out.print(a[i]+" ");
				}
				
			}
		
		}
	}
	}