import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        // this line of code creates DT Secondary School
        School school = new School("David Thompson Secondary School", "1755 East 55th Avenue", "Nick Akrap");

        // this line initializes the arrays of students, teachers, and subjects.
        String[] studentName = {"Lucie Li", "Flora Jones", "Yolanda Tan", "Brandon Yuen", "Brydan Yuen", "Stephanie Tamkee", "Selena Du", "Alisha Kassam", "Ramya Shah", "Franny Chen"};
        String[] teacherName = {"Danny Borges", "Susan Leong", "Erin Tarbuck"};
        String[] subject = {"Physics", "Math", "English", "Science", "Chemistry", "Biology"};


        /* this line goes through the student list
        separating their first/last names
        assigning a random grade from grade 8 - grade 12 */
        for(String s: studentName){
            school.addStudent(s.split(" ")[0], s.split(" ")[1], (int) (Math.random() * 5 + 8));
        }

        for(String t: teacherName){
            school.addTeacher(t.split(" ")[0], t.split(" ")[1], subject[(int) (Math.random() * 3)]);
        }

        // these lines print the schools information and the full list of teachers and students
        System.out.println(school + "\n");
        System.out.println("Full teachers and students list: \n");
        school.showAllTeachers();
        System.out.println("");
        school.showAllStudents();

        // since we have given the index 0, the first teacher and first two students will be removed from the list
        System.out.println("\nRemoving 1 teacher, and 2 students.");
        school.removeTeacher(0);
        school.removeStudent(0);
        school.removeStudent(0);

        // these lines print the new lists of teachers and students after removal
        System.out.println("The teachers and students list after removal: \n");
        school.showAllTeachers();
        System.out.println("");
        school.showAllStudents();

    }
}

