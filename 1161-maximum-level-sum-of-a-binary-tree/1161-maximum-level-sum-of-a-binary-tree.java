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
class Solution {
    public int maxLevelSum(TreeNode root) {
         Queue <TreeNode> q=new LinkedList<>();
        List <Integer> arr=new ArrayList <>();

        q.add(root);
        if(root==null) return 1;
        while(!q.isEmpty()){
                     TreeNode curr;
int size=q.size();
        int sum=0;

          while(size>0){ 
curr=q.remove();
   sum+=curr.val;
        if(curr.left!=null){
            q.add(curr.left);
        }
        if(curr.right!=null){
            q.add(curr.right);
        }
      
        size--;
          }
          arr.add(sum);
        }
int max = Integer.MIN_VALUE;
int index = 0;

for (int i = 0; i < arr.size(); i++) {
    if (arr.get(i) > max) {
        max = arr.get(i);
        index = i;
    }
}

return index + 1;    }
}