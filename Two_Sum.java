import java.util.Arrays;

public class Two_Sum {
    public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;

        int[] temp = nums.clone();
        Arrays.sort(temp);

        int left = 0;
        int right = n - 1;

        int x = 0;
        int y = 0;

        while (left < right) {
            int sum = temp[left] + temp[right];

            if (sum == target) {
                x = temp[left];
                y = temp[right];
                break;
            } else if (sum > target) {
                right--;
            } else {
                left++;
            }
        }

        int first = -1;
        int second = -1;

        for (int i = 0; i < n; i++) {
            if (nums[i] == x) {
                first = i;
                break;
            }
        }

        for (int i = 0; i < n; i++) {
            if (nums[i] == y && i != first) {
                second = i;
                break;
            }
        }

        return new int[] {first, second};
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(nums, target);

        System.out.println("First index: " + result[0]);
        System.out.println("Second index: " + result[1]);
    }
}
