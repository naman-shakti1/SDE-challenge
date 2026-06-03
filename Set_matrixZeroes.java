import java.util.Scanner;
class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length; 
        int n = matrix[0].length;
        boolean firstRowZero = false;
        boolean firstcolZero = false;
        for(int j = 0; j < n; j++){
            if(matrix[0][j] == 0){
                firstRowZero = true;
                break;
            }
        }
        for(int i = 0; i < m ; i++){
            if(matrix[i][0] == 0){
                firstcolZero = true;
                break;
            }
        }
        for(int i = 1; i < m ; i++){
            for (int j = 1; j < n; j++){
                if (matrix[i][j] == 0 ) {
                     matrix[0][j] = 0;
                     matrix[i][0] = 0;
                }
            }
        }
        for(int i = 1; i < m ; i++){
            for (int j = 1; j < n; j++){
                if (matrix[i][0] == 0 || matrix[0][j] == 0 ){
                    matrix[i][j] = 0;
                }
            }
        }
        if( firstRowZero){
            for( int j = 0; j < n; j++){
                matrix[0][j] = 0;
            }
        }
         if( firstcolZero){
            for( int i = 0; i < m; i++){
                matrix[i][0] = 0;
            }
        }
    }
}
public class Set_matrixZeroes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int m = sc.nextInt();

        System.out.print("Enter columns: ");
        int n = sc.nextInt();

        int[][] matrix = new int[m][n];

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        Solution sol = new Solution();
        sol.setZeroes(matrix);

        System.out.println("Result Matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}