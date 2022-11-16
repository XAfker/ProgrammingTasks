package LeetCode.LeetCode75.Day1;

public class RunningSumOf1dArr {
    public static void main(String[] args) {
        int[] nums = {1,1,1,1,1};
        System.out.println(runningSum(nums));
    }

    public static int[] runningSum(int[] nums) {
        int sum = 0;
        int[] res = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            sum+=nums[i];
            res[i] = sum;
        }
        return res;
    }
}


