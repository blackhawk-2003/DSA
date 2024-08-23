import java.util.Scanner;

public class CreatingWords {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            String str1=in.next();
            String str2 =in.next();
            char [] arr1 =str1.toCharArray();
            char[] arr2=str2.toCharArray();
            char temp;
            temp = arr1[0];
            arr1[0] = arr2[0];
            arr2[0] = temp;
            str1=new String(arr1);
            str2=new String(arr2);
            System.out.print(str1+" ");
            System.out.println(str2);
        }
    }
}
