class Student {

    private int studentId;
    private String name;
    private int age;
    private char grade;

    static int id = 1;

    Student(String name, int age, char grade) {
        this.studentId = id++;
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // Getters
    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGrade() {
        return grade;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }
}


class GraduateStudent extends Student {

    private String researchTopic;

    GraduateStudent(String name, int age, char grade, String researchTopic) {

        super(name, age, grade);

        this.researchTopic = researchTopic;
    }

    public String getResearchTopic() {
        return researchTopic;
    }

    public void setResearchTopic(String researchTopic) {
        this.researchTopic = researchTopic;
    }
}


public class Main {

    public static void main(String[] args) {

        Student s1 = new Student("Tahmed", 23, 'A');

        Student s2 = new Student("Rahim", 22, 'B');

        GraduateStudent g1 =
            new GraduateStudent("Karim", 25, 'A', "Artificial Intelligence");


        System.out.println("Student 1");

        System.out.println(s1.getStudentId());
        System.out.println(s1.getName());
        System.out.println(s1.getAge());
        System.out.println(s1.getGrade());


        System.out.println("\nStudent 2");

        System.out.println(s2.getStudentId());
        System.out.println(s2.getName());
        System.out.println(s2.getAge());
        System.out.println(s2.getGrade());


        System.out.println("\nGraduate Student");

        System.out.println(g1.getStudentId());
        System.out.println(g1.getName());
        System.out.println(g1.getAge());
        System.out.println(g1.getGrade());
        System.out.println(g1.getResearchTopic());


        // Update Student
        s1.setName("Tahmed Ahmed");
        s1.setAge(24);
        s1.setGrade('A');


        // Update Research Topic
        g1.setResearchTopic("Machine Learning");


        System.out.println("\nAfter Update");

        System.out.println(s1.getName());
        System.out.println(s1.getAge());
        System.out.println(s1.getGrade());

        System.out.println(g1.getResearchTopic());
    }
}
