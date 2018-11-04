package Practice1;

/**
 * Class Decan
 */
public class Decan extends Human {

    private Human[] teachers = new Teacher[2];   // group of 2 teachers

    /**
     * Method "To Subjugate Two Teachers"
     * @param teachers
     */
    public void toSubjugateTeachers(Teacher[] teachers) {
        this.teachers   =   teachers;
    }

    /**
     * dependsOn method of teacher (Getter for decan)
     */
    public void dependsOn() {
        System.out.println("Decan depends on none!");
    }

    /**
     * teaching or learning method
     */
    public void teachingOrLearning() {
        System.out.println("This human is neither teaching nor studying!");
    }

}
