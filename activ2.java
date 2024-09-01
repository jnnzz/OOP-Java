/*
 * Name: JAN LORENZ L. LAROCO
 * Date: 9/1/24
 * Description: Prelim-Lab.Act.#02 - Working with arrays and sorting array elements
 */

import java.util.Scanner;

class activ2 {
  static Scanner scanner = new Scanner(System.in);
  public static void main(String[] args) {
    String choice = "";
      displayName();
    do{
      int size = 0;
      int grades[];
      
      size = displaySize();
      grades = new int[size];
      displayGrades(grades);
      displayUnsorted(grades);
      displaySorted(grades);
      displayAscending(grades);
      displayDescending(grades);
      displayMin(grades);
      displayMax(grades);
      displayAverage(grades, size);

      System.out.println();
      System.out.println();
      System.out.printf("Do you want to compute again? (Y/N): ");
      choice = scanner.next();
      System.out.println();
      System.out.println();
    }while(choice.equalsIgnoreCase("Y"));
      System.out.printf("Thank you!");
      System.out.println();
      System.out.println();
      scanner.close();
  }

  //FUNCTIONS
  //forName
  static void displayName(){
    System.out.printf("-----Name: JAN LORENZ L. LAROCO-----\n");
    System.out.printf("This program will ask the user the number of grades to process, sorts the array, prints\r\n" + //
            "the minimum , maximum and the average grade");
      System.out.println();
      System.out.println();
  }
  //forSIZE
  static int displaySize(){
    boolean temp;
    int sizes = 0;

    do{
      try {
        temp = false;
        System.out.printf("Enter the number of grades to process: ");
        sizes = scanner.nextInt();
        if(sizes<=1){
          System.out.printf("INVALID NUMBER! Please input numbers 2 and above.\n");
          System.out.println();
          temp=true;
          scanner.nextLine();
        }
          
      } catch (Exception e) {
        System.out.printf("INVALID INPUT! Please input a number.\n");
        System.out.println();
        temp=true;
        scanner.nextLine();
      }
     
    }while(temp);
    return sizes;

  }

  //forGRADES
  static void displayGrades(int grades[]){
    for(int i=0; i<grades.length; i++){
    boolean temp;
    do{
        try{
        temp = false;
            System.out.printf("Enter grade #%d: ", i+1);
            grades[i] = scanner.nextInt();
            if(grades[i]<70 || grades[i]>100){
              System.out.printf("INVALID grade! Valid grade is between 70-100\n");
              temp = true;
              scanner.nextLine();
            }
          
        } catch (Exception e){
          System.out.printf("INVALID INPUT! Please input a number.\n");
          temp = true;
          scanner.nextLine();
        }
        
      }while(temp);
    }
  }
  //forUNSORTED
  static void displayUnsorted(int grades[]){
    System.out.println();
    System.out.println();
    System.out.printf("------------------------------------");
    System.out.println();
    System.out.printf("Unsorted array:");
    for(int i=0; i<grades.length; i++){
      System.out.printf("  "+grades[i]);
    }
  }
  //forSORTED
  static void displaySorted(int grades[]){
    System.out.println();
    System.out.printf("Sorted array:    ");
    for(int i=0; i<grades.length; i++){
      boolean swapped = false;
      for(int j=0; j<grades.length-1; j++){
         if(grades[j] > grades[j+1]){
           int temp = grades[j];
           grades[j] = grades[j+1];
           grades[j+1] = temp;
           swapped = true;
         }
      }
      if (!swapped) break;
     }
     for(int i=0; i<grades.length; i++){
       System.out.printf(grades[i]+"  ");
      
     }
     System.out.println();
     System.out.printf("------------------------------------");
  }
  static void displayAscending(int grades[]){
    System.out.println();
    System.out.printf("Ascending order: ");
    for(int i=0; i<grades.length; i++){
      System.out.printf("  "+ grades[i]);
    }
  }
  static void displayDescending(int grades[]){
    System.out.println();
    System.out.printf("Descending order:");
    for(int i=grades.length-1; i>=0; i--){
      System.out.printf("  " +grades[i]);
    }
    System.out.println();
    System.out.printf("------------------------------------");

  }
  //forMIN
  static void displayMin(int grades[]){
    int temp = grades[0];
    for(int i=0; i<grades.length; i++){
      if(temp > grades[i]){
        temp = grades[i];
      }
    }
    System.out.printf("\nMinimum grade: "+temp);
    System.out.println();
  }
  //forMAX
  static void displayMax(int grades[]){
    int temp = grades[0];
    for(int i=0; i<grades.length; i++){
      if(temp < grades[i]){
        temp = grades[i];
      }
    }
    System.out.printf("Maximum grade: "+temp);
    System.out.println();
    System.out.printf("------------------------------------");

  }
  //forAVERAGE
  static void displayAverage(int grades[], int size){
    int sum = 0;
    double average =0;
    for(int i=0; i<grades.length; i++){
      sum += grades[i];
    }
    average = (double)sum/size;
    System.out.printf("\nAverage: %.2f\n", average);
    System.out.printf("------------------------------------\n");
    System.out.printf("CONGRATULATIONS!");
    System.out.println();
  }
}
