package Practice1;

/**
 * Class Student
 */
public class Student extends Human implements Teaching {

    private Teacher   teacher;    // teacher of the student

    /**
     * Implementation of ToStudy() - set this.teacher
     * @param teacher
     */
    @Override
    public void toStudy(Teacher teacher) {
        this.teacher    =   teacher;
    }

    /**
     * Implementation of ToTeach()
     * @param students
     */
    @Override
    public void toTeach(Student[] students) throws UniversutyException {
        // do nothing
        throw new UniversutyException("The student cannot teach anyone!");
    }

    /**
     * dependsOn method of student
     */
    public void dependsOn() {
        System.out.println("This student depends on the teacher " + teacher.getName() + ".");
    }

    /**
     * teaching or learning method
     */
    public void teachingOrLearning() {
        System.out.println("This human is studying.");
    }

}
