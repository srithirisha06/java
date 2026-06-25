import java.util.Scanner;
class reverse{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=in.nextInt();
        }
        for(int i=0;i<=n/2;i++){
            int temp=nums[i];
            nums[i]=nums[n-1-i];
        nums[n-1-i]=temp;      
      }
      for(int num:nums){
        
      }
    }
}