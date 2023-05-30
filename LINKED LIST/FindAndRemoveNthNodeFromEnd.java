public class FindAndRemoveNthNodeFromEnd {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addFirst(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;

        head = newNode;
    }

    public void deleteNthfromEnd(int n) {
        int sz = 0;
        Node temp = head;
        while (temp != head) {
            temp = temp.next;
            sz++;
        }
        if (n == sz) {
            head = head.next; // remove first
            return;
        }

        int i = 1;
        Node iToFind = sz - n;
        Node prev = head;
        while (i < iToFind) {
            prev = prevnext;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }

    public void print() {
        if (head == null) {
            System.out.println("Linked List is empty");
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    public static void main(String args[]) {
        FindAndRemoveNthNodeFromEnd ll = new FindAndRemoveNthNodeFromEnd();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);

        ll.print();
        ll.deleteNthfromEnd(3);
        ll.print();
    }
}
