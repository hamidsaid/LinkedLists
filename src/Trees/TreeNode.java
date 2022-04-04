package Trees;

//This is the class for the nodes that go inside the tree
public class TreeNode {

    private int data;
    private TreeNode leftChild;
    private TreeNode rightChild;

    public TreeNode(){}
    //override default constructor
    public TreeNode(int data){
        this.data = data;
    }

    //called it on a certain node
    public void insert(int value){
        //check if the value is equal to the data hold
        //in the node as no duplicates are allowed
        if (value == data){
            return;
        }

        if (value < data){
            if (leftChild == null){
                //then insert data here
                TreeNode treeNode = new TreeNode(value);
                leftChild = treeNode;
            }else{
                //the node has a left child thus no insertion
                //point found thus call insert method on this node
                leftChild.insert(value);
            }
        }

        if (value > data){
            if(rightChild == null){
                rightChild = new TreeNode(value);
            }else{
                //look at the right child
                rightChild.insert(value);
            }
        }
    }

    public TreeNode get(int value){
        //compare the value we are searching for with the data at the root node
        if (value == data){
            //we found it, return the current node
            return this;
        }
        if (value < data ){
            if(leftChild != null){
                //call the get method on the left sub tree recursively
                //and pass in the same value to continue searching for it
                return leftChild.get(value);
            }
        }else{
            if (rightChild != null){
                return rightChild.get(value);
            }
        }

        //we didn't find the value if it reaches here
        return null;
    }

    //we can also return a node but we'll have to call the get method on it
    public int min(){
        if (leftChild == null){
            //then we have found the most left node
            return data;
        } else{
            //continue travelling down the left side
            return leftChild.min();
        }
    }

    public int max(){
        if (rightChild == null){
            return data;
        }else{
            return rightChild.max();
        }
    }

    public void traverseInorder(){
        if (leftChild != null){
            //it has children so traverse the left subtree
            leftChild.traverseInorder();
        }
        //if left child is null then print the data in the root
        System.out.print(data + ",");

        if (rightChild != null){
            rightChild.traverseInorder();
        }
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "data=" + data +
                ", leftChild=" + leftChild +
                ", rightChild=" + rightChild +
                '}';
    }
}
