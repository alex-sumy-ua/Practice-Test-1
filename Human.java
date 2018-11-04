package Practice1;

/**
 * Class Human
 */
public class Human {

    private boolean sex;    // female - false; male - true
    private int     age;    // how old is he or she
    private String  name;   // name of the human

    /**
     * Default constructor
     */
    public Human() {
        sex     =   true;       // male
        age     =   15;         // a very yang human
        name    =   "Petrenko"; // a very common last name
    }

    /**
     * Consrtuctor with parameters
     * @param sex
     * @param age
     * @param name
     */
    public Human(boolean sex, int age, String name) {
        this.sex    =   sex;
        this.age    =   age;
        this.name   =   name;
    }

    /**
     * Setter for sex
     * @param sex
     */
    public void setSex(boolean sex) {
        this.sex    =   sex;
    }

    /**
     * Getter for sex - String value!!!
     */
    public String getSex() {
        if (sex) {
            return "male";
        } else {
            return "female";
        }
    }

    /**
     * Setter for age
     * @param age
     */
    public void setAge(int age) {
        this.age    =   age;
    }

    /**
     * Getter for age
     * @return
     */
    public int getAge() {
        return age;
    }

    /**
     * Setter for name
     * @param name
     */
    public void setName(String name) {
        this.name    =   name;
    }

    /**
     * Getter for name
     * @name
     */
    public String getName() {
        return name;
    }

}
