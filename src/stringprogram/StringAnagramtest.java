package stringprogram;

import java.util.Arrays;
import java.util.Scanner;

public class StringAnagramtest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter any String");
        String first = sc.nextLine();

        System.out.println("please enter any String");
        String second = sc.nextLine();

        if (first.length() == second.length()) {
            char[] f = first.toCharArray();
            char[] s = second.toCharArray();

            Arrays.sort(f);
            Arrays.sort(s);

            if (Arrays.equals(f, s)) {
                System.out.println("Above strings are anagram to each other");
            } else {
                System.out.println("Above strings are not anagram to each other");

            }
            {
                System.out.println("Above strings are anagram to each other");

            }

        }
    }
}
