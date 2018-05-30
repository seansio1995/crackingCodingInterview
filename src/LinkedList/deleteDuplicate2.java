package LinkedList;

public class deleteDuplicate2 {
    // no buffer allowed, no hash table

    // O(1) space and O(n^2) time

    //Basically for each node in the linkedlist, you check every node after
    // the current node and remove the linkedlist, it's pretty time consuming
    // However, it saves some space when the space is limited

    class LinkedListNode{
        LinkedListNode next=null;
        int data;
    }
    void deleteDuplicate(LinkedListNode head) {
        LinkedListNode current = head;

        while(current!=null){
            LinkedListNode runner=current;
            while(runner.next!=null){
                if(runner.next.data==current.data){
                    runner.next=runner.next.next;
                }
                else{
                    runner=runner.next;
                }
            }
            current=current.next;
        }
    }
}
