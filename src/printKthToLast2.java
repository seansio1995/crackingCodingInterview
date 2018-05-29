public class printKthToLast2 {
    class LinkedListNode{
    LinkedListNode next=null;
    int data;
}

    LinkedListNode printKthToLast(LinkedListNode head, int k) {
        LinkedListNode p1=head;
        LinkedListNode p2=head;

        for (int i=0;i<k;i++){
            if(p1==null){
                return null; //out of bounds
            }
            p1=p1.next;
        }

        while(p1!=null){
            p1=p1.next;
            p2=p2.next;

        }

        return p2;

    }
}
