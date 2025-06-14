package project;

public class cll {
	
	    Node last;

	    class Node {
	        int data;
	        Node next;

	        Node(int val) {
	            data = val;
	            next = null;
	        }
	    }

	    public cll() {
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
		 public void insertpos(int val, int pos) {
	        Node newnode = new Node(val);
	        

	        if (last == null)
	        {

	                last = newnode;
	                last.next = last;
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
	    

	    public void Display() {

	        Node temp = last.next; 
	        do {
	            System.out.print(temp.data + " ");
	            temp = temp.next;
	        } while (temp != last.next);
	        System.out.println();
	    }

	    public static void main(String[] args) {
	        cll rk = new cll();

	        rk.insert(10);
	        rk.insert(20);
	        rk.insert(30);
	        rk.insert(40);
		    rk.insertpos(300,3);

	        rk.Display(); 
	    }
	}



