import java.util.*;

public class prob16 {

	public static void main(String args[]) {

		Scanner in = new Scanner(System.in);

		int n;
		n = in.nextInt();

		LinkedList list = new LinkedList();

		int num;

		for(int i=0;i<n;i++) {
			num = in.nextInt();
			list.insert(num);
		}

		Node head = list.getHead();

		Boolean ans = isPalindrome(list, head);

		if(ans == true)
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");

	}

	static Boolean isPalindrome(LinkedList list, Node head) {

		int ar[];
		ar = new int[1000];

		Node node = head;
		int count = 0;

		while(node != null) {

			ar[count] = node.data;
			count++;
			node = node.next;

		}

		int size = count;

		for(int i=0;i<=size/2;i++) {
			if(ar[i] != ar[size-1-i])
				return false;
		} 

		return true;
	}
}