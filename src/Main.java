public class Main {
    public static void main(String[] args) {
        // --- Part 1: Object Creation & Testing ---
        Student s1 = new Student("Alice Johnson", "S101", "CS");
        Student s2 = new Student("Bob Smith", "S102", "SE");
        Student s3 = new Student("Charlie Brown", "S103", "SE");

        // Modify GPA and credits
        s1.updateGPA(2.8);
        s1.addCredits(30);

        s2.updateGPA(3.1);
        s2.addCredits(15);

        s3.updateGPA(2.3);
        s3.addCredits(45);

        // Print student details
        System.out.println("--- Student Details ---");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        // Create Course and add students
        Course javaCourse = new Course("Object-Oriented Programming", "Ms. Aidana", 5);
        javaCourse.addStudent(s1, 0);
        javaCourse.addStudent(s2, 1);
        javaCourse.addStudent(s3, 2);

        // Print Course stats
        System.out.println("\n--- Course Summary ---");
        System.out.println(javaCourse);
        System.out.printf("Course Avg GPA: %.2f%n", javaCourse.courseAverageGPA());
        System.out.println("Highest Credit Student: " + javaCourse.highestCreditStudent().getName());

        // --- Part 2: Array Processing (Static Methods) ---
        System.out.println("\n--- Part 2: Data Processing ---");

        Student[] students = new Student[5];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        students[3] = new Student("Diana Prince", "S104", "CS");
        students[3].updateGPA(3.5);
        students[3].addCredits(60);

        students[4] = new Student("Evan Wright", "S105", "BIT");
        students[4].updateGPA(2.5);
        students[4].addCredits(10);

        System.out.println("Top Student - " + getTopStudent(students).getName());
        System.out.println("Honors Count: " + countHonors(students));
        System.out.println("Total Credits: " + totalCredits(students));
    }

    // Returns the student with the highest GPA
    public static Student getTopStudent(Student[] arr) {
        if (arr == null || arr.length == 0) return null;
        Student top = arr[0];
        for (Student s : arr) {
            if (s != null && s.getGpa() > top.getGpa()) {
                top = s;
            }
        }
        return top;
    }

    // Counts students with GPA >= 3.5
    public static int countHonors(Student[] arr) {
        int count = 0;
        for (Student s : arr) {
            if (s != null && s.isHonors()) {
                count++;
            }
        }
        return count;
    }

    // Sums up total credits of all students
    public static int totalCredits(Student[] arr) {
        int total = 0;
        for (Student s : arr) {
            if (s != null) {
                total += s.getCredits();
            }
        }
        return total;
    }
}