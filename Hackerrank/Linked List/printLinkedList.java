//printLinkedList function below.

    /*
     * For reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static void printLinkedList(SinglyLinkedListNode head) {
        while(head.next!=null)
        {
            System.out.println(head.data);
            head=head.next;
        }
        System.out.println(head.data);

    }
