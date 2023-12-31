package Menus;

import java.util.Scanner;

public class AdminMenu {
    public void showMenu() {

        System.out.println("Welcome to Admin Menu:");
        int choice;
        do {
            System.out.println("1- Manage Teachers");
            System.out.println("2- Manage Students");
            System.out.println("3- Manage Groups");
            System.out.println("4- Manage Subjects");
            System.out.println("5- Manage TimeTable");
            System.out.println("6- Manage Exams");
            System.out.println("7- Manage Clubs");
            System.out.println("8- Exit");
            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    TeacherMenu teacherMenu = new TeacherMenu();
                    teacherMenu.showMenu();
                    break;
                case 2:
                    StudentMenu studentMenu = new StudentMenu();
                    studentMenu.showMenu();
                    break;
                case 3:
                    GroupMenu groupMenu = new GroupMenu();
                    groupMenu.showMenu();
                    break;
                case 4:
                    SubjectMenu subjectMenu = new SubjectMenu();
                    subjectMenu.showMenu();
                    break;
                case 5:
                    TimeTableMenu timeTableMenu = new TimeTableMenu();
                    timeTableMenu.showMenu();
                    break;
                case 6:
                    ExamMenu examMenu = new ExamMenu();
                    examMenu.showMenu();
                    break;
                case 7:
                    ClubMenu clubMenu = new ClubMenu();
                    clubMenu.showMenu();
                    break;
                case 8:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        } while (choice != 8);
    }

}
