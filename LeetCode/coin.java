package LeetCode;

import java.util.Arrays;

public class coin {
    public static int coinChange2(int coins[],int amt){
        int dp[]=new int [amt+1];
        dp[0]=1;
        for(int coin:coins){
            for(int i=coin;i<=amt;i++){
                dp[i]+=dp[i-coin];
            }
        }
           System.out.println(dp[amt]);
           return dp[amt];

        //  //  or
        // int n=coins.length;
        // if(amt==0)System.out.println(1);
        //  Arrays.sort(coins);
        // int ans[]=new int [amt+1];
        // for(int i=1;i<=amt;i++){
        //     if(i-coins[n-1]==0)ans[i]=1;
        //     if(i-coins[n-1]>0){
        //     ans[i]+=ans[i-coins[n-1]];
        // }
        // }
        // for(int c=n-2;c>=0;c--){
        //     int temp[]=new int [amt+1];
        //    for(int a=1;a<=amt;a++){
        //     if(a-coins[c]==0)temp[a]=1;
        //     if(a-coins[c]>0){
        //         temp[a]+=temp[a-coins[c]]+ans[a];
                
        //     }
        //    }
        //    ans=temp;           
        // }
        //  System.out.println(ans[amt]);
        //  return ans[amt];
    }
    public static void main(String[] args) {

        coinChange2(new int []{1,2,5}, 5);
    }
}
