package AnagramChecker;

import java.util.Scanner;

public class AnagramChecker {

    /**
     * Returns true if the two strings are anagrams of each other.
     */
    public static boolean isAnagram(String a, String b) {
        // TODO: implement using countLetters ()

        return false;
    }

    /**
     * Helper method to count how many times each letter (a-z) appears.
     */
    public static int[] countLetters(String s) {
        int[] counts = new int[26];
        // TODO: fill array with letter frequencies
        for (char c : s.toCharArray()) {
            if(Character.isLetter(c)) {
                counts[Character.toLowerCase(c) - 'a']++;
            }
        }
        return counts;
    }

    /**
     * Print only letters that appear in the string with their counts.
     */
    public static void printLetterCounts(String s) {
        // TODO: implement nicely formatted output
        int[] counts = countLetters(s);
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > 0) {
                char letter = (char) (i + 'a');
                System.out.println(letter + ": " + counts[i]);
            }
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get two strings from the user
        System.out.print("Enter the first string: ");
        String word1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String word2 = scanner.nextLine();

        // TODO: Process the strings here (ignore spaces, case)
        System.out.println("Are they anagrams? " + isAnagram(word1, word2));

        printLetterCounts(word1);

        scanner.close();
    }
}



