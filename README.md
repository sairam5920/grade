# grade

The Student Grade Tracker is a simple Java-based console application designed to manage and analyze student grades. Users can input individual grades, compute the average, find the highest and lowest grades, and view all the recorded grades. The program utilizes an ArrayList to dynamically store grades and provides a menu-driven interface for ease of use. Each operation, such as computing the average or identifying the maximum/minimum grade, is handled with dedicated methods (computeAverage, findHighest, findLowest). This project is great for beginners learning about collections, control structures, loops, methods, and user interaction in Java.

🔹 main(String[] args)
Purpose: Controls the main program flow using a menu.

Scanner scanner = new Scanner(System.in);

Reads user input from the console.

ArrayList<Integer> grades = new ArrayList<>();

Stores the list of student grades dynamically.

int choice;

Stores the user’s menu selection.

System.out.println(...)

Welcomes the user.

do { ... } while (choice != 6);

Starts a loop to show the menu repeatedly until the user exits.

🔹 Menu Options (Inside switch (choice))
Case 1 – Add a Grade

java
Copy
Edit
System.out.print("Enter the grade to add: ");
int grade = scanner.nextInt();
grades.add(grade);
System.out.println("Grade added!");
Takes a grade from the user and adds it to the grades list.

Case 2 – Compute Average

java
Copy
Edit
if (grades.isEmpty()) { ... }
double average = computeAverage(grades);
Calls computeAverage() method to find average of grades.

Case 3 – Find Highest Grade

java
Copy
Edit
int highest = findHighest(grades);
Calls findHighest() to get the max grade.

Case 4 – Find Lowest Grade

java
Copy
Edit
int lowest = findLowest(grades);
Calls findLowest() to get the min grade.

Case 5 – Display Grades

java
Copy
Edit
System.out.println("Student Grades: " + grades);
Displays the entire list of grades.

Case 6 – Exit

java
Copy
Edit
System.out.println("Exiting the program. Goodbye!");
Exits the loop and ends the program.

Default – Invalid Option


System.out.println("Invalid choice. Please try again.");
Handles invalid menu inputs.

🔹 computeAverage(ArrayList<Integer> grades)
Loops through grades, sums them, and returns the average as a double.

🔹 findHighest(ArrayList<Integer> grades)
Loops through the list to find the maximum value.

🔹 findLowest(ArrayList<Integer> grades)
Loops through the list to find the minimum value.

