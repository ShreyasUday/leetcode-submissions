class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character, Integer> h1 = new HashMap<>();
        HashMap<Character, Integer> h2 = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if (h1.containsKey(c1)) {
                h1.put(c1, h1.get(c1) + 1);
            } else {

                h1.put(c1, 1);
            }
            if (h2.containsKey(c2)) {
                h2.put(c2, h2.get(c2) + 1);
            } else {
                h2.put(c2, 1);

            }

        }

        // for (int i = 0; i < s.length(); i++) {
        //     if (h1.containsKey(s.charAt(i))) {
        //         if (h2.containsKey(s.charAt(i))) {
        //             if (h1.get(s.charAt(i)).intValue() != h2.get(s.charAt(i)).intValue()) {
        //                 return false;
        //             }
        //         } else {
        //             return false;
        //         }
        //     } else {
        //         return false;
        //     }
        // }
        if(h1.equals(h2)){
            return true;
        }
        return false;
    }
}