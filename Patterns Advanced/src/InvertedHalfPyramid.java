import java.util.Scanner;

public class InvertedHalfPyramid {
    public static void printPattern(int r){
        for(int i=1;i<=r;i++){
            for(int j=1;j<=r;j++){
                if(j>(r-i)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int r= in.nextInt();
        printPattern(r);
    }
}
