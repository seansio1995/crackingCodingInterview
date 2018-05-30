package LinkedList;

import java.util.Stack;
// store the first half of list into a stack
// and compare the second half to the stack
public class isPanlindrome2 {
    class LinkedListNode{
        LinkedListNode next=null;
        int data;
        public LinkedListNode(int d){
            data=d;
        }
    }

    // 1 2 3 4 5 6
    // 1 2 3
    //1 2
    //1 2 3 4 5
    // 1 2 3
    // 1 2 3 4 5 6
    // 1 2 3 4
    // 1 2 3 4 5 6 7 8

    boolean isPanlindrome(LinkedListNode head){
        LinkedListNode slow=head;
        LinkedListNode fast=head;

        Stack<Integer> stack=new Stack<Integer>();

        while (fast!=null && fast.next!=null){
            stack.push(slow.data);
            slow=slow.next;
            fast=fast.next.next;

        }

        if (fast!=null){
            slow=slow.next;
        }

        while(slow!=null){
            int top=stack.pop().intValue();
            if(top!=slow.data){
                return false;
            }
            slow=slow.next;

        }
        return true;
    }

}
