import java.util.Scanner;

public class reverse {
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      int[] numbers = new int[5];

      System.out.printf("Enter the numbers: ");
      for(int i=0; i<numbers.length; i++){
        numbers[i] = scanner.nextInt();
      }
 
      for(int j=numbers.length-1; j>=0; j--){
        System.out.printf(""+numbers[j]);
      }
  }
}
