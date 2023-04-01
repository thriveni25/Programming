package ArraysOnProgrammingTutorial;

public class PairsArray_GivenSum {

	public static void main(String[] args) {
		int a[]= {2,1,5,8,3,9,5,6};
		int sum=7;
		int low=0;
		int high=a.length-1;
		
		while(low<high) {
			if(a[low]+a[high]>sum) {
				high--;
			}
			else if(a[low]+a[high]<sum) {
				low++;
			}
			else if (a[low]+a[high]==sum) {
				System.out.println("pair (" + a[low] +","+a[high]+")");
				low++;
				high--;
			}
			
		}
	}

}
