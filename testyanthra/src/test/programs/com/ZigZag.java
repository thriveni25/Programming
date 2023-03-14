package test.programs.com;

public class ZigZag {

	public static void main(String[] args) {
		int a[]= {10,20,30};
		int b[]= {90,80,70,100};
		int c[]= new int [a.length+b.length];
		
		int j=0,k=0;
		for(int i=0;i<c.length;i++) {
			if(j<a.length) {
				c[i++]=a[j++];
			}
			if(k<b.length) {
				c[i]=b[k++];
			}
		}
		for(int i=0;i<c.length;i++) {
			System.out.print(c[i]+" ");
		}

	}

}
