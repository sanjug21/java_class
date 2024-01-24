package LeetCode;

public class nQueen {
    public static void queen(boolean[]board,int q,int qPlaced,String ans,int idx){
        if(q==qPlaced){
            System.out.println(ans);
            return;
        }
        for(int i=idx;i<board.length;i++){
            if(board[i]==false){
                board[i]=true;
                queen(board,q,qPlaced+1,ans+"b"+i+"Q"+qPlaced,i+1);
                board[i]=false;
            }
        }
    }
    public static void main(String[] args) {
        int n=4;
        int q=2;
        boolean board[]=new boolean[n];
        queen(board, q, 0, "",0);

    }

}
