public class AverageGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of students:");
        int numStudents = scanner.nextInt();

        int[] grades = new int[numStudents];

        // Input grades
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter grade for student " + (i + 1) + ":");
            grades[i] = scanner.nextInt();
        }

        // Calculate average
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }

        double average = (double) sum / numStudents;

        // Display result
        System.out.println("The average grade is: " + average);

        scanner.close();
    }
}
