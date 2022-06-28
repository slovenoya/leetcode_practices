package easy.array;

public class find_pivot_index {
  public int pivotIndex(int[] nums) {
    int sum = 0;
    int left = 0;
    for (int i = 0; i < nums.length; i++) 
        sum += nums[i];
    for (int i = 0; i < nums.length; i++) {
        if (left == (sum - left - nums[i])) return i;
        left += nums[i];
    }
    return -1;
  }
}
