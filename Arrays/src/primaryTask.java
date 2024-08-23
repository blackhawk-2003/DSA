import java.util.Scanner;
public class primaryTask {
    public static void main(String[] args) {
       Scanner in= new Scanner(System.in);
       int t=in.nextInt();
       while(t-->0){
        String str=in.next();
        if("10".equals(str.substring(0,2))&&str.length()>=3&&str.charAt(2)-'0'!=0 &&Integer.valueOf(str.substring(2))>=2){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        }
        
    }
}

