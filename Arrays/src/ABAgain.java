import java.util.Scanner;

public class ABAgain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            int n = in.nextInt();
            int sum=0;
            while(n>0){
               sum=sum+(n%10);
               n=n/10; 
            }
            System.out.println(sum);
        }
    }
}
