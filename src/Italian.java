import java.util.ArrayList;

public class Italian implements Class {
    ArrayList<Person> attendanceList;
    public Italian() {
        attendanceList = new ArrayList();
    }
    @Override
    public void takeAttendance(Person person) {
        attendanceList.add(person);
    }
    @Override
    public void getAttendance() {
        System.out.println("italian attendance: ");
        for (Person person : attendanceList) {
            person.getAttandenceString();
        }
        System.out.println();
    }
}
