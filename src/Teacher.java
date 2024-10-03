
public class Teacher implements Person {
    private String name;
    private int rank;
    public Teacher(String name, int rank) {
        this.name = name;
        this.rank = rank;
    }
    @Override
    public void getAttandenceString() {
        System.out.println("\tTeacher Name: " + name + "\n\tRank: " + rank);
    }
}
