public class RemoveElement {
    public static void main(String[] args) {
        int nums[] = {3,2,2,3};
        int value = 3;
        int count = 0;
        for(int i = 0; i < nums.length;i++){
            if(nums[i] != value){
                nums[count] = nums[i];
                count++;
            }
        }
        for(int i = 0; i < nums.length; i++)
        {
            System.out.print(nums[i]);
        }
    }
}
