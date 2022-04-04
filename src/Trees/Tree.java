package Trees;

//This class is for the tree itself
public class Tree {

    //All we need is the root node. We can use this to get to every node
    //in the tree
    private TreeNode root;

    //This method is actually the one the caller has to call
    //to insert a value in the tree
    public void insert(int value){
        //check if the tree is empty
        if (root == null){
            //insert here i.e at root
            root = new TreeNode(value);
        }else{
            //callt me Tree node inserthod on the root
            root.insert(value);
        }
    }

    public TreeNode get(int value){
        if(root != null){
            return root.get(value);
        }
        return null;
    }

    //call it on the root to start it
    public int min(){
        if (root != null){
            return root.min();
        }else{
            //return the smallest possible number that can be stored in an int
            return Integer.MIN_VALUE;
        }
    }

    public int max(){
        if (root != null){
            return root.max();
        }else{
            return Integer.MAX_VALUE;
        }
    }

    public void traverseInorder(){
        if (root != null){
            root.traverseInorder();
        }
    }
}
