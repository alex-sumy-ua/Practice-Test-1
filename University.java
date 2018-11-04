package Practice1;

import java.util.Scanner;


/**
 * Class University
 */
public class University {

    private Decan       decan       = new Decan();
    private Teacher[]   teachers    = new Teacher[2];
    private Student[]   students    = new Student[10];
    private String      name;                       // name of university

    /**
     * Setter for decan
     * @param decan - human becomes decan
     */
    public void setDecan(Decan decan) {
        this.decan = decan;
    }

    /**
     * Getter for decan
     * @return decan
     */
    public Decan getDecan() {
        return decan;
    }

    /**
     * Setter for teachers
     * @param teachers - human becomes teacher
     */
    public void setTeachers(Teacher[] teachers) {
        this.teachers = teachers;
    }

    /**
     * Getter for teachers
     * @return teachers
     */
    public Teacher[] getTeachers() {
        return teachers;
    }

    /**
     * Setter for students
     * @param students - group of students
     */
    public void setStudents(Student[] students) {
        this.students = students;
    }

    /**
     * Getter for students
     * @return students
     */
    public Student[] getStudents() {
        return students;
    }

    /**
     * Default constructor for university
     */
    public University() {
        name = "Harvard";

        /**
         * Describe decan
         */
        decan.setSex(true);
        decan.setAge(50);
        decan.setName("Decanenko");

        /**
         * Create teacher1
         */
        Teacher   teacher1    =   new Teacher();
        teacher1.setSex(true);
        teacher1.setAge(40);
        teacher1.setName("Teacherenko");
        teachers[0] =   teacher1;

        /**
         * Create teacher2
         */
        Teacher   teacher2    =   new Teacher();
        teacher2.setSex(false);
        teacher2.setAge(35);
        teacher2.setName("Teachingenko");
        teachers[1] =   teacher2;

        decan.toSubjugateTeachers((Teacher[]) new Teacher[]{teacher1, teacher2});   // subjugating of two teachers

        /**
         * Create student-1
         */
        Student student1    =   new Student();
        student1.setName("Student-1");
        student1.setAge(20);
        student1.setSex(true);
        student1.toStudy(teacher1);
        students[0] =   student1;

        /**
         * Create student-2
         */
        Student student2    =   new Student();
        student2.setName("Student-2");
        student2.setAge(21);
        student2.setSex(false);
        student2.toStudy(teacher1);
        students[1] =   student2;

        /**
         * Create student-3
         */
        Student student3    =   new Student();
        student3.setName("Student-3");
        student3.setAge(19);
        student3.setSex(true);
        student3.toStudy(teacher1);
        students[2] =   student3;

        /**
         * Create student-4
         */
        Student student4    =   new Student();
        student4.setName("Student-4");
        student4.setAge(20);
        student4.setSex(true);
        student4.toStudy(teacher1);
        students[3] =   student4;

        /**
         * Create student-5
         */
        Student student5    =   new Student();
        student5.setName("Student-5");
        student5.setAge(18);
        student5.setSex(false);
        student5.toStudy(teacher1);
        students[4] =   student5;

        /**
         * Create student-6
         */
        Student student6    =   new Student();
        student6.setName("Student-6");
        student6.setAge(18);
        student6.setSex(true);
        student6.toStudy(teacher2);
        students[5] =   student6;

        /**
         * Create student-7
         */
        Student student7    =   new Student();
        student7.setName("Student-7");
        student7.setAge(19);
        student7.setSex(false);
        student7.toStudy(teacher2);
        students[6] =   student7;

        /**
         * Create student-8
         */
        Student student8    =   new Student();
        student8.setName("Student-8");
        student8.setAge(20);
        student8.setSex(true);
        student8.toStudy(teacher2);
        students[7] =   student8;

        /**
         * Create student-9
         */
        Student student9    =   new Student();
        student9.setName("Student-9");
        student9.setAge(21);
        student9.setSex(false);
        student9.toStudy(teacher2);
        students[8] =   student9;

        /**
         * Create student-10
         */
        Student student10   =   new Student();
        student10.setName("Student-10");
        student10.setAge(22);
        student10.setSex(true);
        student10.toStudy(teacher2);
        students[9] =   student10;

        teacher1.setDecan(decan);   // set decan
        teacher2.setDecan(decan);   // set decan
        teacher1.toTeach((Student[]) new Student[]{student1, student2, student3, student4, student5});  // set students
        teacher2.toTeach((Student[]) new Student[]{student6, student7, student8, student9, student10}); // set students

    }

