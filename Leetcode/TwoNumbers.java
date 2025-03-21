public class TwoNumbers {
    public static int[] TwoNumbersFunc(int nums[], int target){
        int result[] = new int[2];
        for(int i = 0; i < nums.length-1; ++i){
            for(int j = i + 1 ; j < nums.length; ++j){
                if(nums[i] + nums[j] == target){
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int nums[] = {3, 4, 2};
        int target = 6;
        int ans[] = TwoNumbersFunc(nums, target);
        System.out.print("Index: ");
        for(int i = 0; i < ans.length; i++)
        System.out.print(ans[i] + " ");
    }
}

