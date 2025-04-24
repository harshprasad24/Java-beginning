import java.util.Arrays;

public class ContainsDuplicate217 {
    public static void main(String[] args) {
        int nums[] = {1,2,3,4};
        boolean ans = containsDuplicate(nums);    
        System.out.print(ans);                              
    }
    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                return true;
            }
        }
        return false;
    }
}
