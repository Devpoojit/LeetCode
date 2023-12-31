package TwoSum;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                int difference = target - nums[i];
                return new int[] {map.get(difference), i};
            } else {
                map.put(nums[i], i);
            }
        }
        return null;
    }
}
