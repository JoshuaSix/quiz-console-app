
public class dsasort {

    public static void main(String[] args) {

        //Selection sort algorithm 
        int nums[] = {11, 9, 8, 6, 5};
        int size = nums.length;
        int temp = 0;

        for (int num : nums) {
            System.out.println("Before " + num);
        }

        for (int i = 0; i < size; i++) {

            for (int j = 0; j < size - 1; j++) {

                if (nums[j] > nums[j + 1]) {

                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;

                }
            }
        }

        for (int num : nums) {
            System.out.println("After " + num);
        }

    }

}
