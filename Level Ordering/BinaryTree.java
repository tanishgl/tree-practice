//Save Trees

import java.util.*;

class Node{
  class Node {
    int key;
    Node left, right;
  
    public Node(int key)
    {
        this.key = item;
        left = right = null;
    }
}
 
  
class BinaryTree{
  
  static Node root;
  
  public static void levelOrder(Node node){
    if(node==null) return ;
    
    LinkedList<Node> a = new LinkedList<>();
    LinkedList<Node> b = new LinkedList<>();
    
    a.push(node);
    
    while(!a.isEmpty() || !b.isEmpty()){
      while(!a.isEmpty()){
        Node x = a.poll();
        System.out.print(x.key + " ");
        
        if(x.left!=null) b.push(x.left);
        if(x.right!=null) b.push(x.right);
      }
      
      while(!b.isEmpty()){
        Node x = b.poll();
        System.out.print(x.key + " ");
        
        if(x.left!=null) a.push(x.left);
        if(x.right!=null) a.push(x.right);
      }
    }
    
  }
  
  public static void SpiralLevelOrder(Node node){
    
    if(node==null) return;
    
    Stack<Node> a = new Stack<>();
    Stack<Node> b = new Stack<>();
    
    a.push(node);
    
    while(!a.empty() || !b.empty()){
      while(!a.empty()){
        Node x = a.pop();
        System.out.print(x.key + " ");
        
        if(x.right!=null) b.push(x.right);
        if(x.left!=null) b.push(x.left);
      }
      
      while(!b.empty()){
        Node x = b.pop();
        System.out.print(x.key + " ");
        
        if(x.left!=null) a.push(x.left);
        if(x.right!=null) a.push(x.right);
      }
    }
    
  }
  
  public static void main(String[] args){
    BTlevel tree = new BTlevel();
			tree.root = new Node(1);
			tree.root.left = new Node(2);
			tree.root.right = new Node(3);
			tree.root.left.left = new Node(4);
			tree.root.left.right = new Node(5);
			tree.root.right.left = new Node(6);
			tree.root.right.right = new Node(7);
			levelOrder(tree.root);
			System.out.println();
			spiralLevelOrder(tree.root);
	}
	
}
