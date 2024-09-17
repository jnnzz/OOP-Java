import java.util.Scanner;

class act4 {
  static Scanner scanner = new Scanner(System.in);
  public static void main(String[] args){
 

    System.out.printf("Enter the number of students: ");
    int students = scanner.nextInt();

    System.out.printf("Enter the number of grades: ");
    int numGrades = scanner.nextInt();
    System.out.println();

    int[][] studGrades = new int[students][numGrades];


    //input grades
    for(int i=0; i<studGrades.length; i++){
      System.out.printf("Enter grades for Student %d (between 70-100): \n", i+1);
      for(int j=0; j<studGrades[i].length; j++){
        System.out.printf("Grade %d: ", j+1);
        studGrades[i][j] = scanner.nextInt();
      }
      System.out.println();
    }


    //average
    for( int i=0; i<studGrades.length; i++){
      int sum = 0;

      for(int j=0; j<studGrades[i].length; j++){
        sum += studGrades[i][j];
      }
      double average = (double) sum/numGrades;
      System.out.printf("\nAverage is: %.2f", average);
    }


    
    //sorting
    for(int i=0; i<studGrades.length; i++){
      for(int j=0; j<studGrades[i].length-i-1; j++){

      }
    }
  }
}
