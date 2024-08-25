import java.util.Scanner;

public class Marathon {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t =in.nextInt();
        while(t-->0) {
            int count =0;
            int [] arr = new int[4];
            for(int i=0;i<4;i++) {
                arr[i]=in.nextInt();
            }
            for(int i=0;i<3;i++){
                if(arr[0]<arr[i+1]){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
