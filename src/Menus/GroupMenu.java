package Menus;
import Models.Group;
import java.util.Scanner;
public class GroupMenu {
    public void showMenu() {
        System.out.println("Welcome to Group Menu:");
        int choice;
        do {
            System.out.println("1- View Groups");
            System.out.println("2- Add Group");
            System.out.println("3- Edit Group");
            System.out.println("4- Delete Group");
            System.out.println("5- Exit");
            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    Group group = new Group();
                    group.showGroup();
                    break;
                case 2:
                    Group group2 = new Group();
                    group2.addGroup();
                    break;
                case 3:
                    Group group3 = new Group();
                    group3.editGroup();
                    break;
                case 4:
                    Group group4 = new Group();
                    group4.deleteGroup();
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        } while (choice != 5);
    }
}
