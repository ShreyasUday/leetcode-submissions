class Solution {
    public boolean findSafeWalk(List<List<Integer>> grid, int health) {
        int n = grid.size();
        int m = grid.get(0).size();
        int[][] directions = {{0,1},{1,0},{0,-1},{-1,0}};    

        int[][] best = new int[n][m];
        for(int[] row : best){
            Arrays.fill(row,-1);
        }

        int startH = health - grid.get(0).get(0);
        if(startH < 1) return false;

        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{0,0,startH});
        
        best[0][0] = startH;

        while(!q.isEmpty()){
            int[] temp = q.poll();
            int x = temp[0];
            int y = temp[1];
            int h = temp[2];

            if(x == n-1 && y == m-1) return true;

            for(int[] direction : directions){
                int nx = x + direction[0];
                int ny = y + direction[1];

                if(nx >= 0 && ny >= 0 && nx < n && ny < m){
                    int newH = h - grid.get(nx).get(ny);
                    if(newH > 0 && newH > best[nx][ny]){
                        best[nx][ny] = newH;
                        q.offer(new int[]{nx,ny,newH});
                    }
                }
            }
        }
        return false;
    }
}