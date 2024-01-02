package Sqrt;

/**
 * Sqrt
 */
public class Sqrt {
    public int mySqrt(int x) {
        long min = 0, max = x, result = 0;        

        while (min <= max) {
           long mid = min + ((max - min)/2);
            if (mid*mid > x) {
                max = (mid - 1);
            } else if (mid*mid < x){
                min = (mid + 1);
                result = mid;
            } else {
                return (int) mid;
            }
        }
        return (int) result;
    }
}