// A small bug in this

import java.util.*;

public class prob9 {

	public static void main(String args[]) {

		Scanner in = new Scanner(System.in);

		int r, c;
		r = in.nextInt();
		c = in.nextInt();

		int ar[][];
		ar = new int[r][c];

		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				ar[i][j] = in.nextInt();
			}
		}

		int rodir = 0, codir = 0;
		int rostarte = 0, rostarto = c-2;
		int colstarte = 1, colstarto = r-2;
		int co = 0;
		while(co < r*c) {

			if(rodir%2 == 0) {

				int end = r - rostarte;
				for(int i=rostarte;i<end;i++) {
					System.out.print(ar[rostarte][i] + " ");
					co++;
				}

				rodir++;
				rostarte++;
			}

			else if(rodir%2 != 0) {

				int i=r-(rodir/2 + 1);
				int j= c-1-rodir;
				int togo = c-rodir;

				if(togo == 1) {
					System.out.print(ar[r/2][r/2-1]);
					break;
				}

				while(togo-- > 0) {
					System.out.print(ar[i][j] + " ");
					j--;
					co++;
				}

				rodir++;
			}

			if(codir%2 == 0) {

				int togo = r-codir-1;
				int i = colstarte;
				int j = r-i;
				while(togo-- > 0) {

					System.out.print(ar[i][j] + " ") ;
					i++;
					co++;
				}

				colstarte++;
				codir++;

			}
			else if(codir%2 != 0) {

				int togo = r-1-codir;
				int i = colstarto;
				int j = codir/2;

				while(togo-- > 0) {

					System.out.print(ar[i][j] + " ");
					i--;
					co++;
				}

				codir++;
			}
		}

		System.out.println();

	}
}