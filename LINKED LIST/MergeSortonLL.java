public class MergeSortonLL {
    public class RemoveALoop {
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

        public Node findMid(Node head) {
            Node slow = head;
            Node fast = head;
    
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow;

        private Node getMid(Node head) {
            Node slow = head;
            Node fast = head.next;

            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow;
        }

        private Node merge(Node head1, Node head2) {
            Node mergedLL = newNode(-1);
            Node temp = mergedLL;

            while (head != null && head2 != null) {
                if (head1.data <= head2.data) {
                    temp.next = head1;
                    head1 = head1.next;
                    temp = temp.next;
                } else {
                    temp.next = head2;
                    head2 = head2.next;
                    temp = temp.next;
                }
            }

            while (head1 != null) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }
            while (head != null) {
                temp.next = head2;
                head2 = head.next;
                temp = temp.next;
            }
            return mergedLL.next;
        }

}
