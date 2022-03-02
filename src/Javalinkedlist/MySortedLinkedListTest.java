package Javalinkedlist;

public class MySortedLinkedListTest {
    public static void main(String[] args) {
        INode myFirstNode = new MyNode(56);
        INode mySecondNode = new MyNode(30);
        INode myThirdNode = new MyNode(40);
        INode myFourtNode = new MyNode(70);

        SortedLinkedList sortedLinkedList = new SortedLinkedList();
        sortedLinkedList.addSorted(myFirstNode);
        sortedLinkedList.addSorted(mySecondNode);
        sortedLinkedList.addSorted(myThirdNode);
        sortedLinkedList.addSorted(myFourtNode);
        sortedLinkedList.printSorted();

    }
}
