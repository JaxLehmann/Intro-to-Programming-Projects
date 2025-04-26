package ds;

public class LinkedList {
	
	public ListNode head;
	
	public LinkedList () {
		head = null;
	}
	
	/*
	 * Implement the LIST-SEARCH(L, k) function
	 */
	public ListNode search (int k) {
		ListNode x = head;
		while (x != null && x.key != k) {
			x = x.next;
		}
		return x;
	}
	
	/*
	 * Implement the LIST-INSERT(L, x) function
	 * Note that x is a integer value, not a ListNode
	 */
	public void insert (int x) {
		ListNode X = new ListNode(x);
		X.next = head;
		if (head != null) {
			head.prev = X;
		}
		head = X;
		X.prev = null;
	}
	
	/*
	 * Implement the LIST-DELETE(L, x) function
	 */
	public void delete (ListNode x) {
		if (x.prev != null) {
			x.prev.next = x.next;
		}
		else {
			this.head = x.next;
		}
		if (x.next != null) {
			x.next.prev = x.prev;
		}
	}
	
	
	public String toString () {
		String str;
		ListNode x;
		
		str = "[";
		x = this.head;
		while (x != null) {
			str += x.key + ",";
			x = x.next;
		}
		
		str += "]";
		return str;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LinkedList l;
		
		l = new LinkedList();
		for (int i = 0; i < 5; i++)
			l.insert(i);
		System.out.println(l.toString());
		for (int i = 0; i < 2; i++) 
			l.delete(l.head.next);
		System.out.println(l.toString());
	}
	public class ListNode {
		public int key;
		public ListNode prev;
		public ListNode next;
		
		public ListNode () {
			prev = next = null;
		}
		
		public ListNode (int _key) {
			key = _key;
			prev = next = null;
		}
	}

}
