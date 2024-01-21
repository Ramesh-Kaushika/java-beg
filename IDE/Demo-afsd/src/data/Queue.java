package data;

public class Queue {

   private Node top;

   public void push(int data){

       Node node = new Node(data);

       if (top == null){
           top=node; // null equal both side


       }else {

           Node temp = top;

           while(temp.next!=null){
               temp=temp.next;
           }

           temp.next=node;

       }
   }
}
