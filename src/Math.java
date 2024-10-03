import java.util.ArrayList;

public class Math implements Class {
    ArrayList<Person> attendanceList;
    public Math() {
        attendanceList = new ArrayList();
    }
    @Override
    public void takeAttendance(Person person) {
        attendanceList.add(person);
    }
    @Override
    public void getAttendance() {
        System.out.println("math attendance: ");
        for (Person person : attendanceList) {
            person.getAttandenceString();
        }
        System.out.println();
    }
}