import java.util.Scanner;
public class primaryTask {
    public static void main(String[] args) {
       Scanner in= new Scanner(System.in);
       int t=in.nextInt();
       while(t-->0){
        int n=in.nextInt();
        String str = Integer.toString(n);
        String str2=str.substring(0, 2);
        String str3=str.substring(2, 3);
        if("10".equals(str2)){
            if(Integer.parseInt(str3)==0){
                System.out.println("NO");
            }
            else{
                if(Integer.parseInt(str.substring(2, str.length()))>=2){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
        }
    }
        else{
            System.out.println("NO");
        }
        }
        
    }
}


