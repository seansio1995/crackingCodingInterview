package LinkedList;

import java.util.HashSet;

public class deleteDuplicate {
    // delete duplicate from the unsorted linked list

    class LinkedListNode{
        LinkedListNode next=null;
        int data;
    }
    void deleteDuplicate(LinkedListNode n){
        HashSet<Integer> set=new HashSet<Integer>();
        LinkedListNode previous=null;
        while(n!=null){
            if (set.contains(n.data)){
                previous.next=n.next;
            }
            else{
                set.add(n.data);
                previous=n;
            }
            n=n.next;
        }
    }
}
