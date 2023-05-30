public class RemoveFirstInLL {
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
    public static int size;

    public void addFirst(int data) {
        // Step 1 Create a newNode
        Node newNode = new Node(data);
        size++; // include size++
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // Step 2-newNode next=head
        newNode.next = head; // link

        // Step 3- head=newNode
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++; // include size++
        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    public void add(int idx, int data) {
        if (idx == 0) {
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        size++; // include size++
        Node temp = head;
        int i = 0;

        while (i < idx - 1) {
            temp = temp.next;
            i++;

        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst() { // remove first
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;

        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
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
        SizeOfLL ll = new SizeOfLL();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);

        ll.print();
        ll.removeFirst();
        ll.print();

    }
}
