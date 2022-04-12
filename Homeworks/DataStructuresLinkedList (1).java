
package datastructureslinkedlist;

 public class DataStructuresLinkedList {

public class Node
{
    Object data;
    Node next;
   public Node(Object d )
    {data =d;}
}

     
    
Node head;
Node p;
int count=0;
public void createList(Object item)
{
head=new Node(item);

}
public  void insertFirst(Object item)
{   p=new Node(item);
p.next=head;
head=p;
count++;
}
public void insertAfter(Object item, Object key)
{
p=find(key);
if (p==null )
        System.out.println(key +"key is not found");
else
{ Node q =new Node(item);
q.next=p.next;
p.next=q;
count++;
}

  }
public Node find(Object key )
{
    p=head;
    while(p!=null)
    {
        if(p.data==key)return p;
        p=p.next;
        
    }
    return null;
}
public Object deleteFirst()
{
    if( isEmpty())
    {
        System.out.println("List is empty: no deletion");
        return null;
    }
    Node tmp= head;
    head=tmp.next;
    tmp.next=null;
    count--;
    return tmp.data;
}
public Object deleteLast()
{
    if( isEmpty())
    {
        System.out.println("List is empty: no deletion");
        return null;
    }
    Node tmp= head;
    while(tmp.next != null){
        tmp=tmp.next;
    tmp.next=tmp.next.next;
    count--;
    tmp=head;
    
    }
    
    return tmp.data;
    
}



public Object deleteAfter(Object key)
{
    p=find(key);
    if(p==null)
    {
        System.out.println(key+"key is not found");
        return null;
    }
    if(p.next==null)
    {
        System.out.println("No deletion");
        return null;
    }
    else {
    Node tmp=p.next;
    p.next=tmp.next;
    tmp.next=null;
    count--;
    return tmp.data;
    }
}
public void displayList()
{p=head;
System.out.println("\nList: ");
while(p!=null)
{
    System.out.print(p.data +"  ");
    p=p.next;
    
}
System.out.print(p);
}
public boolean isEmpty()
{
    return size()==0;
}

public int size()
{
    return count;
}
 public static void main(String[] args) {
     DataStructuresLinkedList list=new DataStructuresLinkedList();
   list.createList(11);
     System.out.println("");
   list.displayList();
   System.out.println("");
   list.insertFirst(55);
   System.out.println("");
   list.displayList();
   System.out.println("");
   list.insertAfter(66,33);
   System.out.println("");
   list.displayList();
   System.out.println("");
   Object item=list.deleteFirst();
   if(item!=null)
   {
       System.out.println("\ndeleteFirst():"+item);
       list.displayList();
   }
   System.out.println("");
   item=list.deleteAfter(22);
   if(item !=null){
   System.out.println("\ndeleteAfter(22):"+item);}
   System.out.println("\nsize():"+list.size());
    }
 }   

