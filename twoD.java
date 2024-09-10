import java.util.Scanner;


public class twoD {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
     

        System.out.printf("Enter the number of students: ");
        int num = scanner.nextInt();

        System.out.printf("Enter the number of grades: ");
        int grades = scanner.nextInt();

        int[][] numArr = new int[num][grades];
        String[] name = new String[num];


      for(int i=0; i<numArr.length; i++){
        System.out.printf("Enter the name of the student #%d", i+1);
        name[i] = scanner.next();
        for(int j=0; j<numArr[i].length; j++){
          System.out.printf("Enter the grade #%d:", j+1);
          numArr[i][j] = scanner.nextInt();
        }
        scanner.nextLine();
      }

      for(int i=0; i<numArr.length; i++){
        System.out.printf("Grades for %s\n", name[i]);
        for(int j=0; j<numArr[i].length; j++){
          System.out.printf("Grades: %d\n", numArr[i][j]);
        }
      }

      
    }
}
