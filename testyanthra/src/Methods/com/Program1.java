package Methods.com;

public class Program1 {
	public static int add(double a,double b) {
		
		
		return (int) (a+b);
		
	}
    public static String add(String a,String b) {
		
		
		return (a+b);
		
	}
	

	public static void main(String[] args) {
		System.out.println(add(20,40));
		System.out.println(add(20.5,40.5));
		System.out.println(add(20l,40l));
		System.out.println(add('A','C'));
		System.out.println(add("hello","bye"));
		
		
	}

}
