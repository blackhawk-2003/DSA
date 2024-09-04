import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

public class _1971B {
    public static String generateRandomString(String input) {
        if (input == null || input.isEmpty()) {
            return ""; // Return empty string for invalid input
        }

        List<Character> charList = new ArrayList<>();
        for (char c : input.toCharArray()) {
            charList.add(c);
        }

        String randomString;
        do {
            // Shuffle the list of characters
            Collections.shuffle(charList);

            // Build the random string from the shuffled list
            StringBuilder randomStringBuilder = new StringBuilder();
            for (char c : charList) {
                randomStringBuilder.append(c);
            }

            randomString = randomStringBuilder.toString();
        } while (randomString.equals(input)); // Ensure the random string is not equal to the original

        return randomString;
    }

    public static boolean allCharacterSame(String str) {
        return IntStream.range(1, str.length())
                .allMatch(i -> str.charAt(i) == str.charAt(0));
    }

    public static boolean checkPallindrome(String str) {
        boolean isPalindrome = true;
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }
        return isPalindrome;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-->0) {
            String str = in.next();
            if (allCharacterSame(str) || checkPallindrome(str)) {
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
                System.out.println(generateRandomString(str));
            }
    }
    in.close();
}
}
