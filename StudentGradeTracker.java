import java.util.ArrayList;
import java.util.Scanner;

public class StudentGradeTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> grades = new ArrayList<>();
        int choice;

        System.out.println("Welcome to the Student Grade Tracker!");

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Add a student grade");
            System.out.println("2. Compute average grade");
            System.out.println("3. Find highest grade");
            System.out.println("4. Find lowest grade");
            System.out.println("5. Display all grades");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the grade to add: ");
                    int grade = scanner.nextInt();
                    grades.add(grade);
                    System.out.println("Grade added!");
                    break;

                case 2:
                    if (grades.isEmpty()) {
                        System.out.println("No grades available to compute the average.");
                    } else {
                        double average = computeAverage(grades);
                        System.out.printf("The average grade is: %.2f\n", average);
                    }
                    break;

                case 3:
                    if (grades.isEmpty()) {
                        System.out.println("No grades available to find the highest grade.");
                    } else {
                        int highest = findHighest(grades);
                        System.out.println("The highest grade is: " + highest);
                    }
                    break;

                case 4:
                    if (grades.isEmpty()) {
                        System.out.println("No grades available to find the lowest grade.");
                    } else {
                        int lowest = findLowest(grades);
                        System.out.println("The lowest grade is: " + lowest);
                    }
                    break;

                case 5:
                    if (grades.isEmpty()) {
                        System.out.println("No grades available to display.");
                    } else {
                        System.out.println("Student Grades: " + grades);
                    }
                    break;

                case 6:
                    System.out.println("Exiting the program. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 6);

        scanner.close();
    }

    // Method to compute the average grade
    public static double computeAverage(ArrayList<Integer> grades) {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.size();
    }

    // Method to find the highest grade
    public static int findHighest(ArrayList<Integer> grades) {
        int highest = grades.getFirst();
        for (int grade : grades) {
            if (grade > highest) {
                highest = grade;
            }
        }
        return highest;
    }

    // Method to find the lowest grade
    public static int findLowest(ArrayList<Integer> grades) {
        int lowest = grades.getFirst();
        for (int grade : grades) {
            if (grade < lowest) {
                lowest = grade;
            }
        }
        return lowest;
    }
}