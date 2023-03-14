package Arrays.com;

public class ElementspresentIn2Arrays {

	public static void main(String[] args) {
		int [] a= {1,3,5,6,8};
		int [] b= {90,8,6,3,5};
		boolean flag=true;
		for(int i=0;i<a.length;i++) {
			  flag=false;
			for(int j=0;j<b.length;j++) {
		      if(a[i]==b[j]) {
			     flag=true;
			    break;
		       }
		    }
			  if(flag==false) {
				break;
			  }
		 }
		if(flag==true) System.out.println("Present");
		else System.out.println("not Present");
	
	}
}
