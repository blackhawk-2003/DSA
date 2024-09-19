import java.util.Scanner;

public class _1950B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int n=in.nextInt();
            int [][]checkerBoard=new int[2*n][2*n];
            for(int i=0;i<2*n;i++){
                for(int j=0;j<2*n;j++){
                    if((i/2+j/2)%2==0){
                        System.out.print("#");
                    }
                    else{
                        System.out.print(".");
                    }
                }
                System.out.println();
            }
        }
    }
}
