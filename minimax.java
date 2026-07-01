int minSum=0;
    int maxSum=0;
    Collections.sort(arr);
    for(int i=1;i<arr.size();i++){
        minSum+=arr.get(i);
    }
    for(int i=0;i<arr.size();i++)
{
    minSum+=arr.get(i);
}
    }
    System.out.println();

}