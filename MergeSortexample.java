public class MergeSortexample {
    public static void mergeSort(int[] arr,int left,int right){
        if(left>=right) return;//base condition

        int mid=left+(right-left)/2;//binary search middle formula
        mergeSort(arr, left, mid);//keep dividing left half
        mergeSort(arr, mid+1, right);//keep dividing right half
        merge(arr, left, mid, right);//merging two sorted array
    }
    public static void merge(int[] arr,int left,int mid,int right){
        int l1=mid-left+1;//left half array length 
        int l2=right-mid;//right half array length
        int[] leftArray=new int[l1];//copy left half array
        int[] rightArray=new int[l2];//copy right half array
        for(int i=0;i<l1;i++){
            leftArray[i]=arr[left+i];
        }
        for(int i=0;i<l2;i++){
            rightArray[i]=arr[mid+1+i];
        }
        //merging two sorted array
        int i=0,j=0;
        int k=left;
        while(i<l1 && j<l2){
            if(leftArray[i]<rightArray[j]){
                arr[k]=leftArray[i];
                i++;
                k++;
            }
            else{
                arr[k]=rightArray[j];
                j++;
                k++;
            }
        }
        while (i<l1) {//it works when leftArray have remaining elements
            arr[k]=leftArray[i];
            i++;
            k++;
        }
        while(j<l2){//it works when Rightarray have remaining elements
            arr[k]=rightArray[j];
            j++;
            k++;
        }
    }
    public static void main(String[] args) {
        int[] arr={8,1,5,3,7,2,6};
        mergeSort(arr, 0, arr.length-1);
        for(int i:arr){
            System.out.print(i+" ");
        }

    }
}
    


