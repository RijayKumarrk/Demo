package project;

public class basic_cll {
	
	    Node last;

	    class Node {
	        int data;
	        Node next;

	        Node(int val) {
	            data = val;
	            next = null;
	        }
	    }

	    public basic_cll() {
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

	    public void Display() {

	        Node temp = last.next; 
	        do {
	            System.out.print(temp.data + " ");
	            temp = temp.next;
	        } while (temp != last.next);
	        System.out.println();
	    }

	    public static void main(String[] args) {
	        basic_cll rk = new basic_cll();

	        rk.insert(10);
	        rk.insert(20);
	        rk.insert(30);
	        rk.insert(40);

	        rk.Display(); 
	    }
	}



