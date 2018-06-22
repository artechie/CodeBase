// getNode function below.

    /*
     * For reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static int getNode(SinglyLinkedListNode head, int positionFromTail) {
        SinglyLinkedListNode temp = head;
        int c = 0;
        while (temp.next != null){
            temp = temp.next;
            c++;}
        temp = head;
        for(int i=0;i<c-positionFromTail;i++)
            temp = temp.next;
        return temp.data;      
    }
