import java.util.Scanner;

public class _1915B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            String[][] square = new String[3][3];
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    square[i][j] = in.next();
                }
            }
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if ("?".equals(square[i][j])) {
                        if (i == 0) {
                            if (("A".equals(square[i + 1][j]) && "B".equals(square[i + 2][j]))
                                    || ("B".equals(square[i + 1][j]) && "A".equals(square[i + 2][j]))) {
                                System.out.println('C');
                            } else if (("B".equals(square[i + 1][j]) && "C".equals(square[i + 2][j]))
                                    || ("C".equals(square[i + 1][j]) && "B".equals(square[i + 2][j]))) {
                                System.err.println('A');
                            } else {
                                System.out.println('B');
                            }
                        } else if (i == 2) {
                            if (("A".equals(square[i - 1][j]) && "B".equals(square[i - 2][j]))
                                    || ("B".equals(square[i - 1][j]) && "A".equals(square[i - 2][j]))) {
                                System.out.println('C');
                            } else if (("B".equals(square[i - 1][j]) && "C".equals(square[i - 2][j]))
                                    || ("C".equals(square[i - 1][j]) && "B".equals(square[i - 2][j]))) {
                                System.err.println('A');
                            } else {
                                System.out.println('B');
                            }
                        } else {
                            if (("A".equals(square[i - 1][j]) && "B".equals(square[i + 1][j]))
                                    || "B".equals(square[i - 1][j]) && "A".equals(square[i + 1][j])) {
                                System.out.println('C');
                            } else if (("B".equals(square[i - 1][j]) && "C".equals(square[i + 1][j]))
                                    || "C".equals(square[i - 1][j]) && "B".equals(square[i + 1][j])) {
                                System.err.println('A');
                            } else {
                                System.out.println('B');
                            }
                        }
                    }
                }
            }
        }
    }
}
