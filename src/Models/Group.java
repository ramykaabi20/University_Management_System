package Models;
import java.util.List;
import java.util.Scanner;

public class Group {
    private int groupId;
    private List<Student> students;

    public Group(int groupId, List<Student> students) {
        this.groupId = groupId;
        this.students = students;
    }

    public Group() {
    }

    public int getGroupId() {
        return groupId;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addStudent(int studentId, String studentName) {
        students.add(new Student(studentId, studentName));
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public void removeStudent(int studentId) {
        for (Student student : students) {
            if (student.getStudentId() == studentId) {
                students.remove(student);
                break;
            }
        }
    }
    public void showGroup() {
        System.out.println(groupId);
        for (Student student : students) {
            System.out.println(student.getStudentId() + " " + student.getStudentName());
        }
    }


    public void addGroup() {
        System.out.println("Enter Group Id:");
        Scanner scanner = new Scanner(System.in);
        int groupId = scanner.nextInt();
        System.out.println("Enter Student Id:");
        int studentId = scanner.nextInt();
        System.out.println("Enter Student Name:");
        String studentName = scanner.next();
        addStudent(studentId, studentName);
    }

    public void editGroup() {
        System.out.println("Enter Group Id:");
        Scanner scanner = new Scanner(System.in);
        int groupId = scanner.nextInt();
        System.out.println("Enter Student Id:");
        int studentId = scanner.nextInt();
        System.out.println("Enter Student Name:");
        String studentName = scanner.next();
        removeStudent(studentId);
        addStudent(studentId, studentName);
    }

    public void deleteGroup() {
        System.out.println("Enter Group Id:");
        Scanner scanner = new Scanner(System.in);
        int groupId = scanner.nextInt();
        System.out.println("Enter Student Id:");
        int studentId = scanner.nextInt();
        removeStudent(studentId);
    }

    public void showStudents() {
        for (Student student : students) {
            System.out.println(student.getStudentId() + " " + student.getStudentName());
        }
    }
}
