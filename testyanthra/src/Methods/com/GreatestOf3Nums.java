package Methods.com;

public class GreatestOf3Nums {
	static void greatestnum() {
		int a=88, b=39,c=257;
		int biggest=(a>b && a>c)?a:(b>c ? b : c);
		System.out.println(biggest+" is biggest");
	}

	public static void main(String[] args) {
		greatestnum() ;

	}

}
