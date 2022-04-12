
package datastructuresdoublylinkedlist;
//Class for Doubly Linked List
public class DataStructuresDoublyLinkedList {

    
        Node head;
        
        public class Node{
            int data;
            Node prev;
            Node next;
            
            public Node(int d){data=d;}
        }
    
    public void puch(int new_data)
    {
        Node new_Node=new Node(new_data);
        new_Node.next=head;
        new_Node.prev=null;
        
        if(head !=null)
            head.prev= new_Node;
        
        head=new_Node;
        
    }
    
    public void InsertAfter(Node prev_Node, int new_data)
    {
        if (prev_Node == null ){
            System.out.println("The given previous node cannot be NULL");
            return;
        }
        
        Node new_node=new Node(new_data);
        
        new_node.next=prev_Node.next;
        
        prev_Node.next=new_node;
        
        new_node.prev=prev_Node;
        
        if(new_node.next !=null)
        {
            new_node.next.prev=new_node;
        }
    }
    public void append(int new_data)
    {
       
        Node new_node = new Node(new_data);
 
        Node last = head; 
 
      
        new_node.next = null;
 
        if (head == null) {
            new_node.prev = null;
            head = new_node;
            return;
        }
    }
    public void deleteNode(Node delnod)
    {
 
        
        if (head == null || delnod == null) {
            return;
        }
 
       
        if (head == delnod) {
            head = delnod.next;
        }
 

        if (delnod.next != null) {
            delnod.next.prev = delnod.prev;
        }
 
        
        if (delnod.prev != null) {
            delnod.prev.next = delnod.next;
        }
 
        
        
    }
      public void printlist(Node nd)
    {
        Node last = null;
 
        while (nd != null) {
            System.out.print(nd.data +" ");
            last = nd;
            nd= nd.next;
        }
 
        System.out.println();
    }
    public static void main(String[] args) {
        DataStructuresDoublyLinkedList dsdll=new DataStructuresDoublyLinkedList();
        dsdll.puch(10);
        
        dsdll.puch(3);
        
        dsdll.puch(99);
        
        dsdll.puch(6);
        
        System.out.print("DoublyLinkedList:\n");
        dsdll.printlist(dsdll.head);
        
        System.out.print("\nList deleting first node:\n");
        dsdll.deleteNode(dsdll.head);
        dsdll.printlist(dsdll.head);
        
         System.out.print("\nList  deleting middle node:\n");
        dsdll.deleteNode(dsdll.head.next);
        dsdll.printlist(dsdll.head);
        
         
       System.out.print("\nList  InsertAfter node:\n");
       dsdll.InsertAfter(dsdll.head.next,34);
       dsdll.deleteNode(dsdll.head);
       dsdll.printlist(dsdll.head);
       System.out.print("\nList  InsertAfter node:\n");
       dsdll.InsertAfter(dsdll.head.prev,3);
       dsdll.deleteNode(dsdll.head);
       dsdll.printlist(dsdll.head);
 
    }
    
}
