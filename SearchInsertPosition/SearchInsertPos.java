package SearchInsertPosition;

public class SearchInsertPos {
    public int searchInsert(int[] nums, int target) {
        int min = 0, max = (nums.length - 1);

        while (min <= max) {
            int mid = min + (max - min)/2;
            int midVal = nums[mid];

            if (midVal == target) {
                return mid;
            } else if (midVal < target) {
                min = mid + 1;
            } else {
                max = mid - 1;
            }
        }

        return min;
    }
}
