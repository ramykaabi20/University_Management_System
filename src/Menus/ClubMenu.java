package Menus;

import Models.Club;

import java.util.Scanner;

public class ClubMenu {
    public void showMenu() {
        System.out.println("Welcome to Club Menu:");
        int choice;
        do {
            System.out.println("1- View Clubs");
            System.out.println("2- Add Club");
            System.out.println("3- Edit Club");
            System.out.println("4- Delete Club");
            System.out.println("5- Exit");
            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    Club club = new Club();
                    club.showClub();
                    break;
                case 2:
                    Club club2 = new Club();
                    club2.addClub();
                    break;
                case 3:
                    Club club3 = new Club();
                    club3.editClub();
                    break;
                case 4:
                    Club club4 = new Club();
                    club4.deleteClub();
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
