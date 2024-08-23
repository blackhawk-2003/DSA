import java.util.Scanner;

public class CatchTheCoin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t= in.nextInt();
        while(t-->0) {
            int arr[] = new int[2];
            for(int i=0;i<2;i++) {
                arr[i] = in.nextInt();
            }
            if((arr[1]<-1)){
                System.out.println("NO");
            }
            else{
                System.out.println("Yes");
            }
        }
    }
}
