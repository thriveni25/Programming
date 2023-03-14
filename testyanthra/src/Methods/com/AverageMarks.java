package Methods.com;

public class AverageMarks {
	
	static void percentage() {
		int m1=99,m2=99,m3=99,m4=98,m5=96;
		int avg=((m1+m2+m3+m4+m5)/5);
		int per=((m1+m2+m3+m4+m5)*100)/500;
		System.out.println("percentage :"+per+"%");
		System.out.println("Average :"+avg);
	}

	public static void main(String[] args) {
		percentage() ;

	}

}
