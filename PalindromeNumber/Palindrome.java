package PalindromeNumber;

public class Palindrome {
    public boolean isPalindrome(int x) {
        int origX = x;
        int revX = 0;
        while (x > 0) {
            int rem = (x % 10);
            x = (x / 10);
            revX = (revX * 10) + rem;
        }

        if (origX == revX) {
            return true;
        }
        return false;
    }
}
