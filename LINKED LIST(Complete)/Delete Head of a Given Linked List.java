public class Solution {
    public static Node deleteHead(Node head) {
        // Write Your Code Here.
        if(head==null){
            return head;
        }
        head=head.next;
        return head;
    }
}
