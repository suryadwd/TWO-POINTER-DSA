
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode start = head,
                  end  = head;
        int length = 0,
            current = 0;          
        while(end != null){
            end=end.next;
            length++;
        }

        if(n == length) return head.next;

        while(current < length-n - 1){
            start = start.next;
            current++;
        }
        start.next = start.next.next;
        return head;
    }
}