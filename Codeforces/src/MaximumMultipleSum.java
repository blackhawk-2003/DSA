import java.util.Scanner;

public class MaximumMultipleSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            int n = in.nextInt();
            int maxSum=0;
            int maxNum=0;
            for(int j=2;j<=n;j++){
                int sum=0;
                for(int i=1;i<=n;i++){
                    if(i*j>n){
                        break;
                    }
                    sum=sum+(i*j);
                }
                if(maxSum<sum){
                    maxSum=sum;
                    maxNum=j;
                }
                System.out.println(maxSum);
            }
            System.out.println(maxNum);
        }
    }
}
