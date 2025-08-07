class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0)
        return "";
        String st="";
        int i, j;
        for(i=0;i<strs[0].length();i++)
        {
            char c=strs[0].charAt(i);
            for(j=1;j<strs.length;j++)
            {
                if(i>=strs[j].length() || c!=strs[j].charAt(i) )
                return st;
            }
            st=st+c;
        }
        return st;
    }
}