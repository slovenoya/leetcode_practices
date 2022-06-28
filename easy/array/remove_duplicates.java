package easy.array;
public class remove_duplicates {
  public int removeDuplicates(int[] nums) {
    int k = 1;
    int cur = nums[0];
    for (int i = 0; i < nums.length; i++) {
        if (nums[i] > cur) {
            cur = nums[i];
            nums[k] = nums[i];
            k++;
        }
    }
    return k;
  }
}