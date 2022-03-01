package Javalinkedlist;

public class MyLinkedList {
    private INode tail;
    private INode head;

    public MyLinkedList() {
        this.head=null;
        this.tail=null;
    }
    /*
       @purpose: Ability to add node
       @param: Takes a newNode as a input
       @function : Adds new node before first node
       @return: No return value.
      */
    public void add(INode newNode) {
        if (this.tail == null)
            this.tail = newNode;
        if (this.head == null)
            this.head = newNode;
        else{
            INode tempNode=this.head;
            this.head=newNode;
            newNode.setNext(tempNode);
        }
    }

    /*
    @purpose: Ability to append node.
    @param: Takes a newNode as a input.
    @function : Adds new node to last of existing node.
    @return: No return value.
     */
    public void append(INode newNode){
        if(this.head==null)
            this.head=newNode;
        if(this.tail==null)
            this.tail=newNode;
        else{
            this.tail.setNext(newNode);
            this.tail=newNode;
        }

    }
    /*
        @purpose: Ability print nodes.
        @param: No parameters.
        @function : Prints data inside the nodes
        sequentially.
        @return: No return value.
    */
    public void printNodes(){
        if(this.head==null)
            System.out.println("No elements to print");
        else {
            INode tempNode = this.head;
            while(tempNode.getNext()!=null){
                System.out.print(tempNode.getKey()+"->");
                tempNode=tempNode.getNext();
            }
            System.out.println(tempNode.getKey());
        }
    }
}