    /**
     * Constructor for real university
     */
    public University(String name) {

        /**
         * Input from keyboard university name
         */
        Scanner in = new Scanner(System.in);
        System.out.println("\n ==> Input university name: ");
        this.name     =   in.next().toString();

        /**
         * Describe decan
         */
        System.out.println("\n ==> Input decan name: ");
        decan.setName(in.next().toString());
        System.out.println("\n ==> Input decan age: ");
        decan.setAge(in.nextInt());
        System.out.println("\n ==> Input decan sex, if male, then true, if female, then false: ");
        decan.setSex(in.nextBoolean());

        /**
         * Create teacher1
         */
        Teacher   teacher1    =   new Teacher();
        System.out.println("\n ==> Input teacher1 name: ");
        teacher1.setName(in.next().toString());
        System.out.println("\n ==> Input teacher1 age: ");
        teacher1.setAge(in.nextInt());
        System.out.println("\n ==> Input teacher1 sex, if male, then true, if female, then false: ");
        teacher1.setSex(in.nextBoolean());
        teachers[0] =   teacher1;

        /**
         * Create teacher2
         */
        Teacher   teacher2    =   new Teacher();
        System.out.println("\n ==> Input teacher2 name: ");
        teacher2.setName(in.next().toString());
        System.out.println("\n ==> Input teacher2 age: ");
        teacher2.setAge(in.nextInt());
        System.out.println("\n ==> Input teacher2 sex, if male, then true, if female, then false: ");
        teacher2.setSex(in.nextBoolean());
        teachers[0] =   teacher2;

        decan.toSubjugateTeachers((Teacher[]) new Teacher[]{teacher1, teacher2});   // subjugating of two teachers

        /**
         * Create student-1
         */
        Student student1    =   new Student();
        System.out.println("\n ==> Input student1 name: ");
        student1.setName(in.next().toString());
        System.out.println("\n ==> Input student1 age: ");
        student1.setAge(in.nextInt());
        System.out.println("\n ==> Input student1 sex, if male, then true, if female, then false: ");
        student1.setSex(in.nextBoolean());
        student1.toStudy(teacher1);
        students[0] =   student1;

        /**
         * Create student-2
         */
        Student student2    =   new Student();
        System.out.println("\n ==> Input student2 name: ");
        student2.setName(in.next().toString());
        System.out.println("\n ==> Input student2 age: ");
        student2.setAge(in.nextInt());
        System.out.println("\n ==> Input student2 sex, if male, then true, if female, then false: ");
        student2.setSex(in.nextBoolean());
        student2.toStudy(teacher1);
        students[1] =   student2;

        /**
         * Create student-3
         */
        Student student3    =   new Student();
        System.out.println("\n ==> Input student3 name: ");
        student3.setName(in.next().toString());
        System.out.println("\n ==> Input student3 age: ");
        student3.setAge(in.nextInt());
        System.out.println("\n ==> Input student3 sex, if male, then true, if female, then false: ");
        student3.setSex(in.nextBoolean());
        student3.toStudy(teacher1);
        students[2] =   student3;

        /**
         * Create student-4
         */
        Student student4    =   new Student();
        System.out.println("\n ==> Input student4 name: ");
        student4.setName(in.next().toString());
        System.out.println("\n ==> Input student4 age: ");
        student4.setAge(in.nextInt());
        System.out.println("\n ==> Input student4 sex, if male, then true, if female, then false: ");
        student4.setSex(in.nextBoolean());
        student4.toStudy(teacher1);
        students[3] =   student4;

        /**
         * Create student-5
         */
        Student student5    =   new Student();
        System.out.println("\n ==> Input student5 name: ");
        student5.setName(in.next().toString());
        System.out.println("\n ==> Input student5 age: ");
        student5.setAge(in.nextInt());
        System.out.println("\n ==> Input student5 sex, if male, then true, if female, then false: ");
        student5.setSex(in.nextBoolean());
        student5.toStudy(teacher1);
        students[4] =   student5;

        /**
         * Create student-6
         */
        Student student6    =   new Student();
        System.out.println("\n ==> Input student6 name: ");
        student6.setName(in.next().toString());
        System.out.println("\n ==> Input student6 age: ");
        student6.setAge(in.nextInt());
        System.out.println("\n ==> Input student6 sex, if male, then true, if female, then false: ");
        student6.setSex(in.nextBoolean());
        student6.toStudy(teacher2);
        students[5] =   student6;

        /**
         * Create student-7
         */
        Student student7    =   new Student();
        System.out.println("\n ==> Input student7 name: ");
        student7.setName(in.next().toString());
        System.out.println("\n ==> Input student7 age: ");
        student7.setAge(in.nextInt());
        System.out.println("\n ==> Input student7 sex, if male, then true, if female, then false: ");
        student7.setSex(in.nextBoolean());
        student7.toStudy(teacher2);
        students[6] =   student7;

        /**
         * Create student-8
         */
        Student student8    =   new Student();
        System.out.println("\n ==> Input student8 name: ");
        student8.setName(in.next().toString());
        System.out.println("\n ==> Input student8 age: ");
        student8.setAge(in.nextInt());
        System.out.println("\n ==> Input student8 sex, if male, then true, if female, then false: ");
        student8.setSex(in.nextBoolean());
        student8.toStudy(teacher2);
        students[7] =   student8;

        /**
         * Create student-9
         */
        Student student9    =   new Student();
        System.out.println("\n ==> Input student9 name: ");
        student9.setName(in.next().toString());
        System.out.println("\n ==> Input student9 age: ");
        student9.setAge(in.nextInt());
        System.out.println("\n ==> Input student9 sex, if male, then true, if female, then false: ");
        student9.setSex(in.nextBoolean());
        student9.toStudy(teacher2);
        students[8] =   student9;

        /**
         * Create student-10
         */
        Student student10   =   new Student();
        System.out.println("\n ==> Input student10 name: ");
        student10.setName(in.next().toString());
        System.out.println("\n ==> Input student10 age: ");
        student10.setAge(in.nextInt());
        System.out.println("\n ==> Input student10 sex, if male, then true, if female, then false: ");
        student10.setSex(in.nextBoolean());
        student10.toStudy(teacher2);
        students[9] =   student10;

        teacher1.setDecan(decan);   // set decan
        teacher2.setDecan(decan);   // set decan
        teacher1.toTeach((Student[]) new Student[]{student1, student2, student3, student4, student5});  // set students
        teacher2.toTeach((Student[]) new Student[]{student6, student7, student8, student9, student10}); // set students

    }

