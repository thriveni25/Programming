package ArraysOnProgrammingTutorial;

public class CommonElement_ThreeArrays {

	public static void main(String[] args) {
	//this code for sorted arrays only
	int a[]= {1,2,3,4,9};
	int b[]= {1,2,3,4,5,7,9};
	int c[]= {2,4,5,9};
	
	int x=0,y=0,z=0;
	
	while(x<a.length && y<b.length && z<c.length) {
		if(a[x]==b[y] && b[y]==c[z]) {
			System.out.println(a[x]);
			x++;
			y++;
			z++;
		}
		else if(a[x]>b[y]) {
			y++;
		}
		else if(b[y]>c[z]) {
			z++;
		}
		else {
			x++;
		}
	}
	

	}

}
