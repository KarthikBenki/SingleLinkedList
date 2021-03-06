package javapractice;

public class MyLinkedList {
    private INode tail;
    private INode head;

    public MyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void add(INode newNode) {
        if (this.tail == null)
            this.tail = newNode;
        if (this.head == null)
            this.head = newNode;
        else {
            INode tempNode = this.head;
            this.head = newNode;
            this.head.setNext(tempNode);
        }
    }


    public void printTheNodes() {
        if (this.head == null) {
            System.out.println("No elements to print");
        } else {
            INode tempNode = this.head;
            while (tempNode.getNext() != null) {
                System.out.print(tempNode.getKey() + " => ");
                tempNode = tempNode.getNext();
            }
            System.out.println(tempNode.getKey());
        }
    }

    public void append(INode newNode) {
        if (this.head == null)
            this.head = newNode;
        if (this.tail == null)
            this.tail = newNode;
        else {
            this.tail.setNext(newNode);
            this.tail = newNode;
        }
    }

    public void insert(INode myNode, INode newNode) {
        INode tempNode = myNode.getNext();
        myNode.setNext(newNode);
        newNode.setNext(tempNode);
    }

    public INode pop() {
        INode tempNode = this.head;
        this.head = this.head.getNext();
        return tempNode;

    }
}
