package University;

public class Subject {
    private String subjectId, subjectName;
    private double credit;

    public Subject(String subjectId, String subjectName, double credit) {
        this.subjectId = subjectId;
        this.subjectName = subjectName;
        this.credit = credit;
    }

    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }
    public String getSubjectName() {
        return subjectName;
    }
    public void setCredit(double credit) {
        this.credit = credit;
    }
    public double getCredit() {
        return credit;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "subjectId='" + subjectId + '\'' +
                ", subjectName='" + subjectName + '\'' +
                ", credit=" + credit +
                '}';
    }
}
