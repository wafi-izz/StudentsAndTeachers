
public class Student implements Person{
    private String name;
    private int age;
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public void getAttandenceString() {
        System.out.println("\tStudent Name: " + name + "\n\tAge: " + age);
    }
}
