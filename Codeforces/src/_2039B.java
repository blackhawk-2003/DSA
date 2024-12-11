import java.util.Scanner;

public class _2039B {
    public static String calculate(String str) {
        char arr[] = str.toCharArray();
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                String s = new StringBuilder().append(arr[i]).append(arr[i + 1]).toString();
                return s;
            }
        }
        for (int i = 0; i < str.length() - 2; i++) {
            if (arr[i] != arr[i + 1] && arr[i + 1] != arr[i + 2] && arr[i] != arr[i + 2]) {
                String s = new StringBuilder().append(arr[i]).append(arr[i + 1]).append(arr[i + 2]).toString();
                return s;
            }
        }
        return "not";

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t > 0) {
            String str = in.next();
            String result = calculate(str);
            if ("not".equals(result)) {
                System.out.println(-1);
            } else {
                System.out.println(result);
            }
            t--;
        }
    }
}
