class Solution {
    public List<List<Integer>> combine(int n, int k) {
     List<List<Integer>>l=new ArrayList<>();
     List<Integer>l1=new ArrayList<>();
     int arr[]=new int[n];
     for(int i=0;i<n;i++)
     arr[i]=i+1;
        com(0,k,arr,l1,l);
    return l;
    }

    void com(int i,int k, int []arr,List<Integer>l1,List<List<Integer>>l){
        if(i>=arr.length || l1.size()>=k){
            if(l1.size()==k)
            l.add(new ArrayList<>(l1));
            return;
        }
        l1.add(arr[i]);
        com(i+1,k,arr,l1,l);
        l1.remove(l1.size()-1);
        com(i+1,k,arr,l1,l);
    }
}