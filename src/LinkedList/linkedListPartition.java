package LinkedList;

import javax.sound.sampled.Line;

public class linkedListPartition {
    class LinkedListNode{
        LinkedListNode next=null;
        int data;
    }


    LinkedListNode partition(LinkedListNode node,int x){
        LinkedListNode beforeStart=null;
        LinkedListNode beforeEnd=null;
        LinkedListNode afterStart=null;
        LinkedListNode afterEnd=null;

        while(node!=null){
            LinkedListNode next=node.next;
            node.next=null;
            if(node.data < x){
                // insert the node in the before list
                if(beforeStart==null){
                    beforeStart=node;
                    beforeEnd=beforeStart;
                }
                else{
                    beforeEnd.next=node;
                    beforeEnd=node;
                }
            }

            else{
                if (afterStart==null){
                    afterStart=node;
                    afterEnd=afterStart;
                }
                else{
                    afterEnd.next=node;
                    afterEnd=node;
                }
            }
            node=next;
        }

        if (beforeStart==null){
            return afterStart;
        }

        beforeEnd.next=afterStart;
        return beforeStart;
    }
}
