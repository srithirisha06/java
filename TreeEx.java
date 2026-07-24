
//level order
import java.util.*;
import java.util.LinkedList;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}


public class TreeEx {
    public static void preOrderTraversal(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    public static void inOrderTraversal(Node root){
        if(root == null){
            return;
        }
        inOrderTraversal(root.left);
        System.out.print(root.data+" ");
        inOrderTraversal(root.right);
    }

    public static void postOrderTraversal(Node root){
        if(root == null){
            return;
        }
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.data+" ");
    }
  public static void levelOrderTravesal(Node root){
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            Node current = queue.poll();
            System.out.print(current.data+" ");
            if(current.left != null) queue.offer(current.left);
            if(current.right != null) queue.offer(current.right);

        }
    }
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        System.out.println("preOrderTraversal");
        preOrderTraversal(root);
        System.out.println();
        System.out.println("inOrderTraversal");
        inOrderTraversal(root);
        System.out.println();
        System.out.println("postOrderTraversal");
        postOrderTraversal(root);
        System.out.println();
        System.out.println("levelOrderTravesal");
        levelOrderTravesal(root);
    }
}