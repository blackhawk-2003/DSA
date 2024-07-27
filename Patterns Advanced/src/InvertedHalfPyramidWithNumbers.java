import java.util.Scanner;

public class InvertedHalfPyramidWithNumbers {

    public static void printPattern(int r){
        for(int i=0;i<r;i++){
            for(int j=1;j<=r-i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int r= in.nextInt();
        printPattern(r);
    }
}
