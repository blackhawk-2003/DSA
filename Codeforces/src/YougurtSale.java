import java.util.Scanner;

public class YougurtSale {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            int n = in.nextInt();
            int a = in.nextInt();
            int b = in.nextInt();
            if(n%2==0){
                int price1= (n/2)*b;
                int price2=(n)*a;
                System.out.println(Math.min(price1, price2));
            }
            else{
                int price1=(n/2)*b+a;
                int price2=n*a;
                System.out.println(Math.min(price1, price2));
            }
        }
    }
}