    /**
     * Run program
     * @param args - necessary way of declaring method main
     */
    public static void main(String[] args) {
        University university1   =   new University();   // default university

        University university2   =   new University("SUMDU");   // SUMDU university

        System.out.println(university1.name);

        System.out.println("***********************");

        System.out.println("Decan " + university1.decan.getName());
        System.out.println(university1.decan.getSex());
        System.out.println(university1.decan.getAge());
        university1.decan.teachingOrLearning();
        university1.decan.dependsOn();

        System.out.println("***********************");

        System.out.println("Teacher-1 " + university1.teachers[0].getName());
        System.out.println(university1.teachers[0].getSex());
        System.out.println(university1.teachers[0].getAge());
        university1.teachers[0].teachingOrLearning();
        university1.teachers[0].dependsOn();

        System.out.println("***********************");

        System.out.println("Teacher-2 " + university1.teachers[1].getName());
        System.out.println(university1.teachers[1].getSex());
        System.out.println(university1.teachers[1].getAge());
        university1.teachers[1].teachingOrLearning();
        university1.teachers[1].dependsOn();

        System.out.println("***********************");

        System.out.println("Student 1 " + university1.students[0].getName());
        System.out.println(university1.students[0].getSex());
        System.out.println(university1.students[0].getAge());
        university1.students[0].teachingOrLearning();
        university1.students[0].dependsOn();

        System.out.println("***********************");
        System.out.println("***********************");

        System.out.println(university2.name);

        System.out.println("***********************");

        System.out.println("Decan " + university2.decan.getName());
        System.out.println(university2.decan.getSex());
        System.out.println(university2.decan.getAge());
        university2.decan.teachingOrLearning();
        university2.decan.dependsOn();

        System.out.println("***********************");

        System.out.println("Teacher-1 " + university2.teachers[0].getName());
        System.out.println(university2.teachers[0].getSex());
        System.out.println(university2.teachers[0].getAge());
        university2.teachers[0].teachingOrLearning();
        university2.teachers[0].dependsOn();

        System.out.println("***********************");

        System.out.println("Teacher-2 " + university2.teachers[1].getName());
        System.out.println(university2.teachers[1].getSex());
        System.out.println(university2.teachers[1].getAge());
        university2.teachers[1].teachingOrLearning();
        university2.teachers[1].dependsOn();

        System.out.println("***********************");

        System.out.println("Student 1 " + university2.students[0].getName());
        System.out.println(university2.students[0].getSex());
        System.out.println(university2.students[0].getAge());
        university2.students[0].teachingOrLearning();
        university2.students[0].dependsOn();

        System.out.println("***********************");

        // go on...
    }
}
