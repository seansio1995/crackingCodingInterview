package LinkedList;

public class deleteMiddleNode {
    // Before: a->b->c->d->e->f
    // After: a ->b->d- >e- >f

//    In this p roblem, you are not given access to the head of the linked list. You only have access to that node.
//    The solution is simply to copy the data from the next node over to the current node, and then to delete the
//    next node.

    class LinkedListNode{
        LinkedListNode next=null;
        int data;
    }
    boolean deleteNode(LinkedListNode node){
        if(node==null || node.next==null){
            return false;
        }

        LinkedListNode next=node.next;
        node.data=next.data;
        node.next=next.next;

        return true;
    }
}
