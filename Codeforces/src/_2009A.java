import java.util.Scanner;

public class _2009A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            int a=in.nextInt();
            int b=in.nextInt();
            int min=Integer.MAX_VALUE;
            int []arr=new int[(b-a)+1];
            for(int i=0;i<arr.length;i++){
                arr[i]=a+i;
            }
            for(int i=0;i<arr.length;i++){
                int solution=(arr[i]-a)+(b-arr[i]);
                if(solution<min){
                    min=solution;
                }
            }
            System.out.println(min);
        }    
    
    }
}
