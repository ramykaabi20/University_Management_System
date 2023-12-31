package Models;

import java.util.List;
import java.util.Scanner;

public class Club {
    private int clubId;
    private String clubName;
    private String clubDescription;
    private List<Student> students;
    private String clubPresident;

    public Club(int clubId, String clubName, String clubDescription, List<Student> students, String clubPresident) {
        this.clubId = clubId;
        this.clubName = clubName;
        this.clubDescription = clubDescription;
        this.students = students;
        this.clubPresident = clubPresident;
    }

    public Club() {
    }

    public int getClubId() {
        return clubId;
    }

    public String getClubName() {
        return clubName;
    }

    public String getClubDescription() {
        return clubDescription;
    }

    public List<Student> getStudents() {
        return students;
    }

    public String getClubPresident() {
        return clubPresident;
    }

    public void setClubId(int clubId) {
        this.clubId = clubId;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    public void setClubDescription(String clubDescription) {
        this.clubDescription = clubDescription;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void setClubPresident(String clubPresident) {
        this.clubPresident = clubPresident;
    }

    public void showClub() {
        System.out.println("Club ID: " + clubId);
        System.out.println("Club Name: " + clubName);
        System.out.println("Club Description: " + clubDescription);
        System.out.println("Club President: " + clubPresident);
        System.out.println("Students: ");
        for (Student student : students) {
            System.out.println(student.getStudentId() + " " + student.getStudentName());
        }
    }

    public void addClub() {
        System.out.println("Enter Club Id:");
        Scanner scanner = new Scanner(System.in);
        int clubId = scanner.nextInt();
        System.out.println("Enter Club Name:");
        String clubName = scanner.next();
        System.out.println("Enter Club Description:");
        String clubDescription = scanner.next();
        System.out.println("Enter Club President:");
        String clubPresident = scanner.next();
        System.out.println("Enter Student Id:");
        int studentId = scanner.nextInt();
        System.out.println("Enter Student Name:");
        String studentName = scanner.next();
        addStudent(studentId, studentName);
    }

    private void addStudent(int studentId, String studentName) {
        students.add(new Student(studentId, studentName));
    }

    public void editClub() {
        System.out.println("Enter Club Id:");
        Scanner scanner = new Scanner(System.in);
        int clubId = scanner.nextInt();
        System.out.println("Enter Club Name:");
        String clubName = scanner.next();
        System.out.println("Enter Club Description:");
        String clubDescription = scanner.next();
        System.out.println("Enter Club President:");
        String clubPresident = scanner.next();
        System.out.println("Enter Student Id:");
        int studentId = scanner.nextInt();
        System.out.println("Enter Student Name:");
        String studentName = scanner.next();
        editStudent(studentId, studentName);
    }

    private void editStudent(int studentId, String studentName) {
        for (Student student : students) {
            if (student.getStudentId() == studentId) {
                student.setStudentName(studentName);
                break;
            }
        }
    }

    public void deleteClub() {
        System.out.println("Enter Club Id:");
        Scanner scanner = new Scanner(System.in);
        int clubId = scanner.nextInt();
        System.out.println("Enter Student Id:");
        int studentId = scanner.nextInt();
        deleteStudent(studentId);
    }

    private void deleteStudent(int studentId) {
        for (Student student : students) {
            if (student.getStudentId() == studentId) {
                students.remove(student);
                break;
            }
        }
    }
}
