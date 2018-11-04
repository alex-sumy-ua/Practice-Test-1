package Practice1;

import java.io.IOException;

/**
 * Has got two methods: ToTeach() for teachers and ToStudy() for students
 */
public interface Teaching {
    void toTeach(Student[] students) throws UniversutyException;
    void toStudy(Teacher teacher) throws UniversutyException;
}
