class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    public TreeNode(int data){
        this.val=data;
        this.left=null;
        this.right=null;
    }

}
class Tree{
    public static void preOrder(TreeNode root){
        if(root==null) return;
        System.out.println(root.val);
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void main(String[] args) {
        TreeNode root=new TreeNode(10);
        root.left=new TreeNode(20);
        root.right=new TreeNode(30);
        root.left.left=new TreeNode(50);
        System.out.println("Tree:");
        preOrder(root);
    }
}