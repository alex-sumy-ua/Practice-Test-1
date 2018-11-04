package Practice1;

/**
 * Class Teacher
 */
public class Teacher extends Human implements Teaching {

    private Human[] students = new Human[5];    // groupe of 5 students
    private Human   decan;                      // decan of the teacher

    /**
     * Implementation of ToStudy()
     * @param teacher
     */
    @Override
    public void toStudy(Teacher teacher) throws UniversutyException {
        // do nothing
        throw new UniversutyException("A teacher cannot study from anyone!");
    }

    /**
     * Implementation of ToTeach() - set this.students
     * @param students
     */
    @Override
    public void toTeach(Student[] students) {
        this.students   =   students;
    }

    /**
     * dependsOn method of teacher
     */
    public void dependsOn() {
        System.out.println("This teacher depends on the decan " + decan.getName() + ".");
    }

    /**
     * Setter for decan
     * @param decan
     */
    public void setDecan(Human decan) {
        this.decan  =   decan;
    }

    /**
     * teaching or learning method
     */
    public void teachingOrLearning() {
        System.out.println("This human is teaching.");
    }

}
