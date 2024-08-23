import java.util.Scanner;

public class Legs {

    public static int calculateLegs(int n){
        int sum=0;
        int legsRemaining=n%4;
        sum=sum+(n/4)+(legsRemaining/2);
        return sum;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t= in.nextInt();
        while(t-->0) {
            int n = in.nextInt();
            System.out.println(calculateLegs(n));
        }
    }
}
