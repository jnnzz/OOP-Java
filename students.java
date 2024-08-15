import java.util.Scanner;

public class students {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    int size;
    String choice;
    
   do{
    System.out.printf("Enter how many grades you want to compute: ");
    size = scanner.nextInt();
    double[] grades = new double[size];

    if(size >=2){
    System.out.printf("Enter the grades: \n");
    for(int i=0; i<grades.length; i++){
      grades[i]= scanner.nextDouble();
    }

    double temp = 0;
    for(int i=0; i<grades.length; i++){
      temp += grades[i];
    }

    double average = temp/size;
    System.out.printf("The average is: %.2f  \n", average);
  } else {
    return;
  } 
  System.out.printf("Do you want to compute again? Y/N \n");
  choice = scanner.next();
}while(choice.equalsIgnoreCase("Y"));

  }
}