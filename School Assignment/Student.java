public class Student {

    // these lines initialize variables
    private String firstName;
    private String lastName;
    private int grade;
    private int studentNumber;
    private static int sID = 0;

    public String getFirstName() {
        return firstName;
    }

    // these are the Getters and Setters (for the student's first and last name, grade, and student number)
    public String getLastName() {
        return lastName;
    }

    public int getGrade() {
        return grade;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    // this is a constructor for the student
    // contains their first and last name, grade, and ID which is incremented by 1 each new student created
    Student(String firstName, String lastName, int grade){
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
        this.studentNumber = ++sID;
    }

    // this line prints out the full name, grade, and ID associated to the student
    @Override
    public String toString() {
        return "Name: " + firstName + " " + lastName + " " + ", Grade: " + grade + " " + ", Student Number: " + studentNumber;
    }
}




/* Student Class

Fields

        first name
        last name
        grade
        unique student number created on construction
        Methods

        getters and setters
        Appropriate Constructor
        When printed "Name: name Grade: grade  Student Number: number" //1 student per line
 */