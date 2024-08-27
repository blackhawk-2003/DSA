import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TurtleAndGoodStrings {
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            int n = in.nextInt();
            String s = in.next();
            char[]str1 = s.toCharArray();
            if(str1[0]==str1[n-1]){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
        }
     }
}