package PlusOne;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        for (int i = (digits.length - 1); i >= 0; i--) {
            digits[i]++;

            if (digits[i] <= 9) {
                return digits;
            } else {
                digits[i] = 0;
            }
        }
        int[] digits_niner = new int[digits.length+1];
        digits_niner[0] = 1;
        return digits_niner;
    }
}
