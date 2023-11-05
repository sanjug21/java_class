public class test {
  
        public static boolean check(int []arr,int mid,int ncow){
            int lp=arr[0];
            int l=1;
            for(int i=1;i<arr.length;i++){
                if(arr[i]-lp>=mid){
                    lp=arr[i];
                    l++;
                }
            }
            if(l>=ncow) return true;
         return false;
    
        }
        
        public static void main(String[] args) {
            // int n=5;
            // int ncow=3;
            // int []arr={1,2,4,8,9};
            // int st=arr[0];
            // int end=arr[arr.length-1];
            // int ans=0;
            // while(st<end){
            //     int mid=st+end/2;
            //     if(check(arr,mid,ncow)){
            //     st=mid+1;
            //         ans=mid;
            //                             }
            //     else end=mid-1;
               
    
            // }
            // System.out.println(ans);
           
           
    
    
        }
        
    }
    
