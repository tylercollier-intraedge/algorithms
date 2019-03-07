public class IntLinkedListTest {
    public static void main(String[] args) {
        IntLinkedList ill = new IntLinkedList();
        ill.add(7);
        ill.add(9);
        ill.add(2);
        ill.print();
    }
}

class IntLinkedList {
    Node head;
    
    public void add(int value) {
        Node newNode = new Node();
        newNode.value = value;
        Node current = head;
        if (current != null) {
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        } else {
            head = newNode;
        }
    }
    
    public void print() {
        Node current = head;
        while (current != null) {
            System.out.println(current.value);
            current = current.next;
        }
    }
}

class Node {
    int value;
    Node next;
}