class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int n = people.length;
        int res = 0;
        int l = 0;
        int h = n-1;

        Arrays.sort(people);

        while(l<=h){
            if(people[l] + people[h] <= limit){
                l++;
                h--;
                res++;
            }
            else{
                res++;
                h--;
            }
        }

        return res;
    }
}