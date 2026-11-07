package builder_pattern;

public class Student {
    private String name;
    private int age;
    private String subject;
    Student(StudentBuilder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.subject = builder.subject;
    }
}
