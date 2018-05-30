// this method just reverse the original linked list and
// compare the two lists to see if they are equal (Straight forward)

public class isPanlindrome {
    class LinkedListNode{
        LinkedListNode next=null;
        int data;
        public LinkedListNode(int d){
            data=d;
        }
    }

    boolean isPanlindrome(LinkedListNode head){
        LinkedListNode reversed=reverseAndClone(head);
        return isEqual(head,reversed);
    }

    LinkedListNode reverseAndClone(LinkedListNode node){
        LinkedListNode head=null;

        while(node!=null){

            LinkedListNode n=new LinkedListNode(node.data);
            n.next=head;
            head=n;
            node=node.next;

        }
        return head;
    }

    boolean isEqual(LinkedListNode one,LinkedListNode two){
            while(one!=null && two!=null){
                if(one.data!=two.data){
                    return false;
                }
                one=one.next;
                two=two.next;
            }

            return one==null && two==null;
    }
}
