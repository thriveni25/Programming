package Recurssion;

public class WelcomeTestyantra {
	public static void print(int a) {
		if(a<1) {
			return;
		}
		else {
			System.out.println("Welcome testyantra");
			 print(a-1);
		}
	}

	public static void main(String[] args) {
		print(5);

	}

}
