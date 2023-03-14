package Arrays.com;

public class Largest2nd {

	public static void main(String[] args) {
		
				int ar[]={5,3,2};
				int fbig=ar [0];
				int sbig=ar [1];
				for (int i=1; i<ar.length; i++)
				{
				if (fbig<ar[i])
				{
				sbig=fbig;
				fbig=ar[i];
				}
				else if (sbig<ar[i])
				{
				sbig=ar[i];
				}
				}
				System.out.println ("first biggest element is "+fbig);
				System.out.println ("second biggest element is "+sbig);
				

			}

		}
	


