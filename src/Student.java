public class Student {
    private String name;
    private int studentId;
    private String birthday;
    private String classOfStudent;

    public Student(String name, int studentId, String birthday, String classOfStudent) {
        this.name = name;
        this.studentId = studentId;
        this.birthday = birthday;
        this.classOfStudent = classOfStudent;
    }

    public int getStudentId() {
        return studentId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", studentId=" + studentId +
                ", birthday='" + birthday + '\'' +
                ", classOfStudent='" + classOfStudent + '\'' +
                '}';
    }
}
