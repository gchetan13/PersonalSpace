package com.datastructure.tree;

public class BinaryTree {
	Node root;

	public BinaryTree() {
		root = new Node();
	}
	public boolean isBSTRec(Node root,boolean isBST){
		   
		   Integer prev = -1;
		   if(root!=null && isBST) 
		   {
			   isBSTRec(root.left,isBST);
			   if(root.item>prev){
				   prev = root.item;
			   }else{
				   isBST=false;
				   return isBST;
			   }
			   isBSTRec(root.right,isBST);
		   }
		   else
		   return isBST;
		   return isBST;
		   
	}
	
	public static void main(String[] args) {
	BinaryTree tree =  new BinaryTree();
	tree.root.item = 10;
	tree.root.left = new Node();
	tree.root.left.item =13;
	tree.root.right = new Node();
	tree.root.right.item = 12;
	System.out.println(tree.isBSTRec(tree.root, true));
	}
}
