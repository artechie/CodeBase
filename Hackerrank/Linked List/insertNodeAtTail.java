 // insertNodeAtTail function below.

    /*
     * For reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
        SinglyLinkedListNode temp = head;
        SinglyLinkedListNode node = new SinglyLinkedListNode(data);
        if(head == null)
            head = node;
        else{
            while(temp.next != null)
              temp = temp.next;
            temp.next = node;
        }
        return head;  
    }
