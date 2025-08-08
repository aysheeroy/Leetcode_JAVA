class Solution {
    public List<List<Integer>> permute(int[] nums) {
    List<List<Integer>>l=new ArrayList<>();
    List<Integer>l1=new ArrayList<>();
    Boolean b[]=new Boolean[nums.length];
    for(int i=0;i<nums.length;i++)
    b[i]=false;
    perm(nums, b, l1, l);
    return l;
    }
    void perm(int []arr, Boolean[] b, List<Integer>l1,List<List<Integer>>l){
    if(l1.size()==arr.length){
        l.add(new ArrayList<>(l1));
    return;
    }
    for(int id=0;id<arr.length;id++){
      if(b[id]==false)
      {
        b[id]=true;
        l1.add(arr[id]);
        perm(arr, b, l1, l);
        b[id]=false;
        l1.remove(l1.size()-1);
      }
    }
    }
}