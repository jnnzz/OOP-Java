/******************************************************************************

NAME: JAN LORENZ L. LAROCO
DATE: 9/11/24
DESCRIPTION: Mindterm - Lab.Act.#03 - Working with 2D Arrays

*******************************************************************************/
import java.util.Scanner;

class act3Partial
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[][] num = new int[3][4];


		for(int i=0; i<num.length; i++) {
			System.out.printf("Row #%d: \n", i+1);

			for(int j=0; j<num[i].length; j++) {
				System.out.printf("Enter #%d between 1-100: ", j+1);
				num[i][j] = scanner.nextInt();
			}
		}
		for(int i=0; i<num.length; i++) {
			System.out.printf("\nRow %d ", i+1);

			for(int j=0; j<num[i].length; j++) {
				System.out.printf(" %d", num[i][j]);
			}
		}

		displayMax(num,row,col);
	}
	static public void displayMax(int[][] num, int row, int col) {
		int max = num[0][0];
		int row =0;
		int col = 0;
		for(int i=0; i<num.length; i++) {
			for(int j=0; j<num[i].length; j++)
				if(max<num[i][j]) {
					row = i+1;
					col = j+1;
					max = num[i][j];
				}
		}
		System.out.printf("\nMax: "+ max);
		System.out.printf("\nRow: %d   Col:%d ",row,col);

	}

}


