import java.util.LinkedList;

public class sumList2 {
    class LinkedListNode{
        LinkedListNode next=null;
        int data;

        public LinkedListNode(int d){
            data=d;
        }
    }


    class partialSum{
        public LinkedListNode sum=null;
        public int carry=0;
    }
    LinkedListNode addLists(LinkedListNode l1, LinkedListNode l2){
        int len1=length(l1);
        int len2=length(l2);

        if (len1 < len2){
            l1=padList(l1,len2-len1);
        }
        else{
            l2=padList(l2,len1-len2);
        }

        partialSum sum=addListHelper(l1,l2);

        if (sum.carry==0){
            return sum.sum;
        }
        else{
            LinkedListNode result=insertBefore(sum.sum,sum.carry);
            return result;
        }
    }

    partialSum addListHelper(LinkedListNode l1, LinkedListNode l2){
        if (l1==null && l2==null){
            partialSum sum=new partialSum();
            return sum;
        }

        partialSum sum=addListHelper(l1.next,l2.next);
        int val=l1.data+l2.data+sum.carry;


        LinkedListNode full_result=insertBefore(sum.sum,val%10);
        sum.sum=full_result;
        sum.carry=val/10;
        return sum;

    }

    LinkedListNode padList(LinkedListNode l,int padding){
        LinkedListNode head=l;
        for (int i=0;i<padding;i++){
            head=insertBefore(head,0);
        }
        return head;

    }

    LinkedListNode insertBefore(LinkedListNode list,int data){
        LinkedListNode node=new LinkedListNode(data);
        if(list!=null){
            node.next=list;
        }

        return node;
    }

    int length(LinkedListNode node){
        int size=0;
        while(node!=null){
            size+=1;
            node=node.next;
        }

        return size;
    }
}
