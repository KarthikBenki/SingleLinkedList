package Javalinkedlist;


public class MyNodeTest {
    public static void main(String[] args) {
        MyNode myFirstNode = new MyNode<Integer>(56);
        MyNode mySecondNode = new MyNode<Integer>(30);
        MyNode myThirdNode = new MyNode<Integer>(70);

        myFirstNode.setNext(mySecondNode);
        mySecondNode.setNext(myThirdNode);
    }

}
