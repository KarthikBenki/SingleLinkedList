package Javalinkedlist;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyNode myFirstNode = new MyNode<Integer>(56);
        MyNode mySecondNode = new MyNode<Integer>(30);
        MyNode myThirdNode = new MyNode<Integer>(70);
        MyNode myFourthNode = new MyNode<Integer>(40);

        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.append(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.insert(mySecondNode,myFourthNode);
        myLinkedList.printNodes();
        myLinkedList.deleteNode(myFourthNode);
        myLinkedList.printNodes();

    }
}
