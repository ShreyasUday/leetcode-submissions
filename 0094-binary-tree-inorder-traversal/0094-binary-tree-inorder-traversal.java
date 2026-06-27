/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Pair{
    TreeNode node;
    int state;
    Pair(TreeNode node, int state){
        this.node = node;
        this.state = state;
    }
}
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root == null) return new ArrayList<>();
        Stack<Pair> stack = new Stack<>();
        stack.push(new Pair(root,1));
        List<Integer> res = new ArrayList<>();
        while(!stack.isEmpty()){
            Pair temp = stack.pop();
            if(temp.state == 1){
                temp.state++;
                stack.push(temp);
                if(temp.node.left != null){
                    stack.push(new Pair(temp.node.left,1));
                }
            }
            else if(temp.state == 2){
                temp.state++;
                stack.push(temp);
                res.add(temp.node.val);
                if(temp.node.right != null){
                    stack.push(new Pair(temp.node.right,1));
                }
            }
        }
        return res;
    }
}