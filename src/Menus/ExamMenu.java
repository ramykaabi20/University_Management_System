package Menus;

import Models.Exam;

import java.util.Scanner;

public class ExamMenu {
    public void showMenu() {
        System.out.println("Welcome to Exam Menu:");
        int choice;
        do {
            System.out.println("1- View Exams");
            System.out.println("2- Exit");
            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    Exam exam = new Exam();
                    exam.showExam();
                    break;
                case 2:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        } while (choice != 2);
    }
}
