package java_hard;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.regex.Pattern;

/**
 * Brackets and parentheses in mathematical expressions have to conform to certain logical rules. Every opening bracket must have a closing mate somewhere further down the line. Although brackets can be nested, different types cannot overlap:
 *
 * ([<x+y>+3]-1) makes sense because each set of brackets contains or is contained by another set.
 * ([<x+y>+3)-1] makes no sense because the parentheses and the square brackets overlap.
 * Given a string expression that can contain four types of brackets: () <> [] {}, create a function that returns true if the bracket logic is valid and false if it is not.
 */
public class BracketLogic {

    public static void main(String[] args) {
        System.out.println(bracketLogic("[<>()]"));
        System.out.println(bracketLogic("[<(>)]"));
        System.out.println(bracketLogic("[(a*b+<7-c>+9]"));
        System.out.println(bracketLogic("[{(h*i+3)-12]/4*x+2}"));
        System.out.println(bracketLogic("[ab(c/d<e-f+(7*6)>)+2]"));
    }

    /**
     * Any characters other than the brackets can be ignored.
     */
    public static boolean bracketLogic(String xp) {
        xp = xp.replaceAll("[^\\(\\)\\[\\]\\{}<>]", "");
        var characterDeque = new ArrayDeque<Character>();
        var reg = "[\\(\\[\\{<]";
        for (int i = 0; i < xp.length(); i++) {
            var c = xp.charAt(i);
            if ((String.valueOf(c).matches(reg)))
                characterDeque.addFirst((c == '(') ? ')' : (c == '[') ? ']' : (c == '{') ? '}' : '>');
            else if (characterDeque.isEmpty() || c!= characterDeque.removeFirst()) return false;
        }
        return characterDeque.isEmpty();
    }
}

