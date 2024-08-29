/*
 * Name: JAN LORENZ L. LAROCO
 * Description: Prelim-Lab.Act.#02 - Working with arrays and sorting array elements
 */

import java.util.Scanner;

class activ2 {
  static Scanner scanner = new Scanner(System.in);
  public static void main(String[] args) {
      
      int size;
      int grades[];
    
      size = displaySize();
      grades = new int[size];
      displayGrades(grades);
      displayUnsorted(grades);
      displaySorted(grades);


  }
  static int displaySize(){
    System.out.printf("Enter the number of grades to process: ");
    int sizes = scanner.nextInt();
    return sizes;
  }
  static void displayGrades(int grades[]){
    for(int i=0; i<grades.length; i++){
      System.out.printf("Enter grade #%d: ", i+1);
      grades[i] = scanner.nextInt();
    }
  }
  static void displayUnsorted(int grades[]){
    System.out.printf("Unsorted array: ");
    for(int i=0; i<grades.length; i++){
      System.out.printf("%d", grades[i]);
      System.out.println();
    }
  }
  static void displaySorted(int grades[]){
    System.out.printf("Sorted array: ");
    int sorted = grades[0];
    for (int i = 0; i < grades.length; i++) {
        if(grades[0]<grades[i])
        sorted = grades[i];
        System.out.println(sorted);
    }
  }
  // static void displayMin(){

  // }
  // static void displayMax(){
    
  // }
  // static void displayAverage(){
    
  // }
}
