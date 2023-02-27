import java.util.ArrayList;

public class School {

    public String name;
    private String address;
    public String principal;

    public String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    }

    public String getPrincipal(){
        return principal;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public void setPrincipal(String principal){
        this.principal = principal;
    }

    // constructor for the school
    // contains the school's name, address, and principals name
    School(String name, String address, String principal){
        this.name = name;
        this.address = address;
        this.principal = principal;
    }

    @Override
    public String toString() {
        return "School name: " + name + ", Address: " + address + ", Principal: " + principal;
    }

    ArrayList<Teacher> teachers = new ArrayList<>();
    ArrayList<Student> students = new ArrayList<>();


    // list of teachers and students
    public ArrayList<Teacher> addTeacher(String firstName, String lastName, String subject){
        Teacher teacher = new Teacher(firstName, lastName, subject);
        teachers.add(teacher);
        return teachers;
    }

    public ArrayList<Student> addStudent(String firstName, String lastName, int grade){
        Student s = new Student(firstName, lastName, grade);
        students.add(s);
        return students;
    }

    public ArrayList<Teacher> removeTeacher(int index){
        teachers.remove(index);
        return teachers;
    }

    public ArrayList<Student> removeStudent(int index){
        students.remove(index);
        return students;
    }

    public void showAllTeachers(){
        System.out.println("Teachers: ");
        for(Teacher i: teachers){
            System.out.println(i);
        }
    }

    public void showAllStudents(){
        System.out.println("Students: ");
        for(Student i: students){
            System.out.println(i);
        }
    }

}



/*
School Class

Fields

Holds an ArrayList of Teachers
Holds an ArrayList of students
3 fields of your choosing (example name) with setters and getter
Methods

Add a teacher to list
Add a student to list
Delete teacher from list
Delete student from list
Show all Teachers
Show all Students
Appropriate constructor
 */