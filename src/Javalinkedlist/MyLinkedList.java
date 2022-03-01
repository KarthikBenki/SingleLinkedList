package Javalinkedlist;

public class MyLinkedList {
    private INode tail;
    private INode head;

    public MyLinkedList() {
        this.head=null;
        this.tail=null;
    }

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
