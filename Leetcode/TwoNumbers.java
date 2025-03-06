public class TwoNumbers {
    public static void main(String[] args) {
        int nums[] = {3, 4, 2};
        int result[] = new int[2];
        int target = 6;
        for(int i = 0; i < nums.length-1; ++i)
        {
            for(int j = i + 1 ; j < nums.length; ++j)
            {
                if(nums[i] + nums[j] == target)
                {
                    result[0] = i;
                    result[1] = j;
                }
            }
        } for(int i = 0; i < result.length; i++)
        System.out.println(result[i]);
    }
}

