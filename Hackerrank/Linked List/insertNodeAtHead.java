//insertNodeAtHead function below.

    /*
     * For reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode head, int data) {
        SinglyLinkedListNode node=new SinglyLinkedListNode(data);
        if(head==null)
            head=node;
        else
        {
           node.next=head;
            head=node;
        }
        System.out.println(data);
        return head;
    }
