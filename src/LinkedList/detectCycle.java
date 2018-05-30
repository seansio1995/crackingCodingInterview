package LinkedList;

public class detectCycle {
    class LinkedListNode {
        LinkedListNode next = null;
        int data;

        public LinkedListNode(int d) {
            data = d;
        }
    }


    LinkedListNode detectBeginningOfCycle(LinkedListNode head){
        LinkedListNode slow=head;
        LinkedListNode fast=head;


        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

            if (slow==fast){
                break;
            }
        }
            // if fast is null or its next is null, there is no cycle
        if (fast==null || fast.next==null){
            return null;
        }

        // since after their collision, if we set slow pointer back to head
        // both of them are k nodes away from the start point of cycle, slow is at the
        // left of start point while fast is at the right of it
        // they will finally meet the beginning of the loop
        slow=head;
        while(slow!=fast){
            slow=slow.next;
            fast=fast.next;
        }

        return fast;
    }
}
