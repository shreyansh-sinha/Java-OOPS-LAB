public class LinkedList {

	Node head;

	public void insert(int data) {

		Node node = new Node();
		node.data = data;
		node.next = null;

		if(head == null)
			head = node;

		else {

			Node n = head;
			
			while(n.next != null) {

				n = n.next;
			}

			n.next = node;
		}
	}

	public void delete(int idx) {

		if(idx == 0)
			head = head.next;

		else {

			Node n = head;
			Node prev = null;

			for(int i=0;i<idx-1;i++) {
				
				prev = n;
				n = n.next;
			}

			prev.next = n.next;
			n.next = null;

		}
	}

	public void show() {

		Node node = head;

		while(node != null) {

			System.out.print(node.data + " ");
			node = node.next;

		}

		System.out.println();

	}

	public Node getHead() {

		return head;
	}

	public void manipulate() {

		Node node = head;
		Node nex = null;

		while(node != null && node.next != null) {

			nex = node.next;
			int a = node.data;
			int b = nex.data;

			// System.out.print(a + " " + b);
			// System.out.println();

			int temp;
			temp = a;
			a = b;
			b = temp;

			node.data = a;
			nex.data = b;

			// System.out.print(a + " " + b);
			// System.out.println();

			node = node.next.next;
		}

	}

}