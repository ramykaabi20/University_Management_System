package Models;

import java.util.List;
import java.util.Scanner;

public class TimeTable {
    private int timeTableId;
    private String timeTableDay;
    private String timeTableTime;
    private String timeTableSubject;
    private String timeTableTeacher;
    private String timeTableGroup;
    private static List<TimeTable> timeTables;

    public TimeTable() {
    }
    public TimeTable(int timeTableId, String timeTableDay, String timeTableTime, String timeTableSubject, String timeTableTeacher, String timeTableGroup) {
        this.timeTableId = timeTableId;
        this.timeTableDay = timeTableDay;
        this.timeTableTime = timeTableTime;
        this.timeTableSubject = timeTableSubject;
        this.timeTableTeacher = timeTableTeacher;
        this.timeTableGroup = timeTableGroup;
    }

    public int getTimeTableId() {
        return timeTableId;
    }

    public String getTimeTableDay() {
        return timeTableDay;
    }

    public String getTimeTableTime() {
        return timeTableTime;
    }

    public String getTimeTableSubject() {
        return timeTableSubject;
    }

    public String getTimeTableTeacher() {
        return timeTableTeacher;
    }

    public String getTimeTableGroup() {
        return timeTableGroup;
    }

    public void showTimeTable() {
        System.out.println(timeTableId + " " + timeTableDay + " " + timeTableTime + " " + timeTableSubject + " " + timeTableTeacher + " " + timeTableGroup);
    }

    public void setTimeTableDay(String timeTableDay) {
        this.timeTableDay = timeTableDay;
    }

    public void setTimeTableTime(String timeTableTime) {
        this.timeTableTime = timeTableTime;
    }

    public void setTimeTableSubject(String timeTableSubject) {
        this.timeTableSubject = timeTableSubject;
    }

    public void setTimeTableTeacher(String timeTableTeacher) {
        this.timeTableTeacher = timeTableTeacher;
    }

    public void setTimeTableGroup(String timeTableGroup) {
        this.timeTableGroup = timeTableGroup;
    }

    public void setTimeTableId(int timeTableId) {
        this.timeTableId = timeTableId;
    }


    public void addTimeTable() {
        System.out.println("Enter TimeTable ID:");
        Scanner scanner = new Scanner(System.in);
        int timeTableId = scanner.nextInt();
        System.out.println("Enter TimeTable Day:");
        String timeTableDay = scanner.next();
        System.out.println("Enter TimeTable Time:");
        String timeTableTime = scanner.next();
        System.out.println("Enter TimeTable Subject:");
        String timeTableSubject = scanner.next();
        System.out.println("Enter TimeTable Teacher:");
        String timeTableTeacher = scanner.next();
        System.out.println("Enter TimeTable Group:");
        String timeTableGroup = scanner.next();
        TimeTable timeTable = new TimeTable(timeTableId, timeTableDay, timeTableTime, timeTableSubject, timeTableTeacher, timeTableGroup);
        timeTables.add(timeTable);
    }

    public void editTimeTable() {
        System.out.println("Enter TimeTable ID:");
        Scanner scanner = new Scanner(System.in);
        int timeTableId = scanner.nextInt();
        System.out.println("Enter TimeTable Day:");
        String timeTableDay = scanner.next();
        System.out.println("Enter TimeTable Time:");
        String timeTableTime = scanner.next();
        System.out.println("Enter TimeTable Subject:");
        String timeTableSubject = scanner.next();
        System.out.println("Enter TimeTable Teacher:");
        String timeTableTeacher = scanner.next();
        System.out.println("Enter TimeTable Group:");
        String timeTableGroup = scanner.next();
        TimeTable timeTable = new TimeTable(timeTableId, timeTableDay, timeTableTime, timeTableSubject, timeTableTeacher, timeTableGroup);
        for (TimeTable timeTable1 : timeTables) {
            if (timeTable1.getTimeTableId() == timeTable.getTimeTableId()) {
                timeTable1.setTimeTableDay(timeTable.getTimeTableDay());
                timeTable1.setTimeTableTime(timeTable.getTimeTableTime());
                timeTable1.setTimeTableSubject(timeTable.getTimeTableSubject());
                timeTable1.setTimeTableTeacher(timeTable.getTimeTableTeacher());
                timeTable1.setTimeTableGroup(timeTable.getTimeTableGroup());
                break;
            }
        }
    }

    public void deleteTimeTable() {
        System.out.println("Enter TimeTable ID:");
        Scanner scanner = new Scanner(System.in);
        int timeTableId = scanner.nextInt();
        for (TimeTable timeTable : timeTables) {
            if (timeTable.getTimeTableId() == timeTableId) {
                timeTables.remove(timeTable);
                break;
            }
        }
    }
}
