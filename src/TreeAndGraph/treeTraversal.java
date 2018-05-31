package TreeAndGraph;

public class treeTraversal {
    void inOrderTraversal(TreeNode node){
        if(node!=null){
            inOrderTraversal(node.left);
            visit(node);
            inOrderTraversal(node.right);
        }
    }


    void preorderTraversal(TreeNode node){
        if(node!=null){
            visit(node);
            inOrderTraversal(node.left);
            inOrderTraversal(node.right);
        }
    }

    void postorderTraversal(TreeNode node){
        if(node!=null){
            inOrderTraversal(node.left);
            inOrderTraversal(node.right);
            visit(node);
        }
    }
}
