package RemoveElement;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int noMatch = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[noMatch++] = nums[i];
            }
        }
        for (int i : nums) {
            System.out.println(i);
        }
        return noMatch;
    }
}
