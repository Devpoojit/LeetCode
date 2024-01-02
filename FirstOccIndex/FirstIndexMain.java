package FirstOccIndex;

public class FirstIndexMain {
    public static void main(String[] args) {
        FirstIndex ob = new FirstIndex();
        FirstIndex ob2 = new FirstIndex();
        System.out.println("Haystack: sadbutsad \nNeedle: sad\n");
        System.out.println(ob.strStr("sadbutsad", "sad") + "\n");
        System.out.println("Haystack: leetcode \nNeedle: leeto\n");
        System.out.println(ob.strStr("leetcode", "leeto") + "\n");
    }
}
