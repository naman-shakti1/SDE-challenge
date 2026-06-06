import java.util.Scanner;

class Solution {
    public int uniquePaths(int m, int n) {

        if (m <= 0 || n <= 0) {
            return 0;
        }

        int[] dp = new int[n];

        dp[0] = 1;

        for (int i = 0; i < m; i++) {

            for (int j = 1; j < n; j++) {

                dp[j] = dp[j] + dp[j - 1];
            }
        }

        return dp[n - 1];
    }
}

public class Grid_unique_paths {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Please enter a valid number of rows.");
            scanner.close();
            return;
        }
        int m = scanner.nextInt();

        System.out.print("Enter number of columns: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Please enter a valid number of columns.");
            scanner.close();
            return;
        }
        int n = scanner.nextInt();

        if (m <= 0 || n <= 0) {
            System.out.println("Rows and columns must be positive.");
            scanner.close();
            return;
        }

        Solution solution = new Solution();
        int paths = solution.uniquePaths(m, n);

        System.out.println("Number of unique paths: " + paths);

        scanner.close();
    }
}
