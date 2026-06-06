import java.util.Scanner;

class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int element = 0;

        for (int num : nums) {
            if (count == 0) {
                element = num;
                count = 1;
            } else if (element == num) {
                count++;
            } else {
                count--;
            }
        }

        int frequency = 0;
        for (int num : nums) {
            if (num == element) {
                frequency++;
            }
        }

        if (frequency > nums.length / 2) {
            return element;
        }

        return -1;
    }
}

public class majority_element_I {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Array size must be positive.");
            scanner.close();
            return;
        }

        int[] nums = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        Solution solution = new Solution();
        int majority = solution.majorityElement(nums);

        if (majority == -1) {
            System.out.println("No majority element found.");
        } else {
            System.out.println("Majority element: " + majority);
        }

        scanner.close();
    }
}
