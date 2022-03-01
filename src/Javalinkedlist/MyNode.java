package Javalinkedlist;

public class MyNode<K> {
    private  MyNode next;
    private  K key;

    public MyNode(K key) {
        this.key=key;
        this.next=null;
    }

    public K getKey() {
        return this.key;
    }

    public void setNext(MyNode next) {
        this.next=next;
    }

    public MyNode getNext() {
        return this.next;
    }
}
