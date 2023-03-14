package Array2D;
import java.util.Scanner;

public class SparseMatrix {

    public static void main(String[] args) {
        int[][] matrix;
        int row, col;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        row = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        col = sc.nextInt();
        matrix = new int[row][col];
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
               
                matrix[i][j] =sc.nextInt();
            }
        }
        int count = 0;
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                if(matrix[i][j] == 0) {
                    count++;
                }
            }
        }
        if(count > (row * col)/2) {
            System.out.println("The matrix is sparse matrix");
        }
        else {
            System.out.println("The matrix is not a sparse matrix");
        }
    }

}