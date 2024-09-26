import java.util.Scanner;

public class _1915A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t= in.nextInt();
        while (t-->0) {
            int a=in.nextInt();
            int b=in.nextInt();
            int c=in.nextInt();
            if(a==b){
                System.out.println(c);
            }
            else if(a==c){
                System.out.println(b);
            }
            else{
                System.out.println(a);
            }   
        }   
    }
}
