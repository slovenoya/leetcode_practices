package easy.sorting;
import java.util.Arrays;
public class missing_number {
  public int missingNumber(int[] nums) {
    Arrays.sort(nums);
    for (int i = 0; i < nums.length; i++) 
        if (i != nums[i])
            return i;
    return nums[nums.length - 1] + 1;
}
}
