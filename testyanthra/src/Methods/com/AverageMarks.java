package Methods.com;

public class AverageMarks {
	
	static void percentage(int m1,int m2,int m3,int m4,int m5) {
		
		int avg=((m1+m2+m3+m4+m5)/5);
		int per=((m1+m2+m3+m4+m5)*100)/500;
		System.out.println("percentage :"+per+"%");
		System.out.println("Average :"+avg);
	}

	public static void main(String[] args) {
		percentage(92,85,49,78,96) ;

	}

}
