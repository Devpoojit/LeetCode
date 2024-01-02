package AddBinary;

public class AddBinary {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int carry = 0;
        int aItr = a.length() - 1;
        int bItr = b.length() - 1;

        while (aItr >= 0 || bItr >= 0 || carry > 0) {
            int digitA = (aItr >= 0) ? a.charAt(aItr--) - '0' : 0;
            int digitB = (bItr >= 0) ? b.charAt(bItr--) - '0' : 0;

            int sum = digitA + digitB + carry;
            result.insert(0, sum % 2);
            carry = sum / 2;
        }

        return result.toString();
    }
}
