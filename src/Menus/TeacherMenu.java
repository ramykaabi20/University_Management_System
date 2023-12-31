package Menus;

import Models.Exam;
import Models.TimeTable;

import java.util.Scanner;

public class TeacherMenu {
    public void showMenu() {
        System.out.println("Welcome to Teacher Menu:");
        int choice;
        do {
            System.out.println("1- View TimeTable");
            System.out.println("2- View Exams");
            System.out.println("3- Exit");
            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    TimeTable timeTable = new TimeTable();
                    timeTable.showTimeTable();
                    break;
                case 2:
                    Exam exam = new Exam();
                    exam.showExam();
                    break;
                case 3:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        } while (choice != 3);
    }
}
