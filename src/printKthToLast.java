import sun.awt.image.ImageWatched;

public class printKthToLast {
    class LinkedListNode{
        LinkedListNode next=null;
        int data;
    }

    int printKthToLast(LinkedListNode head, int k){
        if (head==null){
            return 0;
        }

        int index=printKthToLast(head.next,k)+1;

        if(index==k){
            System.out.println("The Kth Node is "+head.data);
        }

        return index;
    }
}
