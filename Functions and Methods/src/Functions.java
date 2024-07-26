import java.util.Scanner;

public class Functions {
    public static int factorial(int n) {
        int f = 1;
        if (n == 0) {
            return 1;
        } else {
            for (int i = 1; i <= n; i++) {
                f = f * i;
            }
            return f;
        }
    }

    public static int binomial(int n, int r) {
        int binomial;
        if (n == 0) {
            return 1;
        } else {
            binomial=factorial(n)/(factorial(r)*factorial(n-r));
        }
        return binomial;
    }

    public static void checkPrime(int n){
        for(int i=2;i<=n;i++){
            boolean isPrime=true;
            for(int j=2;j<=Math.sqrt(i);j++){
                if(i%j==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime){
                System.err.println(i);
        }
    }

   }

   public static int convertBinary(int n){
    int decimal=0;
    int base=2;
    int i=0;
    while(n>0){
        int lastDigit=n%10;
        if(lastDigit==1){
            decimal+=1*(Math.pow(base,i));
        }
        else{
            decimal+=0*(Math.pow(base,i));
        }
        n/=10;
        i++;
    }
    return decimal;
   }

    public static void main(String[] args) throws Exception {

        Scanner in = new Scanner(System.in);
        // factorial using functions

        // System.err.println("Enter the value that you want to calculate the factorial
        // for");
        // int n = in.nextInt();
        // int fact=factorial(n);
        // System.out.println("The factorial of "+n+" is "+fact);

        // To calculate the binomial coeffcient
        // System.err.println("Enter the value of n and r");
        // int n = in.nextInt();
        // int r = in.nextInt();
        // int binomial = binomial(n, r);
        // System.out.println("The binomial coeffcient of " + n + " and " + r + " is " + binomial);

        //Print all prime number in a range.
    //     int n = in.nextInt();
    //     int count=0;
    //     for(int i=2;i<=n;i++){
    //         boolean isPrime=true;
    //         for(int j=2;j<=Math.sqrt(i);j++){
    //             if(i%j==0){
    //                 isPrime=false;
    //                 break;
    //             }
    //         }
    //         if(isPrime){
    //             count++;
    //     }
    // }

    // int ans =factorial(count)*factorial(n-count);
    // System.err.println(ans);

    //Convert binary to decimal number

    System.out.println("Enter the binary number that you want to conver");
    int n=in.nextInt();

    int decimal=convertBinary(n);
    System.out.println(decimal);

    
       
    }
}