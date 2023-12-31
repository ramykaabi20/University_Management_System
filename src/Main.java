import java.util.Scanner;
import Models.*;
import Menus.*;
public class Main{
    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("Welcome To INSAT Management System:");
            System.out.println("Please choose your role:");
            System.out.println("1- Admin");
            System.out.println("2- Teacher");
            System.out.println("3- Student");
            System.out.println("4- Exit");
            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    AdminMenu adminMenu = new AdminMenu();
                    adminMenu.showMenu();
                    break;
                case 2:
                    TeacherMenu teacherMenu = new TeacherMenu();
                    teacherMenu.showMenu();
                    break;
                case 3:
                    StudentMenu studentMenu = new StudentMenu();
                    studentMenu.showMenu();
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        } while (choice != 4);
    }
}