package University;

public class Exam {
    private String examId, examName;
    private double passMark;
    private Subject subject;

    public Exam(String examId, String examName, double passMark, Subject subject) {
        this.examId = examId;
        this.examName = examName;
        this.passMark = passMark;
        this.subject = subject;
    }

    public String getExamId() {
        return examId;
    }
    public void setExamName(String examName) {
        this.examName = examName;
    }
    public String getExamName() {
        return examName;
    }
    public void stePassMark(double passMark) {
        this.passMark = passMark;
    }
    public double getPassMark() {
        return passMark;
    }
    public void setSubject(Subject subject) {
        this.subject = subject;
    }
    public Subject getSubject() {
        return subject;
    }

    @Override
    public String toString() {
        return "Exam{" +
                "examId='" + examId + '\'' +
                ", examName='" + examName + '\'' +
                ", passMark=" + passMark +
                ", subject=" + subject +
                '}';
    }
}
