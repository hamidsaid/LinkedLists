package Trees;
//We need two classes to implement a tree
//A class for the tree itself and
//A class for the nodes that goes inside the tree
public class Main {

    public static void main(String [] args){

        Tree tree = new Tree();

        tree.insert(25);
        tree.insert(20);
        tree.insert(15);
        tree.insert(27);
        tree.insert(30);
        tree.insert(29);
        tree.insert(26);
        tree.insert(22);
        tree.insert(32);

       System.out.println(tree.get(27));
//        System.out.println(tree.get(26));
//        System.out.println(tree.get(88));

         tree.traverseInorder();
        //System.out.println(tree.min());
        //System.out.println(tree.max());


    }
}
