 // reverse function below.

    /*
     * For reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode reverse(SinglyLinkedListNode head) {
         SinglyLinkedListNode temp = head;
        SinglyLinkedListNode temp1 = null;
         SinglyLinkedListNode temp2 = null;
        if(head != null && head.next != null){
               temp1 = temp.next;
           while(temp1 != null){
               temp2 = temp1.next;
               temp1.next = temp;
               if(temp == head)
               temp.next = null;
               temp = temp1;
               temp1 = temp2;
           }
            head = temp;     
        }
        return head;
    }
