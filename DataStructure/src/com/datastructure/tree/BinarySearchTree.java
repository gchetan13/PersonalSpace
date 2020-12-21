package com.datastructure.tree;

import java.util.Queue;

public class BinarySearchTree {
	private Node root;
	public BinarySearchTree() {
		root=null;
	}
	public void insert(Integer num) {
		root =	insertRec(root, num);
	}

	public Node insertRec(Node root, Integer num) {
		if(root==null){
			root= new Node(null, num, null);
			return root;
			
		}
		else if(num<root.item)
			root.left = insertRec(root.left,num);
		else
			root.right = insertRec(root.right,num);
		return root;
	}
	
	public void delete(Integer num){
		root = deleteRec(root,num);
	}
	
	public Node deleteRec(Node root,Integer num){

		if(num < root.item)
			root.left = deleteRec(root.left,num);
		else if(num >root.item)	
			root.right=deleteRec(root.right, num);
		else{
	
			if(root.left==null)
				return root.right;
			else if(root.right==null)
				return root.left;
			 root.item = minValue(root.right); 
             root.right = deleteRec(root.right, root.item);
		}
		return root;
	}
	public Integer minValue(Node root){
		 Integer minv = root.item; 
	        while (root.left != null) 
	        { 
	            minv = root.left.item; 
	            root = root.left; 
	        } 
	        return minv; 	
	}
	
	 public  void inorder()  { 
	       inorderRec(root); 
	    } 
	  
	   public void inorderRec(Node root) { 
	        if (root != null) { 
	            inorderRec(root.left); 
	            System.out.print(root.item+" "); 
	            inorderRec(root.right); 
	        } 
	    } 
	   public  void preorder()  { 
	       preorderRec(root); 
	    } 
	   
/*	   public boolean isBST(){
		  return isBSTRec(root,-1);
	   }*/
/*	   public boolean isBSTRec(Node root,int isBST){
		   if(root!=null){
			   isBSTRec(root.left,isBST);
			   if(root.item>isBST)
			   isBST=root.item;
			   else
			    isBST = -1;   
			   isBSTRec(root.right,isBST);
		   }
		   return isBST;
	   }*/
	  
	   public void preorderRec(Node root) { 
	        if (root != null) { 
	        	System.out.print(root.item+" ");
	        	inorderRec(root.left); 
	            inorderRec(root.right); 
	        } 
	    }   
	   public  void postOrder()  { 
	       postOrderRec(root); 
	    } 
	  
	   public void postOrderRec(Node root) { 
	        if (root != null) { 
	        	inorderRec(root.left); 
	            inorderRec(root.right); 
	            System.out.print(root.item+" ");
	        } 
	    }
	   
	   public void levelOrder(){
	   }
	   
	public Node findSuccessor(Integer num) {
		Node current = find(root, num);
		if (current == null)
			return null;
		// Node has right subtree
		if (current.right != null) {
			return findMin(current.right);
		}
		// Node has no right Sub Tree
		else {
			Node successor = null;
			Node anscestor = root;
			while (anscestor != current) {
				if (current.item < anscestor.item) {
					successor = anscestor;
					anscestor = anscestor.left;
				} else {
					anscestor = anscestor.right;
				}
			}
			return successor;
		}
	}
	   
	   public Node find(Node root,Integer num){
		   if(root==null || root.item==num) return root;
		  
			   if(root.item > num)
				return find(root.left,num);
			   else 
				 return find(root.right,num);
			   
	   }
	   public Node findMin(Node root){
		   if(root==null) return null;
		   while(root.left!=null){
			   root=root.left;
		   }
		   return root;
	   }
}
