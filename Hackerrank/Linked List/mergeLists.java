 // mergeLists function below.

    /*
     * For reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        SinglyLinkedListNode temp = null;
        SinglyLinkedListNode head = null;
        SinglyLinkedListNode temp1 = head1;
        SinglyLinkedListNode temp2 = head2;
        if(head1 == null && head2 == null)
            return null;
        else if(head1 == null)
            return head2;
        else if(head2 == null)
            return head1;
        else{
            while(temp1 != null && temp2 != null)
            {
                if(temp1.data <= temp2.data){
                    SinglyLinkedListNode t = new SinglyLinkedListNode(temp1.data);
                    if(head == null)
                    temp = t;
                    else{
                        temp.next = t;
                        temp = temp.next;}
                    temp1 = temp1.next;}
                else{
                    SinglyLinkedListNode t = new SinglyLinkedListNode(temp2.data);
                    if(head == null)
                    temp = t;
                    else{
                        temp.next = t;
                        temp = temp.next;}
                    temp2 = temp2.next;}
                if(head == null)
                    head = temp;
            }
            while(temp1 != null){
                SinglyLinkedListNode t = new SinglyLinkedListNode(temp1.data);
                temp.next = t;
                temp = temp.next;
                temp1 = temp1.next; 
            }
             while(temp2 != null){
                SinglyLinkedListNode t = new SinglyLinkedListNode(temp2.data);
                temp.next = t;
                temp = temp.next;
                temp2 = temp2.next;
            }
            return head;
        }  
    }
