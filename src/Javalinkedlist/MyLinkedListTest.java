package Javalinkedlist;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyNode myFirstNode = new MyNode<Integer>(56);
        MyNode mySecondNode = new MyNode<Integer>(70);
        MyNode myThirdNode = new MyNode<Integer>(30);

        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.append(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.insert(myFirstNode,myThirdNode);
        myLinkedList.printNodes();

    }
}
