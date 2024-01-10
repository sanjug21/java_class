package Algo;

public class Sorting {
    // Insertion Sort
    public static void Insertion(int []nums){
        for(int i=1;i<nums.length;i++){
            int j=i-1;
            int key=nums[i];
            while(j>=0 && key<nums[j]){
                nums[j+1]=nums[j];
                j--;
            }
            nums[j+1]=key;
        }

     // System.out.println(Arrays.toString(nums));
    }
    

    public static void Selection(int nums[]){
        int len=nums.length;
        for(int i=0;i<len;i++){
            int key=i;
            for(int j=i+1;j<len;j++){
                if(nums[j]<nums[key])key=j;
            }
            int temp=nums[key];
            nums[key]=nums[i];
            nums[i]=temp;
        }

     // System.out.println(Arrays.toString(nums));
    }


    public static void Bubble(int []nums){
        int len=nums.length;
        boolean swapped=false;
        for(int i=0;i<len-1;i++){
            for(int j=0;j<len-i-1;j++){
                swapped=false;
                if(nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                    swapped=true;
                }
            }
            if(swapped==false)break;  
        }

     // System.out.println(Arrays.toString(nums));    
    }


    public static void  Quick(int nums){

    }
   
}
