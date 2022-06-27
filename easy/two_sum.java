package easy;
import java.util.HashMap;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>(nums.length * 2);
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (map.get(diff) != null && ((int)map.get(diff) != i)) {
                result[0] = i;
                result[1] = (int)(map.get(diff));
            }
        }
        return result;
    }
}