public class Main {
    public static void main(String[] args) {
        Class mathClass = new Math();
        Class italianClass = new Italian();

        Person teacher = new Teacher("jack",6);
        Person student = new Student("doe",6);

        mathClass.takeAttendance(teacher);
        mathClass.takeAttendance(student);
        italianClass.takeAttendance(teacher);
        italianClass.takeAttendance(student);

        mathClass.getAttendance();
        italianClass.getAttendance();
    }
}