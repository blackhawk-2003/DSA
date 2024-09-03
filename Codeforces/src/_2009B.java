import java.util.Scanner;

public class _2009B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int rows=in.nextInt();
            int cols=4;
            char [][] beatMap= new char[rows][cols];
            for(int i=0;i<rows;i++){
                String str=in.next();
                char character[]=str.toCharArray();
                for(int j=0;j<cols;j++){
                    beatMap[i][j]=character[j];
                }
            }
            for(int i=rows-1;i>=0;i--){
                for(int j=0;j<cols;j++){
                    if(beatMap[i][j]=='#'){
                        System.out.print(j+1+" ");
                    }
                }

            }
        }
    }
}
