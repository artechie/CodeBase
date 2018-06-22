 // reversePrint function below.

    /*
     * For reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static void reversePrint(SinglyLinkedListNode head) {
        if(head != null){
            if (head.next == null)
                System.out.println(head.data);
            else
        {
            reversePrint(head.next);
            System.out.println(head.data);
        }
        }
    }
