package java_hard;

import java.util.ArrayList;
import java.util.List;

/**
 * Additional spaces have been added to a sentence.
 * Return the correct sentence by removing them.
 * All words should be separated by one space, and there should be no spaces at the beginning or end of the sentence.
 */
public class FixTheSpacing {

    public static void main(String[] args) {
        System.out.println(correctSpacing("The film   starts       at      midnight. "));
        System.out.println(correctSpacing("The     waves were crashing  on the     shore.   "));
        System.out.println(correctSpacing(" Always look on    the bright   side of  life."));
    }

    public static String correctSpacing(String sentence) {
        List<String> list_str = new ArrayList<>();
        String[] arr = sentence.split(" ");
        String out = "";
        for (String s : arr) if (!s.equals(" ")) list_str.add(s);
        System.out.println(list_str);
        for (String s : list_str) if (!s.equals("")) out += s + " ";
        return out.substring(0, out.length() - 1);
    }

}
