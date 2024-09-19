import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class _2005A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the string: ");
        int length = scanner.nextInt();

        String optimalString = findOptimalString(length);
        int palindromicCount = countPalindromicSubsequences(optimalString);

        System.out.println("Optimal string: " + optimalString);
        System.out.println("Number of palindromic subsequences: " + palindromicCount);
    }

    private static String findOptimalString(int length) {
        String vowels = "aeiou";
        Set<String> uniqueStrings = new HashSet<>();
        generateCombinations(vowels, "", length, uniqueStrings);

        String optimalString = null;
        int minCount = Integer.MAX_VALUE;

        for (String str : uniqueStrings) {
            int count = countPalindromicSubsequences(str);
            if (count < minCount) {
                minCount = count;
                optimalString = str;
            }
        }

        return optimalString;
    }

    private static void generateCombinations(String vowels, String current, int length, Set<String> uniqueStrings) {
        if (current.length() == length) {
            uniqueStrings.add(current);
            return;
        }

        for (int i = 0; i < vowels.length(); i++) {
            generateCombinations(vowels, current + vowels.charAt(i), length, uniqueStrings);
        }
    }
    private static int countPalindromicSubsequences(String s) {
        int n = s.length();
        int[][] dp = new int[n][n];

        // Every single character is a palindrome
        for (int i = 0; i < n; i++) {
            dp[i][i] = 1;
        }

        // Fill the dp table for longer substrings
        for (int length = 2; length <= n; length++) {
            for (int i = 0; i < n - length + 1; i++) {
                int j = i + length - 1;
                if (s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = dp[i + 1][j] + dp[i][j - 1] + 1;
                } else {
                    dp[i][j] = dp[i + 1][j] + dp[i][j - 1] - dp[i + 1][j - 1];
                }
            }
        }

        return dp[0][n - 1];
    }
}
