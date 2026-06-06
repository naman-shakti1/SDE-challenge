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
        int m = scanner.nextInt();

        System.out.print("Enter number of columns: ");
        int n = scanner.nextInt();

        Solution solution = new Solution();
        int paths = solution.uniquePaths(m, n);

        if (paths == 0) {
            System.out.println("Rows and columns must be positive.");
        } else {
            System.out.println("Number of unique paths: " + paths);
        }

        scanner.close();
    }
}
