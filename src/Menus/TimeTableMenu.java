package Menus;

import Models.TimeTable;
import java.util.Scanner;

public class TimeTableMenu {
    public void showMenu() {
        System.out.println("Welcome to TimeTable Menu:");
        int choice;
        do {
            System.out.println("1- View TimeTable");
            System.out.println("2- Add TimeTable");
            System.out.println("3- Edit TimeTable");
            System.out.println("4- Delete TimeTable");
            System.out.println("5- Exit");
            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    TimeTable timeTable = new TimeTable();
                    timeTable.showTimeTable();
                    break;
                case 2:
                    TimeTable timeTable2 = new TimeTable();
                    timeTable2.addTimeTable();
                    break;
                case 3:
                    TimeTable timeTable3 = new TimeTable();
                    timeTable3.editTimeTable();
                    break;
                case 4:
                    TimeTable timeTable4 = new TimeTable();
                    timeTable4.deleteTimeTable();
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
