package NumberProgramms;

public class Prime_Alternate {

	public static void main(String[] args) {
		// prime alternate like 2 5 11 17
		int start=1;int end=50;
		int alter=1;
		for (int i =start; i <=end; i++) {
			int count=0;
			for (int j = 1; j <=i ; j++) {
				if(i%j==0) {
					count++;
				}
			}
			
			if(count==2) {
				if(alter%2==1)
				System.out.println(i);
				alter++;
			}
		}

	}

}
