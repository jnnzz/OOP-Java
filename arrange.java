import java.util.Scanner;

public class arrange {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
      int[] numbers = new int[3];
      

    System.out.printf("Enter numbers:");
    for(int i=0; i<numbers.length; i++){
      numbers[i] = scanner.nextInt();
    }

    int min = numbers[0];
    int max = numbers[0];

    for(int i=0; i<numbers.length; i++){
      if(numbers[i]<min){
        min = numbers[i];
      }
    }
    for(int i=0; i<numbers.length; i++){
      if(numbers[i]>max){
        max = numbers[i];
      }
    }
    System.out.printf("The min number is: "+min);
    System.out.printf("The max number is: "+max);
  }
}