class KthLargest {
    int kth;
    PriorityQueue<Integer> q;
    public KthLargest(int k, int[] nums) {
        this.kth = k;
        q = new PriorityQueue<>();
        for(int num : nums){
            add(num);
        }
    }
    
    public int add(int val) {
        q.offer(val);
        if(q.size() > kth){
            q.poll();
        }
        return q.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */