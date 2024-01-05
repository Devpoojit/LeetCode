package ReverseInteger;

/**
 * ReverseInteger
 */
public class ReverseInteger {

    public static void main(String[] args) {
        Solution ob = new Solution();
        System.out.println("123: " + ob.reverse(123));
        System.out.println("-123: " + ob.reverse(-123));
        System.out.println("120: " + ob.reverse(120));
        System.out.println("1534236469: " + ob.reverse(1534236469));

    }

}

class Solution {
    public int reverse(int x) {
        if (x > Math.pow(2, 31)-1) return 0;
        boolean isNegative = (x < 0);
        x = Math.abs(x);
        int reverse = 0;
        while (x > 0) {
            int rem = x % 10;
            if (reverse > Integer.MAX_VALUE/10 || reverse < Integer.MIN_VALUE/10) return 0;
            reverse = (reverse * 10) + rem;
            x /= 10;
        }
        if (isNegative) {
            return -reverse;
        }
        return reverse;
    }
}



