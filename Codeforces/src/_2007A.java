import java.util.*;

public class _2007A {

   public static int solve(int l,int r){
        if(l%2==0){
            l++;
        }
        return (r-l+2)/4;

   }

    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int t=in.nextInt();
        while (t-->0) {
            int l=in.nextInt();
            int r=in.nextInt();
            System.out.println(solve(l,r));
        }
        
        
    }
}