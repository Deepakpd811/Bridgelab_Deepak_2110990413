package java_30_jan;

import java.util.Arrays;

public class Annagram {
    public static void main(String[] args) {

        String a = "Heart";
        String b = "Earth";

        a = a.toLowerCase();
        b = b.toLowerCase();

        char[] str1 = a.toCharArray();
        char[] str2 = b.toCharArray();

        Arrays.sort(str1);
        Arrays.sort(str2);

        if (Arrays.equals(str1, str2)) {
            System.out.println("String is anagram");
        } else {
            System.out.println("String is Not anagram");

        }

    }
}
