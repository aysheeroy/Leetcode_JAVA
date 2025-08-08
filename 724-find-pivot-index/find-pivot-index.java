class Solution {
    public int pivotIndex(int[] arr) {
        int mid=arr.length/2;
        int sumleft=0,sumright=0,i=0,j,f=0;
        
      while(i<arr.length){
        if(i!=0)
          sumleft+=arr[i-1];
          sumright=0;
          for(j=arr.length-1;j>i;j--)
          sumright+=arr[j];
          if(sumleft==sumright)
          return i;
          i++;
      }
        return -1;
    }
}