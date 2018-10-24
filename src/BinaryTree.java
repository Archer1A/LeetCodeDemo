public class BinaryTree {

    //先序遍历
    public  static void preOrder(BinaryTreeNode root){
        if (root != null){
            System.out.print(root.getData());
            preOrder(root.getLeft());
            preOrder(root.getRight());
        }
    }

    //中序遍历
    public static  void postOrder(BinaryTreeNode root){
        if (root != null){
            postOrder(root.getLeft());
            postOrder(root.getRight());
            System.out.print(root.getData() + "\t");
        }
    }

    public static BinaryTreeNode treeSearch(BinaryTreeNode root,int x){
        if (root == null || x == root.getData()){
            return  root;
        }if
    }

    //后序遍历
    public static  void PrintBinaryTreeMidRecur(BinaryTreeNode root){
        if (root != null){
            PrintBinaryTreeMidRecur(root.getLeft());
            System.out.print(root.getData() + "\t");
            PrintBinaryTreeMidRecur(root.getRight());
        }
    }


    public static void main(String[] args) {
        BinaryTreeNode node10=new BinaryTreeNode(10,null,null);
        BinaryTreeNode node8=new BinaryTreeNode(8,null,null);
        BinaryTreeNode node9=new BinaryTreeNode(9,null,node10);
        BinaryTreeNode node4=new BinaryTreeNode(4,null,null);
        BinaryTreeNode node5=new BinaryTreeNode(5,node8,node9);
        BinaryTreeNode node6=new BinaryTreeNode(6,null,null);
        BinaryTreeNode node7=new BinaryTreeNode(7,null,null);
        BinaryTreeNode node2=new BinaryTreeNode(2,node4,node5);
        BinaryTreeNode node3=new BinaryTreeNode(3,node6,node7);
        BinaryTreeNode node1=new BinaryTreeNode(1,node2,node3);
        preOrder(node1);
        System.out.println("\n");
        PrintBinaryTreeMidRecur(node1);
        System.out.println("\n");
        postOrder(node1);
    }
}
