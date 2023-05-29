public class AddInLL {
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
        // Step 1 Create a newNode
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // Step 2-newNode next=head
        newNode.next = head; // link

        // Step 3- head=newNode
        head = newNode;
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
        AddInLL ll = new AddInLL();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);

        ll.print();

    }

}