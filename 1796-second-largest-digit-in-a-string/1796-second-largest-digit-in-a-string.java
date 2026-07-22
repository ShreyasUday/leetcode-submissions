class Solution {
    public int secondHighest(String s) {
        int n = s.length();
        int largest = -1;
        int secondLargest = -1;

        for (int i = 0; i < n; i++) {
            if(!Character.isDigit(s.charAt(i))) continue;
            char c = s.charAt(i);
            int temp = c - '0';
            if (temp > largest) {
                secondLargest = largest;
                largest = temp;
            } else if (temp < largest && temp > secondLargest) {
                secondLargest = temp;
            }
        }
        return secondLargest;
    }
}