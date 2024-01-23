package StringTest;

import java.util.*;

public class Strin {
    public static void main(String args[])
    {
        String s[] = {"This","is","a","test"};
        String t[] = Arrays.copyOf(s, s.length);
        t[0] = "bruh";
        System.out.println(s[0]==t[0]);
        System.out.println(s[0].equals(t[0]));
    }
}
