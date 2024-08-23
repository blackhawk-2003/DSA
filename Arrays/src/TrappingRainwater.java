import java.util.*;
public class TrappingRainwater {

    public static int totalTrapped(int[] height){
        int totalTrappedWater=0;
        int[] maxRightBar=new int[height.length];
        int[] maxLeftBar=new int[height.length];
        maxRightBar[height.length-1]=height[height.length-1];
        maxLeftBar[0]=height[0];
        //Calculate the maxRightBar arrar

        for(int i=height.length-2;i>=0;i--){
            maxRightBar[i]=Math.max(height[i], maxRightBar[i+1]);
        }

        //Calculate the maxLeftBar array
        for(int i=1;i<height.length;i++){
            maxLeftBar[i]=Math.max(height[i], maxLeftBar[i-1]);
        }

        //Calculate the total trapped water by comparing both the auxillary arrays
        for(int i=0;i<height.length;i++){
            int minBar=Math.min(maxRightBar[i],maxLeftBar[i]);
            if(minBar>height[i]){
                totalTrappedWater+=minBar-height[i];
        }


    }
    return totalTrappedWater;
    
}
        public static void main(String[] args) {

        Scanner in= new Scanner(System.in);
        System.out.println("Enter the number of bars");
        int n = in.nextInt();
        int height[]= new int[n];
        System.out.println("Enter the height of each bar");
        for(int i=0;i<n;i++){
            height[i]=in.nextInt();
        }
        System.out.println("Total trapped water is "+totalTrapped(height));
    }
}
