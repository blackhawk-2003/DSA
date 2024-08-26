import java.util.Scanner;

public class _1692C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            char[][] board = new char[8][8];
            for(int i = 0; i < 8; i++){
                String str=in.next();
                for(int j=0;j<8;j++){
                    board[i][j] = str.charAt(j);
                }
            }
            int row=0;
            int col=0;
            for(int i=0;i<8;i++){
                
                int count=0;
                for(int j=0;j<8;j++){
                    if(i==0||i==7||board[i][0]=='#'||board[i][7]=='#'){
                        break;
                    }
                    else{
                        if(board[i][j]=='#'){
                            count++;
                            col=j;
                        }
                    }
                }
                if(count==1){
                    row=i;
                    break;
                 } 
            }
            System.out.println((row+1)+" "+(col+1));
    }
}
}

