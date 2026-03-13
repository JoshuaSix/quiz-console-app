
public class dsa {

    public static void main(String[] args) {

        int nums[] = {5, 6, 8, 9, 11};
        int target = 11;

        int result = BinaryFun(nums, target);

        if (result != -1) {
            System.out.println("The target is: " + result);
        } else {
            System.out.println("Target not found");
        }

    }

    public static int linnerFun(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static int BinaryFun(int[] nums, int target) {
        //5, 6, 8, 9, 11
        //   mid = 8
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            }

        }
        return -1;

    }

}
