public class Student extends Person {
    // instance variables
    private String studentId;
    private String major;

    // constructor
    public Student(String firstName, String lastName, int age, String address, String studentId, String major) {
        super(firstName, lastName, age, address);

        this.studentId = studentId;
        this.major = major;
    }

    // method overriding
    @Override void getDetails() {
        super.getDetails();
        System.out.println("Student ID: " + this.studentId);
        System.out.println("Major: " + this.major);
    }

    // method overloading
    void getDetails(boolean includeMajor) {
        super.getDetails();
        System.out.println("Student ID: " + this.studentId);

        if (includeMajor) {
            System.out.println("Major: " + this.major);
        }
    }

    // getters and setters
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}
