/******************************************************************************
 
NAME: JAN LORENZ L. LAROCO
SECTION: BSIT-2B
DATE: AUGUST 19,2024
DESCRIPTION: Prelim-Lab.Act.#01 - Working with Arrays

*******************************************************************************/
import java.util.InputMismatchException;
import java.util.Scanner;

class PartialLaroco
{
  static Scanner scanner = new Scanner(System.in);
  static int size;
  static int[] grades;
	static int sum=0;
  static String choice ="";
    
	public static void main(String[] args) {

    do{
       displayName();
	     displaySize();
	     displayGrades();
	     displayMax();
       displayMin();
       displayAverage();

       System.out.println();
       System.out.printf("\nDo you want to compute again? Y/N");
       choice = scanner.next();
    } while (choice.equalsIgnoreCase("Y"));
		
	}
  /*FUNCTIONS*/

  static void displayName(){
    System.out.printf("------Name: Jan Lorenz L. Laroco-----\n");
    System.out.printf("Prelim-Lab.Act.#01 - Working with Arrays\n");
    System.out.printf("\n");
  }

  //forSIZE
	static void displaySize(){
	    System.out.printf("Enter the number of grades you want to compute: ");
		  size = scanner.nextInt();
		  grades = new int[size];

  }

  //forGRADES
	static void displayGrades() {
    if(size >=2){
    for (int i = 0; i < grades.length; i++) {
        int grade;
        do {
            System.out.printf("Grade #%d: ", i + 1);
            grade = scanner.nextInt();
            if (grade < 70 || grade > 100) {
                System.out.println("Enter a valid grade (between 70 and 100).");
            }
        } while (grade < 70 || grade > 100); 

        grades[i] = grade;
        sum += grade;
    }
  } else {
    System.out.printf("You can only compute 2 and above grades.\n");
    return;
  }
  }

  //forMAX
	static void displayMax(){
	    int max = grades[0];
	    for(int i=0; i<grades.length; i++){ 
	        if(max<grades[i]){
	            max = grades[i];
	        }
	    }
	    System.out.printf("Max: "+ max);
  }

  //forMIN
	static void displayMin(){
	    int min = grades[0];
	    for(int i=0; i<grades.length; i++){
	        if(min>grades[i]){
	            min = grades[i];
	        }
	    }
	    System.out.printf("\nMin: "+ min);
  }

  //forAVERAGE
  static void displayAverage(){
    double average = (double) sum/size;
    System.out.printf("\nThe average is: %.2f", average);
  }

}

