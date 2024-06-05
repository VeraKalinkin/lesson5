public class Teacher extends User implements Comparable<Teacher>{
    private int teacherId;
    private double teacherRate;

    public Teacher(int teacherId, double teacherRate, String firstName, String secondName, String name) {
        super(firstName, secondName, name);
        this.teacherId = teacherId;
        this.teacherRate = teacherRate;
    }

    public double getTeacherRate() {
        return teacherRate;
    }

    public void setTeacherRate(double teacherRate) {
        this.teacherRate = teacherRate;
    }

    public int getTeacherIdtId() {
        return teacherId;
    }


    @Override
    public String toString() {
        return "Teacher{ " +
                "teacherId = " + teacherId +
                " teacherRate = " + teacherRate +
                super.toString() +
                '}';
    }

    @Override
    public int compareTo(Teacher o) {
        return Integer.compare(teacherId, o.getTeacherIdtId());
    }
}
