package exercises9.business.feature;

import exercises9.business.entity.Student;

public interface IStudentFeature {

    void addStudent(Student student);

    void removeStudent(int deleteId);

    Student findStudentById(int id);

    double getAVGAllStudentScore();

    void sortByScore();

}
