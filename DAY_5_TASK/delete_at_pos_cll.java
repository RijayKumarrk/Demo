package project;

public class delete_at_pos_cll {
    Node last;

    class Node {
        int data;
        Node next;

        Node(int val) {
            data = val;
            next = null;
        }
    }

    public delete_at_pos_cll() {
        last = null;
    }

    public void insert(int val) {
        Node newnode = new Node(val);
        if (last == null) {
            last = newnode;
            last.next = last;
        } else {
            newnode.next = last.next;
            last.next = newnode;
            last = newnode;
        }
    }

    public void insertAtPosition(int val, int pos) {
        Node newnode = new Node(val);
        if (pos < 1) {
            System.out.println("Invalid position.");
            return;
        }

        if (last == null) {
            if (pos == 1) {
                last = newnode;
                last.next = last;
            } else {
                System.out.println("Position out of bounds (empty list).");
            }
            return;
        }

        if (pos == 1) {
            newnode.next = last.next;
            last.next = newnode;
            return;
        }

        Node temp = last.next;
        for (int i = 1; i < pos - 1 && temp != last; i++) {
            temp = temp.next;
        }

        newnode.next = temp.next;
        temp.next = newnode;

        if (temp == last) {
            last = newnode; 
        }
    }

    public void deleteAtPosition(int pos) {
        if (last == null || pos < 1) {
            System.out.println("List is empty or invalid position.");
            return;
        }

        Node temp = last.next;

        if (pos == 1) {
            
            if (last == last.next) {
                last = null;
            } else {
                last.next = temp.next; // skip head
            }
            return;
        }

        Node prev = null;
        for (int i = 1; i < pos && temp != last; i++) {
            prev = temp;
            temp = temp.next;
        }

        if (temp == last && pos != 1) {
            if (prev != null) {
                prev.next = temp.next;
                last = prev;
            }
        } else if (temp != last.next) {
            prev.next = temp.next;
        } else {
            System.out.println("Position out of bounds.");
        }
    }

    public void Display() {
        if (last == null) {
            System.out.println("List is empty.");
            return;
        }

        Node temp = last.next;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != last.next);
        System.out.println();
    }

    public static void main(String[] args) {
        delete_at_pos_cll rk = new delete_at_pos_cll();

        rk.insert(10);
        rk.insert(20);
        rk.insert(30);
        rk.insert(40);
        System.out.println("Original List:");
        rk.Display(); 

        rk.insertAtPosition(15, 2);
        rk.insertAtPosition(5, 1);
        rk.insertAtPosition(50, 7);
        System.out.println("After Insertions:");
        rk.Display(); 
        rk.deleteAtPosition(1);
        rk.deleteAtPosition(3);
        rk.deleteAtPosition(5);
        System.out.println("After Deletions:");
        rk.Display(); 
    }
}
