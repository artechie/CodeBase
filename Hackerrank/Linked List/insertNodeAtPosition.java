// insertNodeAtPosition function below.

    /*
     * For reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {
        SinglyLinkedListNode node = new SinglyLinkedListNode(data);
        if(head == null)
        {
            head = node;
        }
        else if(position == 0)
        {
            node.next = head;
            head = node;
        }
        else{
             SinglyLinkedListNode temp = head;
            int i=1;
            while(i<position){
                temp = temp.next;
                i++;}
            node.next = temp.next;
            temp.next = node;}
        return head;
    }
