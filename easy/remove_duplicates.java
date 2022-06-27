package easy;
public class remove_duplicates {
  public int removeDuplicates(int[] nums) {
    int k = 1;
    int cur = nums[0];
    for (int i = 0; i < nums.length; i++) {
        if (nums[i] > cur) {
            cur = nums[i];
            swap(nums, k, i);
            k++;
        }
    }
    return k;
}

private void swap(int[] nums, int a, int b) {
    int temp;
    temp = nums[a];
    nums[a] = nums[b];
    nums[b] = temp;
}
}