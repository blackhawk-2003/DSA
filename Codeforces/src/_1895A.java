import java.util.Scanner;

public class _1895A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t= in.nextInt();
        while(t-->0){
            int chest=in.nextInt();
            int key=in.nextInt();
            int time=in.nextInt();
            if(key-chest<=time && key>chest){
                System.out.println(key);
            }
            else if(key-chest!=time && key>chest){
                System.out.println(key+((key-chest)-time));
            }
            else if(time==0){
                if(chest>=key){
                    System.out.println(chest);
                }
                else{
                    System.out.println(key+chest);
                }
            }
            else if(key<=chest){
                System.out.println(chest);
            }
    }
}
}
