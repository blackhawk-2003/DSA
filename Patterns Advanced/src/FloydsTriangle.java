import java.util.Scanner;

public class FloydsTriangle {

    public static void printPattern(int r){
        int sum=0;
        //outer loop
        for(int i=1;i<=r;i++){
            //inner loop
            for(int j=1;j<=i;j++){
                System.out.print(sum+j +" ");
            }
            System.out.println();
            sum=sum+i;
        }
        
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int r = in.nextInt();
        printPattern(r);
    }

}
