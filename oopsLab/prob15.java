import java.util.*;

public class prob15 {

	public static void main(String args[]) {

		Scanner in = new Scanner(System.in);

		String str;
		str = in.next();

		LinkedList list = new LinkedList();

		int len = str.length();

		for(int i=0;i<len;i++) {
			
			if(str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U' || str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
				list.insert(str.charAt(i));
			}
		}

		list.show();

	}
}