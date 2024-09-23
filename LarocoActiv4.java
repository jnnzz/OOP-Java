/*
******************************************************************************

NAME: JAN LORENZ L. LAROCO
DATE: 9/22/24
DESCRIPTION: Midterm - Lab.Act.#04 - Coding Practice with Enhanced for Loops and 2 Dimensional Arrays in Java

*******************************************************************************/

import java.util.Scanner;

class LarocoActiv4 {
    static Scanner scanner = new Scanner(System.in);
    static int numStudents;
    static int numGrades;

    public static void main(String[] args) {
        String choice = "";
        boolean check = false;

        System.out.println("*-----------Midterm - Lab.Act.#04 - Coding Practice with Enhanced for Loops---------------*");
        System.out.println("          	 *--------------LAROCO, JAN LORENZ L.--------------*");
        System.out.println("");

        do {
            displaySizes(check);

            int[][] studGrades = new int[numStudents][numGrades];

            // Input student grades
            input(studGrades, check);

            // Display unsorted, sorted, and grades
            double[] averages = displaySorting(studGrades, numGrades);

            // Display the student with the highest average
            displayHighest(averages);

            // LOOP TRY AGAIN
            boolean validInput = false;
            while (!validInput) {
                System.out.println();
                System.out.printf("\nDo you want to try again? (Y/N): ");
                choice = scanner.next();
                if (choice.equalsIgnoreCase("Y") || choice.equalsIgnoreCase("N")) {
                    validInput = true;
                } else {
                    System.out.println("Invalid input. Please enter 'Y' or 'N'.");
                }
            }

        } while (choice.equalsIgnoreCase("Y"));
        System.out.println("");
        System.out.printf("Thank you!");
        System.out.println("");

    }

    //-----------------------------------------METHODS-----------------------------------------

    //for sizes
    static void displaySizes(boolean check) {
        do {
            check = false;
            try {
                System.out.printf("Enter the number of students: ");
                numStudents = scanner.nextInt();

                System.out.printf("Enter the number of grades: ");
                numGrades = scanner.nextInt();

                System.out.println();
            } catch (Exception e) {
                System.out.printf("Please enter a valid number. \n");
                check = true;
                scanner.nextLine();
            }

        } while (check);

    }

    //for Input
    static void input(int[][] studGrades, boolean check) {
        for (int i = 0; i < studGrades.length; i++) {
            System.out.printf("Enter grades for Student %d (between 70-100): \n", i + 1);
            for (int j = 0; j < studGrades[i].length; j++) {
                do {
                    check = false;

                    try {
                        System.out.printf("Grade %d: ", j + 1);
                        studGrades[i][j] = scanner.nextInt();
                        if (studGrades[i][j] < 70 || studGrades[i][j] > 100) {
                            System.out.printf("Please enter numbers between 70-100. \n");
                            check = true;
                        }

                    } catch (Exception e) {
                        System.out.printf("Please enter a valid number. \n");
                        check = true;
                        scanner.nextLine();
                    }
                } while (check);
            }
            System.out.println();
        }
    }

    // for Sorting grades and returning averages
    static double[] displaySorting(int[][] studGrades, int numGrades) {
        double[] averages = new double[numStudents];  // Array to store averages
        int studentIndex = 1; // for Counter to show student number

        for (int i = 0; i < studGrades.length; i++) {
            int[] studentGrades = studGrades[i];

            // for Copy of grades for sorting
            int[] sortedGrades = new int[numGrades];
            for (int j = 0; j < numGrades; j++) {
                sortedGrades[j] = studentGrades[j];
            }

            // for Sorting grades
            for (int j = 0; j < numGrades - 1; j++) {
                for (int k = 0; k < numGrades - j - 1; k++) {
                    if (sortedGrades[k] > sortedGrades[k + 1]) {
                        // Swap
                        int temp = sortedGrades[k];
                        sortedGrades[k] = sortedGrades[k + 1];
                        sortedGrades[k + 1] = temp;
                    }
                }
            }

            System.out.printf("----------------------------------------------\n");
            System.out.printf("Student #%d\n", studentIndex);

            //for Display unsorted grades
            System.out.printf("Unsorted grades: ");
            for (int unsorted : studentGrades) {
                System.out.printf("%-5d", unsorted);
            }
            //for Display sorted grades
            System.out.printf("\nSorted grades:   ");
            for (int sorted : sortedGrades) {
                System.out.printf("%-5d", sorted);
            }

            //for Display average
            double average = calculateAverage(sortedGrades, numGrades);
            averages[i] = average;  // for storing
            System.out.printf("\nAverage grade:   %.2f\n\n", average);
            studentIndex++;
        }

        return averages;  
    }

    //for Calculate Average
    static double calculateAverage(int[] grades, int numGrades) {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / numGrades;
    }

    //for highest average
    static void displayHighest(double[] averages) {
        double highestAverage = averages[0];
        int studentWithHighest = 1;  // Start with the first student
        System.out.printf("----------------------------------------------\n");
        System.out.println();

        for (int i = 1; i < averages.length; i++) {
            if (averages[i] > highestAverage) {
                highestAverage = averages[i];
                studentWithHighest = i + 1;  // Adding 1 to match student number (starting from 1)
            }
        }

        System.out.printf("---Congratulations to Student #%d for having the highest average: %.2f! KEEP IT UP!---\n",
                studentWithHighest, highestAverage);
    }
}
