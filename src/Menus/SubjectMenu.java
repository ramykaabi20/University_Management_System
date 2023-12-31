package Menus;

import Models.Subject;

import java.util.Scanner;

public class SubjectMenu {
    public void showMenu() {
        System.out.println("Welcome to Subject Menu:");
        int choice;
        do {
            System.out.println("1- View Subjects");
            System.out.println("2- Exit");
            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    Subject subject = new Subject();
                    subject.showSubject();
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
