 //deleteNode function below.

    /*
     * For reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode deleteNode(SinglyLinkedListNode head, int position) {
        if(head.next == null)
            head = null;
        else if(position == 0)
            head = head.next;
        else{
            SinglyLinkedListNode temp = head;
            int i=1;
            while(i<position){
                temp = temp.next;
                i++;}
            temp.next = temp.next.next;
        }
        return head;
    }
