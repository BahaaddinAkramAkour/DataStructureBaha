
package binarysearchtree_lab;
/*
 public Node(int item)
        {
            key = item;
            left = right = null;
        }
*/
public class BinarySearchTree_Lab {

  class Node
  {
      Object data;
      Node left;
      Node right;
      
      Node (Object d)
      {
          
            
          data = d;
      }
  }
 
      public Node insertTree(Node p, int key)
      {
          if (p==null)
              p=new Node(key);
          else if(key < p.data)
              p.left=insertTree(p.left,key);
          else
              p.right=insertTree(p.right,key);
          return p;
          
      }
      public Node deleteTree(Node root , int key)
      {
          Node p;
          Node parent= root;
          Node inorderSucc;
          if(root == null)
          {
              System.out.println("Tree is empty");
              return null;
          }
          p=root;
          while (p!= null && p.data ! = key)
          {
              parent=p;
              if (key < p.data)
                  p=p.left;
              else p=p.right;
          }
          if(p==null)
          {
              System.out.println("\n Node"+ key + "not found for deletion");
              return null;
          }
          if(p.left!=null&&p.right!=null)
          {
              parent=p;
              inorderSucc=p.right;
              while(inorderSucc.left != null)
              {
                  inorderSucc=inorderSucc.left;
              }
              p.data= inorderSucc.data;
              p=inorderSucc;
          }
          if(p.left==null&& p.right==null)
          {
              if(parent.left==p)
                  parent.left=null;
              else
                  parent.right=null;
               
          }
          if (p.left == null && p.right!=null)
          {
              if(parent.left==p)
                  parent.left=p.right;
              else parent.right=p.right;
          }
          if(p.left !=null&&p.right==null)
          {
              if(parent.left==p)
                  parent.left=p.left;
              else
                  parent.right=p.left;
          }
          return root;
      }
      public Node search(Node root, int key)
      {
          if (root==null || root.data==key) 
 return root; 
 
 
 if (root.data< key) 
 return search(root.right, key); 
 
 
 return search(root.left, key); 
      }
      public int leafNodes(Node per){
       Node p=per;
 if (p == null) 
 return 0; 
 if (p.left == null && p.right == null) 
 return 1; 
 else
 return leafNodes(p.left) + leafNodes(p.right);    
      }
 
      public void inorder(Node root)
              {
                   if (root != null) {
            inorder(root.left);
            System.out.println(root.key);
            inorder(root.right);
        
              }
              
              }
  
    public static void main(String[] args) {
        int arr[]={45,25,15,10,20,30,65,55,50,60,75,80};
        BinarySearchTree_Lab bst=new BinarySearchTree_Lab();
        Node root= null;
        
        for(int i=0; i<arr.length;i++)
            root= bst.insertTree(root,arr[i]);
       Node root2=root;
       
       int key=66;
       Node item= bst.search(root2, key);
       if(item != null)
           System.out.print("\n item found:"+item.data);
       else 
           System.out.print("\n Node "+key +"not found");
       
       System.out.print("\n Number of leaf nodes:" + bst.leafNodes(root));
       System.out.print("\n Inorder: ");
       bst.inorder(root);
    }
    
}
