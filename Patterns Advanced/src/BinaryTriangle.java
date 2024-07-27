import java.util.Scanner;

public class BinaryTriangle {

    public static void printPattern(int r){

        //outer loop
        for(int i=1;i<=r;i++){
            //inner loop
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print(1+" ");
                }
                else{
                    System.out.print(0+" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter the number of rows");
        Scanner in = new Scanner(System.in);
        int r = in.nextInt();
        printPattern(r);
    }
}
