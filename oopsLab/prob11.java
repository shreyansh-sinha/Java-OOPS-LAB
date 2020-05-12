import java.util.*;

public class prob11 {

	public static void main(String args[]) {

		Scanner in = new Scanner(System.in);

		String str;
		str = in.next();

		printPermutation(str, "");
		
		System.out.println();
	
	}

	static void printPermutation(String str, String ans) {

		if(str.length() == 0) {
			System.out.print(ans + " ");
			return;
		}

	    for (int i = 0; i < str.length(); i++) { 

	        // ith character of str 
	        char ch = str.charAt(i); 

	        // Rest of the string after excluding  
	        // the ith character 
	        String ros = str.substring(0, i) +  
	                     str.substring(i + 1); 

	        // Recurvise call 
	        printPermutation(ros, ans + ch); 
	    
	    }
	}

}