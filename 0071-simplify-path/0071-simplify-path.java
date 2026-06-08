class Solution {
    public String simplifyPath(String path) {
        String[] parr = path.split("/");
        Stack<String> stack = new Stack<>();
        for(String s : parr){
            if(s.equals("") || s.equals(".")){
                continue;
            }
            else if(s.equals("..")){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }
            else{
                stack.push(s);
            }
        }

        StringBuilder res = new StringBuilder();

        for(String s : stack){
            res.append("/").append(s);
        }

        return res.length() == 0 ? "/" : res.toString();
    }
}