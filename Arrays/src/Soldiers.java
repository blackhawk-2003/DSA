import java.util.Scanner;

public class Soldiers {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int bananaCost=in.nextInt();
        int dollars=in.nextInt();
        int numberOfBanana=in.nextInt();
        int borrowedMoney=0;
        int count=1;
        int i=1;
        while(count<=numberOfBanana){
            if(dollars>=bananaCost*i){
                dollars=dollars-bananaCost*i;
                count++;
                i++;
            }else{
                borrowedMoney=borrowedMoney+(i*bananaCost-dollars);
                dollars=dollars+(i*bananaCost-dollars);
            }
            
        
        }
        System.out.println(borrowedMoney);
    }
}
