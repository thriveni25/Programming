package Methods.com;

public class GreatestOf3Nums {
	static void greatestnum() {
		int a=18, b=39,c=27;
		int biggest=(a>b)?(a>c?a:c):(b>c?b:c);
		System.out.println(biggest+" is biggest");
	}

	public static void main(String[] args) {
		greatestnum() ;

	}

}
