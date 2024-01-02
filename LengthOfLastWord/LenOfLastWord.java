package LengthOfLastWord;

public class LenOfLastWord {
    public int lengthOfLastWord(String s) {
        boolean found = false;
        int i = s.length() - 1;
        int result = 0;

        if (!s.contains(" ")) {
            return s.length();
        }

        if (s.toCharArray()[i] == ' ') {
            while (s.toCharArray()[i] == ' ') {
                System.out.println(s.toCharArray()[i]);
                i--;
            }
        }

        while(i >= 0) {
            if (s.toCharArray()[i] == ' ') {
                return result;
            } else {
                result++;
                i--;
            }
        }
        return result;
    }
}
