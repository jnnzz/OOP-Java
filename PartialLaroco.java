/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
class PartialLaroco
{
  static Scanner scanner = new Scanner(System.in);
  static int size;
     static int[] grades;
	 static int sum=0;
    
	public static void main(String[] args) {

	     displaySize();
	     displayGrades();
	     displayAverage();
	     displayMax();
		

	}
	static void displaySize(){
	    System.out.printf("Enter the number of grades you want to compute: ");
		size = scanner.nextInt();
		 grades = new int[size];
	}
	static void displayGrades(){
	    
	    System.out.printf("Enter the grades: \n");
		for(int i=0; i<grades.length; i++){
		    System.out.printf("Grade #%d", i+1);
		    System.out.printf(" = ");
		    grades[i] = scanner.nextInt();
		    sum += grades[i];
		}
		
	}
	static void displayAverage(){
	    double average = (double) sum/size;
		System.out.printf("The average is: %.2f", average);
	}
	static void displayMax(){
	    int temp = grades[0];
	    for(int i=0; i<grades.length; i++){
	        if(temp<grades[i]){
	            temp = grades[i];
	        }
	    }
	    System.out.printf("\nThe max is: "+ temp);
	}
// 	static void displayMin(){
// 	    int min = grades[0];
// 	    for(int i=0; i<grades.length; i++){
// 	        if(temp<grades[i]){
// 	            temp = grades[i];
// 	        }
// 	    }
// 	    System.out.printf("\nThe max is: "+ temp);
// 	}
}


