import java.util.*;

import javax.lang.model.util.ElementScanner14;
import javax.swing.plaf.synth.SynthStyle;

class palindrome {

    public static boolean palin(String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "Madam";
        // String str = "";
        // for (int i = 0; i < l; i++) {
        // str = s.charAt(i) + str;
        // }
        // if (s.equalsIgnoreCase(str))
        // System.out.println("palindrome");
        // else
        // System.out.println("Not");
        if (palin(s) == true) {
            System.out.println("palindrome");
        } else
            System.out.println("Not");
    }

}
