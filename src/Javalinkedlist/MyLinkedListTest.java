package Javalinkedlist;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyNode myFirstNode = new MyNode<Integer>(70);
        MyNode mySecondNode = new MyNode<Integer>(30);
        MyNode myThirdNode = new MyNode<Integer>(56);

        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.add(mySecondNode);
        myLinkedList.add(myThirdNode);
        myLinkedList.printNodes();

    }
}
