/******************************************************************************

NAME: JAN LORENZ L. LAROCO
DATE: 9/15/24
DESCRIPTION: Midterm - Lab.Act.#03 - Working with 2D Arrays

*******************************************************************************/
import java.util.Scanner;

class LarocoAct3
{
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int[][] arr = new int[3][4]; 
		arr[0] = new int[] {23, 43, 65, 76};
		arr[1] = new int[] {54, 65, 54, 3};
		arr[2] = new int[] {98, 43, 2, 12};
		
		int choose = 0;
		String choice = "";
		boolean option = false;
		boolean validInput = false;

			System.out.println("\n\033[1;36m*-----------Midterm - Lab.Act.#03 - Working with 2D Arrays---------------*");
			System.out.println("   	 *--------------LAROCO, JAN LORENZ L.--------------*\033[0m");
			System.out.println("");
			System.out.println("Note: This code contains colored text. Please open using only Visual studio code or Online GDB to run this code.");

			do{
				int[][] num = new int[3][4];
				do { 
					option = false;
					try {
				System.out.printf("\n\033[1;36mChoose only one\033[0m");
				System.out.printf("\n1. Activity 3 (HARD CODE/Random numbers)");
				System.out.printf("\n2. Input numbers in the arrays");
				System.out.printf("\nYour choice: ");
				choose = scanner.nextInt();
		
							if(choose <1 || choose >2){
								System.out.printf("\n\033[1;31mInput 1 or 2 only.\033[0m");
								option = true;
							}
					} catch (Exception e) {
						System.out.printf("\n\033[1;31mInput 1 or 2 only.\033[0m");
						option = true;
						scanner.nextLine();
					}
						
				} while (option);
				System.out.println();

					int row =0;
					int col = 0;
					int max = num[0][0];
					if(choose == 1){
						max = displayMaxHardcode(arr, row, col, max);

						displayInputhardcode(arr, max);
						displayMaxHardcode(arr, row, col, max);
						displayRowColHardcode(arr, row, col, max);
						System.out.println();
						System.out.print("\n\033[1;32mDo you want to try again? (Y/N): \033[0m");
						choice = scanner.next();
						
						//LOOP TRY AGAIN
						validInput = false;
						while (!validInput) {
								System.out.println();
								System.out.printf("\n\033[1;32mDo you want to try again? (Y/N): \033[0m");
								choice = scanner.next();
								if (choice.equalsIgnoreCase("Y") || choice.equalsIgnoreCase("N")) {
										validInput = true;
								} else {
										System.out.println("\033[1;31mInvalid input. Please enter 'Y' or 'N'.\033[0m");
								}
						}

						}else if (choose == 2) {
								input(num);
								max = displayMax(num, row, col, max);  
								displayInput(num, max);
								displayMax(num,row,col,max);
								displayRowCol(num, row, col, max);

								System.out.println();
								//LOOP TRY AGAIN
								validInput = false;
								while (!validInput) {
										System.out.println();
										System.out.printf("\n\033[1;32mDo you want to try again? (Y/N): \033[0m");
										choice = scanner.next();
										if (choice.equalsIgnoreCase("Y") || choice.equalsIgnoreCase("N")) {
												validInput = true;
										} else {
												System.out.println("\033[1;31mInvalid input. Please enter 'Y' or 'N'.\033[0m");
										}
								}
						} else {
							System.out.printf("\033[1;31mINVALID INPUT\n\033[0m");
					}
				}while(choice.equalsIgnoreCase("Y"));
				System.out.println("");
				System.out.printf("\033[1;32mThank you!\033[0m");
				System.out.println("");
	}

	//METHODS/FUNCTIONS
		//***************FOR HARDCODE******************//
		static public void displayInputhardcode(int[][] arr, int max){
			System.out.printf("\033[1;35m<------------------------------------>\n\033[0m");
			System.out.println("\n\033[1;36mElements of the array:\033[0m");
			System.out.println();
			System.out.printf("        ");
	
			for(int k=0; k<arr[0].length; k++){
				System.out.printf("\033[1;34mCol#%-4d\033[0m", k+1);
			}
			System.out.println();
			for (int i = 0; i < arr.length; i++) {
				System.out.println();
				System.out.printf("\033[1;34mRow #%-5d\033[0m", i + 1);
				for (int j = 0; j < arr[0].length; j++) {
						if (arr[i][j] == max) {
								System.out.printf("\033[1;33m%-8d\033[0m", arr[i][j]);
						} else {
								System.out.printf("%-8d", arr[i][j]);
						}
				}
				System.out.println();
		}
			System.out.println();
			System.out.printf("\033[1;35m<------------------------------------>\n\033[0m");
	
		}
		static public int displayMaxHardcode(int[][] arr, int row, int col, int max) {
			for(int i=0; i<arr.length; i++) {
				for(int j=0; j<arr[i].length; j++)
					if(max<arr[i][j]) {
						max = arr[i][j];
					}
			}
			return max;
		}
		//ROW-COL
		static public void displayRowColHardcode(int[][] arr, int row, int col, int max) {
			for(int i=0; i<arr.length; i++) {
				for(int j=0; j<arr[i].length; j++)
					if(max==arr[i][j]) {
						row = i+1;
						col = j+1;
					}
			}
			System.out.printf("\033[1;33mThe maximum number is: %d\033[0m", max);
			System.out.printf("\n\033[1;33mLocated at Row: %d , Col:%d\033[0m",row,col);
			System.out.println();
		}


	//****************FOR INPUTS******************/
	//inputs
	static public void input(int[][] num) {
    for (int i = 0; i < num.length; i++) {
        System.out.printf("\033[1;34mRow #%d \033[0m\n", i + 1);
        
        for (int j = 0; j < num[i].length; j++) {
            boolean temp;
            do {
                temp = false;
                try {
                    System.out.printf("Enter #%d between 1-100: ", j + 1);
                    num[i][j] = scanner.nextInt();

                    if (num[i][j] < 1 || num[i][j] > 100) {
                        System.out.printf("\033[1;31mINVALID! Enter numbers between 1-100\n\033[0m");
                        temp = true;
                    }
                } catch (Exception e) {
                    System.out.printf("\033[1;31mINVALID INPUT! Please input a number.\n\033[0m");
                    temp = true;
                    scanner.nextLine();  
                }
            } while (temp);
        }
        System.out.println();
    }
}
	//displayINPUTS
	static public void displayInput(int[][] num, int max){
		System.out.printf("\033[1;35m<------------------------------------>\n\033[0m");
		System.out.println("\n\033[1;36mElements of the array:\033[0m");
		System.out.println();
		System.out.printf("        ");

		//column
		for(int k=0; k<num[0].length; k++){
			System.out.printf("\033[1;34mCol#%-4d\033[0m", k+1);
		}
		System.out.println();
		//row
		for (int i = 0; i < num.length; i++) {
			System.out.println();
			System.out.printf("\033[1;34mRow #%-5d\033[0m", i + 1);
			//nums
			for (int j = 0; j < num[0].length; j++) {
					if (num[i][j] == max) {
							System.out.printf("\033[1;33m%-8d\033[0m", num[i][j]);
					} else {
							System.out.printf("%-8d", num[i][j]);
					}
			}
			System.out.println();
	}
		System.out.println();
		System.out.printf("\033[1;35m<------------------------------------>\n\033[0m");

	}
	//displayMAX
	static public int displayMax(int[][] num, int row, int col, int max) {
		for(int i=0; i<num.length; i++) {
			for(int j=0; j<num[i].length; j++)
				if(max<num[i][j]) {
					max = num[i][j];
				}
		}
		return max;
	}
	//displayROW-COL
	static public void displayRowCol(int[][] num, int row, int col, int max) {
		for(int i=0; i<num.length; i++) {
			for(int j=0; j<num[i].length; j++)
				if(max==num[i][j]) {
					row = i+1;
					col = j+1;
				}
		}
		System.out.printf("\033[1;33mThe maximum number is: %d\033[0m", max);
		System.out.printf("\n\033[1;33mLocated at Row: %d , Col:%d\033[0m",row,col);
		System.out.println();
	}
}


