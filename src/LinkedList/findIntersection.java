package LinkedList;

public class findIntersection {
    class LinkedListNode {
        LinkedListNode next = null;
        int data;

        public LinkedListNode(int d) {
            data = d;
        }
    }


    class Result {
        public LinkedListNode tail;
        public int size;

        public Result(LinkedListNode tail, int size) {
            this.tail = tail;
            this.size = size;
        }
    }

        Result getTailAndSize(LinkedListNode list){
            if (list==null){
                return null;
            }

            LinkedListNode current=list;
            int size=1;

            while(current.next!=null){
                current=current.next;
                size+=1;
            }

            return new Result(current,size);
        }


    LinkedListNode getKthNode(LinkedListNode head, int k){
        LinkedListNode current=head;
        while(k>0 && current!=null){
            current=current.next;
            k-=1;
        }
        return current;
    }

    LinkedListNode findIntersection(LinkedListNode l1, LinkedListNode l2){
        if (l1==null || l2==null){
            return null;
        }

        Result result1=getTailAndSize(l1);
        Result result2=getTailAndSize(l2);

        if(result1.tail!=result2.tail){
            return null;
        }

        LinkedListNode shorter=result1.size < result2.size ? l1:l2;
        LinkedListNode longer=result2.size < result2.size ? l2:l1;

        // advance the longer list to the difference-th node so that the lengths
        // of two lists become equal
        longer=getKthNode(longer,Math.abs(result1.size-result2.size));

        while(shorter!=longer){
            shorter=shorter.next;
            longer=longer.next;
        }

        return longer;

    }

}
