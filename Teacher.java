public class Teacher {

    // these lines initialize variables
    private String firstName;
    private String lastName;
    private String subject;

    // these are the Getters and Setters (for the teachers first and last name, and subject)
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSubject() {
        return subject;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    // constructor for the teachers
    // contains their first and last name, and subject
    Teacher(String firstName, String lastName, String subject){
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
    }

    // this line prints out the full name and subject for each teacher
    @Override
    public String toString() {
        return "Name: " + this.firstName + " " + this.lastName + " " + ", Subject: " + this.subject;
    }

}




/* Teacher Class

Fields

first name
last name
subject
Methods

Appropriate Constructor
When teacher object printed Name: name Subject: subject  //1 teacher per line
setters and getters
 */