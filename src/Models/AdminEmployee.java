package Models;

import java.util.List;

public class AdminEmployee {
    private int adminEmployeeId;
    private String adminEmployeeName;

    private List<TimeTable> timeTables;

    public AdminEmployee(int adminEmployeeId, String adminEmployeeName) {
        this.adminEmployeeId = adminEmployeeId;
        this.adminEmployeeName = adminEmployeeName;
    }

    public int getAdminEmployeeId() {
        return adminEmployeeId;
    }

    public String getAdminEmployeeName() {
        return adminEmployeeName;
    }

    public void showAdminEmployee() {
        System.out.println(adminEmployeeId + " " + adminEmployeeName);
    }

    public void setTimeTables(List<TimeTable> timeTables) {
        this.timeTables = timeTables;
    }

    public void showTimeTables() {
        for (TimeTable timeTable : timeTables) {
            timeTable.showTimeTable();
        }
    }

    public void addTimeTable(TimeTable timeTable) {
        timeTables.add(timeTable);
    }

    public void addTimeTable(int timeTableId, String timeTableDay, String timeTableTime, String timeTableSubject, String timeTableTeacher, String timeTableGroup) {
        timeTables.add(new TimeTable(timeTableId, timeTableDay, timeTableTime, timeTableSubject, timeTableTeacher, timeTableGroup));
    }

    public void removeTimeTable(TimeTable timeTable) {
        timeTables.remove(timeTable);
    }

    public void removeTimeTable(int timeTableId) {
        for (TimeTable timeTable : timeTables) {
            if (timeTable.getTimeTableId() == timeTableId) {
                timeTables.remove(timeTable);
                break;
            }
        }
    }

    public void updateTimeTable(TimeTable timeTable) {
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

    public void updateTimeTable(int timeTableId, String timeTableDay, String timeTableTime, String timeTableSubject, String timeTableTeacher, String timeTableGroup) {
        for (TimeTable timeTable : timeTables) {
            if (timeTable.getTimeTableId() == timeTableId) {
                timeTable.setTimeTableDay(timeTableDay);
                timeTable.setTimeTableTime(timeTableTime);
                timeTable.setTimeTableSubject(timeTableSubject);
                timeTable.setTimeTableTeacher(timeTableTeacher);
                timeTable.setTimeTableGroup(timeTableGroup);
                break;
            }
        }
    }

    public void showTimeTable(int timeTableId) {
        for (TimeTable timeTable : timeTables) {
            if (timeTable.getTimeTableId() == timeTableId) {
                timeTable.showTimeTable();
                break;
            }
        }
    }

    public void showTimeTable(String timeTableDay) {
        for (TimeTable timeTable : timeTables) {
            if (timeTable.getTimeTableDay().equals(timeTableDay)) {
                timeTable.showTimeTable();
            }
        }
    }

    public void showTimeTable(String timeTableDay, String timeTableTime) {
        for (TimeTable timeTable : timeTables) {
            if (timeTable.getTimeTableDay().equals(timeTableDay) && timeTable.getTimeTableTime().equals(timeTableTime)) {
                timeTable.showTimeTable();
            }
        }
    }

    public void showTimeTable(String timeTableDay, String timeTableTime, String timeTableSubject) {
        for (TimeTable timeTable : timeTables) {
            if (timeTable.getTimeTableDay().equals(timeTableDay) && timeTable.getTimeTableTime().equals(timeTableTime) && timeTable.getTimeTableSubject().equals(timeTableSubject)) {
                timeTable.showTimeTable();
            }
        }
    }

    public void showTimeTable(String timeTableDay, String timeTableTime, String timeTableSubject, String timeTableTeacher) {
        for (TimeTable timeTable : timeTables) {
            if (timeTable.getTimeTableDay().equals(timeTableDay) && timeTable.getTimeTableTime().equals(timeTableTime) && timeTable.getTimeTableSubject().equals(timeTableSubject) && timeTable.getTimeTableTeacher().equals(timeTableTeacher)) {
                timeTable.showTimeTable();
            }
        }
    }

    public void showTimeTable(String timeTableDay, String timeTableTime, String timeTableSubject, String timeTableTeacher, String timeTableGroup) {
        for (TimeTable timeTable : timeTables) {
            if (timeTable.getTimeTableDay().equals(timeTableDay) && timeTable.getTimeTableTime().equals(timeTableTime) && timeTable.getTimeTableSubject().equals(timeTableSubject) && timeTable.getTimeTableTeacher().equals(timeTableTeacher) && timeTable.getTimeTableGroup().equals(timeTableGroup)) {
                timeTable.showTimeTable();
            }
        }
    }

    public void showTimeTable(String timeTableDay, String timeTableTime, String timeTableSubject, String timeTableTeacher, String timeTableGroup, int timeTableId) {
        for (TimeTable timeTable : timeTables) {
            if (timeTable.getTimeTableDay().equals(timeTableDay) && timeTable.getTimeTableTime().equals(timeTableTime) && timeTable.getTimeTableSubject().equals(timeTableSubject) && timeTable.getTimeTableTeacher().equals(timeTableTeacher) && timeTable.getTimeTableGroup().equals(timeTableGroup) && timeTable.getTimeTableId() == timeTableId) {
                timeTable.showTimeTable();
            }
        }
    }


}
