package RomanToInteger;

import java.util.HashMap;

public class RomanToInteger {
    public int romanToInt(String s) {
        int result = 0;
        HashMap<Character, Integer> roman = new HashMap<Character, Integer>();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);

        for (int i = (s.length() - 1); i >= 0; i--) {
            int curVal = roman.get(s.charAt(i));
            int prevVal = 0;

            if (i > 0) {
                prevVal = roman.get(s.charAt(i-1));
            }

            if (prevVal < curVal) {
                result = result + (curVal - prevVal);
                i--;
            } else {
                result += curVal;
            }
        }
            return result;
    }
}
