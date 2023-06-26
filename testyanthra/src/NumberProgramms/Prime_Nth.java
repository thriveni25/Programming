package NumberProgramms;

public class Prime_Nth {

	public static void main(String[] args) {
		int n=565;
		int count1=0;
		for(int i=1;n>=count1;i++) {
			int count=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==2) {
				count1++;
				if(count1==n) {
					System.out.println(i);
				}
			}
			
		}

	}

}
