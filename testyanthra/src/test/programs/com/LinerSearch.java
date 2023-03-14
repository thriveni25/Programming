package test.programs.com;

public class LinerSearch {

	public static void main(String[] args) {
				int[] a= {10,20,30,40,50};
				int n=20;
				boolean flag=true;
				for(int i=0;i<=a.length-1;i++)
				{
					if(a[i]==n)
					{
						System.out.println(n+" It is matched in array");
						flag=false;
						break;
					}		     	
				}
				if(flag==true) {
					System.out.println(n+"It is not matched in array");
				}
			}
		

	}


