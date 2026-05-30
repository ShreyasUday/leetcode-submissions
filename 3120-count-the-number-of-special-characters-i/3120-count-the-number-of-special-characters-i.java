class Solution {
    public int numberOfSpecialChars(String word) {
        int n = word.length();
        Set<Character> s1 = new HashSet<>();
        Set<Character> s2 = new HashSet<>();

        for(char c : word.toCharArray()){
            if(Character.isLowerCase(c)) s1.add(c);
            else s2.add(Character.toLowerCase(c));
        }

        int res = 0;

        for(char i : s1){
            if(s2.contains(i)) res++;
        }
        return res;
    }
}