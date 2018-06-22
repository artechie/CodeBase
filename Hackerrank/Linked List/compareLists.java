 // compareLists function below.

    /*
     * For reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static boolean compareLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
            int f=0;
        
        while(head1.next != null && head2.next != null)
        {
            if(head1.data != head2.data){
                f=1;
                break;
            }
            head1 = head1.next;
            head2 = head2.next;
        }
        if(head1.next == null && head2.next == null && f == 0){
            System.out.println(1);
            return true;}
        else{
            System.out.println(0);  
            return false;
        }
    }
