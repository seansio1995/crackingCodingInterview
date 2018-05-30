package LinkedList;

public class linkedListPartition2 {
    class LinkedListNode{
        LinkedListNode next=null;
        int data;
    }
    // In this version, we only grow the list based on the original linked list, we don't create
    // new list anymore

    LinkedListNode partition(LinkedListNode node, int x) {
        LinkedListNode head = node;
        LinkedListNode tail = node;

        while(node!=null){
            LinkedListNode next=node.next;

            if(node.data < x){
                // insert before the head
                node.next=head;
                head=node;

            }
            else{
                //insert at the tail
                tail.next=node;
                tail=node;
            }
            node=next;
        }

        tail.next=null;

        return head;
    }
}
