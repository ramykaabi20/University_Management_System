package Models;

public class Course {
    private int courseId;
    private String courseName;
    private Teacher teacher;
    private Group group;

    public Course(int courseId, String courseName, Teacher teacher, Group group) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.teacher = teacher;
        this.group = group;
    }

    public int getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public Group getGroup() {
        return group;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public void showCourse() {
        System.out.println("Course ID: " + courseId);
        System.out.println("Course Name: " + courseName);
        System.out.println("Teacher ID: " + teacher.getTeacherId());
        System.out.println("Teacher Name: " + teacher.getTeacherName());
        System.out.println("Group ID: " + group.getGroupId());
        System.out.println("Students: ");
        group.showStudents();
    }

    public void showCourse(int courseId) {
        if (this.courseId == courseId) {
            System.out.println("Course ID: " + courseId);
            System.out.println("Course Name: " + courseName);
            System.out.println("Teacher ID: " + teacher.getTeacherId());
            System.out.println("Teacher Name: " + teacher.getTeacherName());
            System.out.println("Group ID: " + group.getGroupId());
            System.out.println("Students: ");
            group.showStudents();
        }
    }

    public void showCourse(String courseName) {
        if (this.courseName.equals(courseName)) {
            System.out.println("Course ID: " + courseId);
            System.out.println("Course Name: " + courseName);
            System.out.println("Teacher ID: " + teacher.getTeacherId());
            System.out.println("Teacher Name: " + teacher.getTeacherName());
            System.out.println("Group ID: " + group.getGroupId());
            System.out.println("Students: ");
            group.showStudents();
        }
    }
}