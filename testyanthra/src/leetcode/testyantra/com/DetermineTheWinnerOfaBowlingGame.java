package leetcode.testyantra.com;

public class DetermineTheWinnerOfaBowlingGame {

	public static int isWinner(int[] player1, int[] player2) {

		int p1sum = 0;
		for (int i = 0; i <= player1.length - 1; i++) {
			if ((i > 0 && player1[i - 1] == 10) || (i > 1 && player1[i - 2] == 10)) {
				p1sum = p1sum + player1[i] * 2;
			} else {
				p1sum += player1[i];
			}
		}

		int p2sum = 0;
		for (int i = 0; i <= player2.length - 1; i++) {
			if ((i > 0 && player2[i - 1] == 10) || (i > 1 && player2[i - 2] == 10)) {
				p2sum = p2sum + player2[i] * 2;
			} else {
				p2sum += player2[i];
			}
		}
		if (p1sum > p2sum)
			return 1;
		else if (p1sum < p2sum)
			return 2;
		else
			return 0;

	}

	public static void main(String[] args) {
		
		int [] player1= {3,5,7,6};
		int [] player2= {8,10,10,2};
		
		System.out.println( isWinner(player1,player2));
		
	}

}
