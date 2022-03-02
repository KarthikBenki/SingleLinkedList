package Javalinkedlist;

public class SortedLinkedList<K extends Comparable> {
    private INode tail;
    private INode head;

    public SortedLinkedList() {
        this.head = null;
        this.tail = null;
    }
    /*
       @purpose: Ability to add node and sorts to asending order
       @param: Takes a newNode as a input
       @function : Adds new node and sorts in asending order
       @return: No return value.
      */
    public void addSorted(INode newNode) {
        if (this.tail == null)
            this.tail = newNode;
        if (this.head == null)
            this.head = newNode;
        else {
            INode tempNode = this.head;
            this.head = newNode;
            newNode.setNext(tempNode);
        }
        sortList();
    }
    /*
       @purpose: Ability to sort the linked list
       @param: No parameters
       @function : Sorts the linked list in asending order
       @return: No return value.
      */
    public void sortList() {
        INode current=this.head,index=null;
        while (current != null) {
            index = current.getNext();
            while (index != null) {
                K temp1 = (K) current.getKey();
                K temp2 = (K) index.getKey();

                if (temp1.compareTo(temp2)>0) {
                    Object swap = (Object) current.getKey();
                    current.setKey(index.getKey());
                    index.setKey(swap);
                }
                index = index.getNext();
            }
            current = current.getNext();
        }
    }

    /*
        @purpose: Ability print nodes.
        @param: No parameters.
        @function : Prints data inside the nodes
        sequentially.
        @return: No return value.
    */
    public void printSorted() {
        if (this.head == null)
            System.out.println("No elements to print");
        else {
            INode tempNode = this.head;
            while (tempNode.getNext() != null) {
                System.out.print(tempNode.getKey() + "->");
                tempNode = tempNode.getNext();
            }
            System.out.println(tempNode.getKey());
        }
    }


}
