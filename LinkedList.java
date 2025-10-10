import java.util.Scanner;

public class LinkedList {
    ListNode head;
    private int size;
    LinkedList(){
        size =0;
    }
    class ListNode {
        int data;
        ListNode next;

        ListNode(int value) {
            this.data = value;
            this.next = null;
        }
    }

    // Cycle detection
    public boolean hasCycle(ListNode head){
        ListNode slowPtr = head;
        ListNode fastptr = head;

        while (slowPtr != null && fastptr != null && fastptr.next != null){
            slowPtr = slowPtr.next;
            fastptr = fastptr.next.next;

            if (slowPtr == fastptr){
                return true;
            }
        }
        return false;
    }

    // Reverse List (_it also can solve using Stack_)
    public ListNode reverseList(ListNode head){
        if (head == null) return null;
        if (head.next == null) return head;

        ListNode previousNode = null;                  // preN   currN  nextN
        ListNode currNode = head;                      // null ->  2  ->  3  ->  4  ->  5  ->  6  ->  null
        while (currNode != null){
            ListNode nextNode = currNode.next;

            currNode.next = previousNode;              // null <- 2        3 -> 4 -> .....
                                                       //        preN   currN
            previousNode = currNode;                   // null <- 2      3  ->   4   ->
            currNode = nextNode;
        }
        head = previousNode;
        return head;
    }

    // Check Palindrome List
    public boolean isPalindrome(ListNode head){
        ListNode fast = head, slow = head;
        while (fast != null && fast.next != null ){
            fast = fast.next.next;
            slow = slow.next;
        }
        if (fast != null) slow = slow.next;

        slow = reverseList(slow);
        fast = head;

        while (slow != null){
            if (fast.data != slow.data) return false;
            fast = fast.next;
            slow = slow.next;
        }
        return true;
    }
    // add first operation
    public void addFirst(int value) {
        ListNode newNode = new ListNode(value);
        if (head == null) {
            head = newNode;
            size++;
            System.out.println("add successful..");
            return;
        }
        newNode.next = head;
        head = newNode;
        size++;
        System.out.println("add successful..");
    }

    // add last operation
    public void addLast(int value){
        ListNode newNode = new ListNode(value);
        if (head == null) {                 // check if the list contains any element.
            head = newNode;
            size++;
            return;
        }
        // if list contains element then we need to find last element

        ListNode lastNode = head;           // let assume head is the last node.
        while (lastNode.next != null){
            lastNode = lastNode.next;
        }

        lastNode.next = newNode;            // adding new node as last node.
        size++;

    }

    // add middle operation
    public void addMiddle(int value, int position)
    {
        if (position<0 || position > size){
            System.out.println("Invalid position !");
            return;
        }

        if (position == 0) {                    // insert at head
            addFirst(value);
            return;
        }

        ListNode newNode = new ListNode(value);
        ListNode currentNode = head;
        for (int i=1; i<position-1; i++){
            currentNode = currentNode.next;    // getting previous node i'th position.
        }

        ListNode nextNode = currentNode.next;  // storing i'th node.
        currentNode.next = newNode;            // adding newNode between ith and next node.
        newNode.next = nextNode;
        size++;
    }

    // remove first element
    public void removeFirst(){
        if (head == null){
            System.out.println("Empty list, nothing to delete!");
            return;
        }
        size--;
        head = this.head.next;                  // assigning new head (next node of current head)
    }

    // remove last element
    public void removeLast(){
        if (head == null){
            System.out.println("Empty list, nothing to delete!");
            return;
        }
        ListNode currentNode = head;            // node that will be assigned as last node
        ListNode lastNode = head.next;          // node that will be deleted
        while (lastNode.next != null){
            currentNode = lastNode;
            lastNode = lastNode.next;
        }
        size--;
        currentNode.next = null;
    }


    // remove middle element
    public void removeMiddle(int position)
    {
        if (position<0 || position > size){
            System.out.println("Invalid position !");
            return;
        }

        if (position == 0) {                    // remove at head
            removeFirst();
            return;
        }

        ListNode currentNode = head;
        for (int i=1; i<position-1; i++){
            currentNode = currentNode.next;    // getting previous node of i'th position.
        }

        size--;
        ListNode targetNode = currentNode.next; // storing i'th node.
        ListNode nextNode = targetNode.next;    // getting next node of i'th position.
        currentNode.next = nextNode;            // deleting i'th by connecting previous and next node

    }

    // print Linked List
    public void printList(){
        if (head == null){
            System.out.println("null");
            return;
        }
        ListNode currentNode = head;
        while (currentNode != null){
            System.out.print(currentNode.data + " --> ");
            currentNode = currentNode.next;
        }
        System.out.println("null");
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList ll = new LinkedList();
//        System.out.println("head : "+ ll.head);
//        ll.addLast(3);
//        ll.addFirst(2);
//        ll.addMiddle(5, 1);
//        ll.printList();

        while (true){
            System.out.println("Current Linked List : ");
            ll.printList();
            System.out.println("Size : "+ll.size);
            System.out.println("1. Add item at first.");
            System.out.println("2. Add item at middle.");
            System.out.println("3. Add item at last.");
            System.out.println("4. Delete item at first.");
            System.out.println("5. Delete item at middle.");
            System.out.println("6. Delete item at last.");
            System.out.println("Enter choose (1-6) : ");
            int choice = sc.nextInt();
            switch (choice){
                case 1 :
                    System.out.println("Enter value : ");
                    ll.addFirst(sc.nextInt());
                    break;
                case 2 :
                    System.out.println("Enter value : ");
                    int value = sc.nextInt();
                    System.out.println("Enter position : ");
                    int position = sc.nextInt();
                    ll.addMiddle(value,position);
                    break;
                case 3 :
                    System.out.println("Enter value : ");
                    ll.addLast(sc.nextInt());
                    break;
                case 4 :
                    ll.removeFirst();
                    break;
                case 5 :
                    System.out.println("Enter position : ");
                    ll.removeMiddle(sc.nextInt());
                case 6 :
                    ll.removeLast();
                    break;
                default :
                    System.out.println("Not a valid choice !");
            }
        }
    }
}
