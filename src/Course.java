public class Course {
    private String courseName;
    private String instructor;
    private Student[] students;

    // Constructor
    public Course(String courseName, String instructor, int size) {
        this.courseName = courseName;
        this.instructor = instructor;
        this.students = new Student[size];
    }

    // Adds a student to the array
    public void addStudent(Student s, int index) {
        if (index >= 0 && index < students.length) {
            students[index] = s;
        } else {
            System.out.println("Error: Index out of bounds");
        }
    }

    // Calculates the average GPA
    public double courseAverageGPA() {
        double total = 0.0;
        int count = 0;
        for (Student s : students) {
            if (s != null) {
                total += s.getGpa();
                count++;
            }
        }
        return count == 0 ? 0.0 : total / count;
    }

    // Finds the student with the highest credits
    public Student highestCreditStudent() {
        Student maxStudent = null;
        int maxCredits = -1;

        for (Student s : students) {
            if (s != null && s.getCredits() > maxCredits) {
                maxCredits = s.getCredits();
                maxStudent = s;
            }
        }
        return maxStudent;
    }

    @Override
    public String toString() {
        int enrolled = 0;
        for (Student s : students) {
            if (s != null) enrolled++;
        }
        return "Course: " + courseName + " | Instructor: " + instructor +
                " | Enrolled: " + enrolled + "/" + students.length;
    }
}