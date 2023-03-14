package Methods.com;

public class Polygon {
	static void areaOfRectangle(int a,int b) {
		
		int area=a*b;
		System.out.println("Rectangle Area :"+area);
	}
	static void areaOfSquare(int a) {
		int area=a*a;
		System.out.println("Square Area :"+area);
	}
	static void areaOfCircle(double a) {
		
		double area=3.14*(a*a);
		System.out.println("Circle Area :"+area);
	}
	static void areaOfTriangle(int a,int b) {
		
		double area=(a*b)/2;
		System.out.println("Triangle Area :"+area);
	}
	public static void main(String[] args) {
		 areaOfRectangle(10,3);
		 areaOfSquare(10);
		 areaOfCircle(8);
		 areaOfTriangle(2,6);
	}
	

}
