import java.util.Scanner;

public class _2014A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            int k = in.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
            }
            int gold = 0;
            int count = 0;
            for (int i = 0; i <n; i++) {
                if(arr[i]==0){
                    if(gold!=0){
                        gold--;
                        count++;
                    }

                }
                else{
                    if(arr[i]>=k){
                        gold+=arr[i];
                    }
                }
            }
            System.out.println(count);
        }

    }
}
