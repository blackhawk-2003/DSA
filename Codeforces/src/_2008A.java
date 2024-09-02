import java.util.Scanner;

public class _2008A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Number of test cases

        for (int i = 0; i < t; i++) {
            int a = scanner.nextInt(); // Number of ones
            int b = scanner.nextInt(); // Number of twos
            if(a==0){
                if(b%2==0){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
                
            }
            else if(b==0){
                if(a%2==0){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
            // Check if the number of ones is even
            else if (a % 2 == 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }

        scanner.close();
    }
}
