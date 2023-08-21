/* Problem Statement

A university has two types of students — graduate
students and research students. The University
maintains the record of name, age and programme of
every student. For graduate students, additional
information like percentage of marks and stream, like
science, commerce, etc. is recorded; whereas for
research students, additionally, specialization and years
of working experience, if any, is recorded. Each class
has a constructor. The constructor of subclasses makes
a call to constructor of the superclass. Assume that every
constructor has the same number of parameters as the
number of instance variables. In addition, every
subclass has a method that may update the instance
variable values of that subclass. All the classes have a
function display_student_info( ), the subclasses must
override this method of the base class. Every student is
either a graduate student or a research student.
Perform the following tasks for the description given
above using Java :
(i) Create the three classes with proper instance
variables and methods, with suitable inheritance.
(ii) Create at least one parameterised constructor for
each class.
(iii) Implement the display_student_info( ) method in
each class.

*/

class Student {
    String name;
    int age;
    String program;

    public Student(String name, int age, String program) {
        this.name = name;
        this.age = age;
        this.program = program;
    }

    public void displayStudentInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Program: " + program);
    }
}

class GraduateStudent extends Student {
    double percentage;
    String stream;

    public GraduateStudent(String name, int age, String program, double percentage, String stream) {
        super(name, age, program);
        this.percentage = percentage;
        this.stream = stream;
    }

    public void updateInfo(double newPercentage, String newStream) {
        percentage = newPercentage;
        stream = newStream;
    }

    @Override
    public void displayStudentInfo() {
        super.displayStudentInfo();
        System.out.println("Percentage: " + percentage);
        System.out.println("Stream: " + stream);
    }
}

class ResearchStudent extends Student {
    String specialization;
    int yearsOfWorkingExperience;

    public ResearchStudent(String name, int age, String program, String specialization, int yearsOfWorkingExperience) {
        super(name, age, program);
        this.specialization = specialization;
        this.yearsOfWorkingExperience = yearsOfWorkingExperience;
    }

    public void updateInfo(String newSpecialization, int newYearsOfWorkingExperience) {
        specialization = newSpecialization;
        yearsOfWorkingExperience = newYearsOfWorkingExperience;
    }

    @Override
    public void displayStudentInfo() {
        super.displayStudentInfo();
        System.out.println("Specialization: " + specialization);
        System.out.println("Years of Working Experience: " + yearsOfWorkingExperience);
    }
}

public class University {
    public static void main(String[] args) {
        GraduateStudent gradStudent = new GraduateStudent("John Doe", 22, "Masters", 85.5, "Commerce");
        ResearchStudent researchStudent = new ResearchStudent("Jane Smith", 28, "PhD", "Computer Science", 4);

        gradStudent.displayStudentInfo();
        System.out.println();
        researchStudent.displayStudentInfo();
    }
}

