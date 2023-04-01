package ArraysOnProgrammingTutorial;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int a[]= {1,2,95,1,6,2,5,62};
		Set<Integer> unique=new HashSet<>();
		boolean isDuplicate=false;
		
		for(int i=0;i<a.length;i++) {
			if(unique.contains(a[i])) {
				isDuplicate=true;
				System.out.println("Duplicate Elements are "+a[i]);
			}
			else {
				unique.add(a[i]);
			}
		}
		if(!isDuplicate) {
			System.out.println(-1);
		}
	}

}
