package Methods.com;

public class PercentageGrades {
	static void grades() {
		int m1=99,m2=99,m3=99,m4=98,m5=96;
		int per=((m1+m2+m3+m4+m5)*100)/500;
		System.out.println("percentage :"+per+"%");
		if(per>90) {
			System.out.println("A grade");
		}
		else if(per>80&&per<=90) {
			System.out.println("B grade");
		}
		else if(per>=60&&per<=80) {
			System.out.println("C grade");
		}
		else {
			System.out.println("D grade");
		}
	}

	public static void main(String[] args) {
		grades();
		

	}

}
