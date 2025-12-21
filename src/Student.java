// Represents a student with personal and academic info
public class Student {
    private String name;
    private String id;
    private String major;
    private double gpa;
    private int credits;

    // Constructor
    public Student(String name, String id, String major) {
        this.name = name;
        this.id = id;
        this.major = major;
        this.gpa = 0.0;
        this.credits = 0;
    }

    // Getters and Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getMajor() { return major; }
    public void setMajor(String major) { this.major = major; }

    public double getGpa() { return gpa; }
    public int getCredits() { return credits; }

    // Adds credits if the amount is positive
    public void addCredits(int c) {
        if (c > 0) {
            this.credits += c;
        }
    }

    // Updates GPA if within valid range (0.0 - 4.0)
    public void updateGPA(double newGPA) {
        if (newGPA >= 0.0 && newGPA <= 4.0) {
            this.gpa = newGPA;
        }
    }

    // Returns true if student has Honors status (GPA >= 3.5)
    public boolean isHonors() {
        return this.gpa >= 3.5;
    }

    @Override
    public String toString() {
        return "Student [Name: " + name + ", ID: " + id + ", Major: " + major +
                ", GPA: " + String.format("%.2f", gpa) + ", Credits: " + credits + "]";
    }
}