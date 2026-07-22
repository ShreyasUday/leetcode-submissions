class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int i = 0;
        int j = 0;
        String str = "";
        String res = "";
        HashMap<Character,Integer> map = new HashMap<>();
        while(j < n){
            if(map.containsKey(s.charAt(j))){
                i = Math.max(i,map.get(s.charAt(j))+1);
            }
            map.put(s.charAt(j),j);
            str = s.substring(i,j+1);
            res = str.length() >= res.length() ? str : res;
            j++;
        }
        return res.length();
    }
}