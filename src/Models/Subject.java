package Models;

import java.util.List;

public class Subject {
    private int subjectId;
    private String subjectName;
    private Teacher teacher;
    private List<Course> courses;

    public Subject(int subjectId, String subjectName, Teacher teacher, List<Course> courses) {
        this.subjectId = subjectId;
        this.subjectName = subjectName;
        this.teacher = teacher;
        this.courses = courses;
    }

    public Subject() {
    }

    public int getSubjectId() {
        return subjectId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public void showSubject() {
        System.out.println("Subject ID: " + subjectId);
        System.out.println("Subject Name: " + subjectName);
        System.out.println("Teacher ID: " + teacher.getTeacherId());
        System.out.println("Teacher Name: " + teacher.getTeacherName());
        System.out.println("Courses: ");
        for (Course course : courses) {
            course.showCourse();
        }
    }
}
