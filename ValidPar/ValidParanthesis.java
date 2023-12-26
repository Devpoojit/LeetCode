package ValidPar;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ValidParanthesis {
    public boolean isValid(String s) {
        Stack<Character> parStack = new Stack<Character>();
        List<Character> openPar = new ArrayList<Character>();
        openPar.add('(');
        openPar.add('{');
        openPar.add('[');

        for (Character c: s.toCharArray()) {
            if (openPar.contains(c)) {
                parStack.push(c);
            } else if (compareVal(c) != '-') {
                if (parStack.isEmpty() || (parStack.pop() != compareVal(c))) {
                    return false;
                }
            }
        }

        return parStack.isEmpty();
    }

    public char compareVal(char d) {
        switch (d) {
            case ')': return '(';
            case '}': return '{';
            case ']': return '[';
            default: return '-';
        }
    }
}
