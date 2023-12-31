package Models;

public class Exam {
    private int examId;
    private String examSubject;
    private String examDate;
    private String examTime;
    private String examGroup;
    private String examTeacher;

    public Exam(int examId, String examSubject, String examDate, String examTime, String examGroup, String examTeacher) {
        this.examId = examId;
        this.examSubject = examSubject;
        this.examDate = examDate;
        this.examTime = examTime;
        this.examGroup = examGroup;
        this.examTeacher = examTeacher;
    }

    public Exam() {
    }

    public int getExamId() {
        return examId;
    }

    public String getExamSubject() {
        return examSubject;
    }

    public String getExamDate() {
        return examDate;
    }

    public String getExamTime() {
        return examTime;
    }

    public String getExamGroup() {
        return examGroup;
    }

    public String getExamTeacher() {
        return examTeacher;
    }

    public void showExam() {
        System.out.println(examId + " " + examSubject + " " + examDate + " " + examTime + " " + examGroup + " " + examTeacher);
    }

    public void setExamSubject(String examSubject) {
        this.examSubject = examSubject;
    }

    public void setExamDate(String examDate) {
        this.examDate = examDate;
    }

    public void setExamTime(String examTime) {
        this.examTime = examTime;
    }

    public void setExamGroup(String examGroup) {
        this.examGroup = examGroup;
    }

    public void setExamTeacher(String examTeacher) {
        this.examTeacher = examTeacher;
    }
}
