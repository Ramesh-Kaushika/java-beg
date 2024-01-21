package data;

public class Stack {

    private Node top;

    public void push(int data){

        Node node = new Node(data);
        node.next=top;
        top=node;

    }

    public void printStack(){
//same reference variable dont data iterate because top ref variable damage
        /*while(top!=null){

            System.out.println(top.data);
            top=top.next;
        }*/

        // top sign another variable
        Node temp = top;

        while (temp!=null){
            System.out.println(top.data);
            temp=temp.next;

        }
    }

    public void pop(){

        if (top!=null){
            top=top.next;

        }


    }

}
