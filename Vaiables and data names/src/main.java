import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        //If a number is prime or not
        /*System.out.println("Enter the value of n for which you want to check the prime number");
        int n=in.nextInt();
        int div=2;
        int flag=0;
        for(int i=div;i<n;i++){
            if(n%i==0){
                flag=1;
                break;
            }
        }
        if(flag==1){
            System.out.println("The number is nor a prime number");
        }
        else{
            System.out.println("The number is a prime number");
        }*/


        //To find the sum of first n natural number
        // System.out.println("Enter the value of n");
        // int n = in.nextInt();
        // int sum=0;
        // for(int i=0;i<=n;i++){
        //     sum=sum+i;
        // }
        // System.out.println(sum);

        //Type promotion in java
        
        //Printing a square pattern

        // for(int i=0;i<5;i++){

        //     for(int j=0;j<5;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println("");
        // }

        //Print reverse of number

    //     int rev=0;
    //     int n = in.nextInt();
    //     while(n>0){
    //         int rem = n%10;
    //         rev = rev*10+rem;
    //         n=n/10;
    //     }
    //     System.out.println(rev);
    // }

    //Keep entering number till the user enters a multiple of 10

//     while(true){
//         int n = in.nextInt();
//         if(n%10==0){
//             break;
//         }

//     }
//     System.out.println("You've entered a multiple of 10");
// }

//Check if the number is prime or not

System.err.println("Enter the number that you want to check for prime");

int n=in.nextInt();
        int div=2;
        int flag=0;
        for(int i=div;i<n;i++){
            if(n%i==0){
                flag=1;
                break;
            }
        }
        if(flag==1){
            System.out.println("The number is nor a prime number");
        }
        else{
            System.out.println("The number is a prime number");
        }
    }
}