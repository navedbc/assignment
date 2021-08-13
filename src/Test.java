

class Node{
    int data;
    Node left;
    Node right;
}

class BST{

    public Node insert(Node node, int value){
        if(node==null){
            return createNewNode(value);
        }
        if(value<node.data){
            insert(node.left,value);
        }

        return node;
    }

    private Node createNewNode(int value) {
        Node firstNode=new Node();
        firstNode.left=null;
        firstNode.right=null;
        return firstNode;
    }

}

public class Test {


    public static void main(String[] args) {

    BST a=new BST();
    Node root=null;

    root=a.insert(root,8);
    root=a.insert(root,3);



    }
}
