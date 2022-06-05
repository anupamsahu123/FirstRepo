package oopsJavaPart1;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

class CustomLinkedList {
    Node head;
    Node tail;

    CustomLinkedList() {
        head = null;
        tail = null;
    }

    public void addNode(int val) {
        if(head == null) {
            head = tail = new Node(val);
            return;
        }
        tail.next = new Node(val);
        tail = tail.next;
    }

    public void sortLinkedList() {
        if(head == null || head.next == null) return;

        Node current = head;
        while(current != null) {
            Node temp = current.next;
            while(temp != null) {
                if(current.data > temp.data) {
                    current.data = current.data ^ temp.data;
                    temp.data = current.data ^ temp.data;
                    current.data = current.data ^ temp.data;
                }
                temp = temp.next;
            }
            current = current.next;
        }
    }

    public void printList() {
        Node current = head;

        while(current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    private int listLengthFromHere(Node start, Node end) {
        int count = 0;
        while (start != end) {
            count++;
            start = start.next;
        }
        return count;
    }

    public int linkedListLength() {
        return listLengthFromHere(head, null);
    }

    private Node calculateNode(Node leftNode, int count) {
        while(count > 1) {
            count--;
            leftNode = leftNode.next;
        }
        return leftNode;
    }

    public boolean binarySearch(int val) {
        Node leftNode = head;
        Node rightNode = null;

        int searchLength;

        while(true) {
            searchLength = listLengthFromHere(leftNode, rightNode);
            if(searchLength == 2) {
                if(leftNode.data == val || leftNode.next.data == val) return true;
                return false;
            }

            if(searchLength == 1) {
                if(leftNode.data == val) return true;
                return false;
            }

            // calculate Mid node

            Node middleNode = calculateNode(leftNode, (searchLength+1)/2);

            if(middleNode.data == val) return true;
            else if(middleNode.data > val) rightNode = middleNode;
            else leftNode = middleNode.next;
        }
    }
}

public class LinkedListExample {
    public static void main(String[] args) {
        CustomLinkedList ll = new CustomLinkedList();

        ll.addNode(8);
        ll.addNode(7);
        ll.addNode(6);
        ll.addNode(5);
        ll.addNode(4);
        ll.addNode(3);
        ll.addNode(2);
        ll.addNode(1);

        ll.printList();

        ll.sortLinkedList();

        ll.printList();

        for(int i=0; i<10; i++) {
            System.out.println("element " + i + " is present? " + ll.binarySearch(i));
        }
    }
}