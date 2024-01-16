public class Solution {
    public static int length(Node head){
        //Your code goes here
        int count=0;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        return count;
    }
}
