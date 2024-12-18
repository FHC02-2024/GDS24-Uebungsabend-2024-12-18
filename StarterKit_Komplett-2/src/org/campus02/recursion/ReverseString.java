package org.campus02.recursion;

public class ReverseString {

    public static void main(String[] args) {
        String input = "hallo";
        System.out.println("input = " + input);
        String output = reverse(input);
        System.out.println("output = " + output);
    }

    /**
     * der übergebene String soll umgekehrt werden
     * => zB: input "hallo"
     *        output "ollah"
     * @param s
     * @return
     */
    public static String reverse(String s) {
        // Abbruchsbestimmung
        if (s.length() <= 1) {
            return s;
        }
        char first = s.charAt(0);
        return reverse(s.substring(1)) + first;
    }
}
