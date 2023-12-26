import java.util.Arrays;

/**
 * MainClass
 */
public class MainClass {

    public static void main(String[] args) {
        TwoSum objSum = new TwoSum();
        int[] outArr = objSum.twoSum(new int[]{2,7,11,15}, 9);
        System.out.println(Arrays.toString(outArr));
        outArr = objSum.twoSum(new int[]{3,2,4}, 6);
        System.out.println(Arrays.toString(outArr));
        outArr = objSum.twoSum(new int[]{3,3}, 6);
        System.out.println(Arrays.toString(outArr));
    }
}