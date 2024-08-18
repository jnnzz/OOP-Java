import java.util.Scanner;


public class studentsAVERAGE {
  static Scanner scanner = new Scanner(System.in);

  static int size;
  static String choice;
  static double temp = 0;
  static double[] grades; 

  public static void main(String[] args){
     
    do{
      displayInput();
      displayGrades();
      getAverage();

      System.out.printf("Do you want to compute again? Y/N \n");
      choice = scanner.next();
    } while(choice.equalsIgnoreCase("Y"));

  
  }
  
  static void displayInput(){
    System.out.printf("Enter how many grades you want to compute: ");
    size = scanner.nextInt();
    grades = new double[size];

  }

  static void displayGrades(){
    if(size >=2){
      System.out.printf("Enter the grades: \n");
      for(int i=0; i<grades.length; i++){
        grades[i]= scanner.nextDouble();
      }
      for(int i=0; i<grades.length; i++){
        temp += grades[i];
      }
    } else {
      return ;
    } 
  }

  static void getAverage(){
    double average = temp/size;
    System.out.printf("The average is: %.2f  \n", average);
  
  }
}
