package trees;

public class Tree {

    private TreeNode prev;
    public static void main(String[] args) {
        Tree t = new Tree();
        TreeNode n =t.makeTree();

//        System.out.println("InOrder traversal");
//        t.inOrderTraversal(n);
//
//        System.out.println("PreOrder traversal");
//        t.preOrderTraversal(n);
//
//        System.out.println("PostOrder traversal");
//        t.postOrderTraversal(n);
//        System.out.println("is BST");
//        System.out.println(t.isBST(n));

//        least common ancestor
        System.out.println(t.LCA(n,new TreeNode(7),new TreeNode(9)).val);

    }

    /*Lowest common ancestor*/
    private TreeNode LCA(TreeNode root, TreeNode p, TreeNode q){
        if(root.val==p.val || root.val==q.val){
            return root;
        }
        if(root.left==null && root.right==null){
            return null;
        }
        TreeNode left = null,right=null;
        if(root.left!=null)
        {
            left=LCA(root.left,p,q);
        }
        if(root.right!=null) {
            right = LCA(root.right, p, q);
        }
        if(left!=null && right!=null){
            return root;
        }
        return left==null?right:left;
    }


    public void inOrderTraversal(TreeNode n) {
        if (n == null) {
            return;
        }
        inOrderTraversal(n.left);
        System.out.println(n.val);
        inOrderTraversal(n.right);
    }

    public void postOrderTraversal(TreeNode n) {
        if (n == null) {
            return;
        }
        postOrderTraversal(n.left);
        postOrderTraversal(n.right);
        System.out.println(n.val);
    }

    private void preOrderTraversal(TreeNode n) {
        if (n == null) {
            return;
        }
        System.out.println(n.val);
        preOrderTraversal(n.left);
        preOrderTraversal(n.right);
    }

    public boolean isBST(TreeNode root){
        if(root!=null){
                if(!isBST(root.left)){
                    return  false;
                }
                if(prev!=null && root.val<=prev.val){
                    return false;
                }
                prev=root;
                return isBST(root.right);
        }
        return true;
    }
    public TreeNode makeTree() {
        TreeNode n = new TreeNode(5);
        n.left = new TreeNode(3);
        n.right = new TreeNode(7);
        n.left.left = new TreeNode(2);
        n.left.right = new TreeNode(4);
        n.right.left = new TreeNode(6);
        n.right.right = new TreeNode(9
        );
        return n;
    }

    public TreeNode makeTreeAnotherTree() {
        TreeNode n = new TreeNode(9);
        n.left = new TreeNode(6);
        n.right = new TreeNode(12);
        n.left.left = new TreeNode(3);
        n.left.right = new TreeNode(8);
        n.right.left = new TreeNode(10);
        n.right.right = new TreeNode(15);
        return n;
    }
}

