package builder_pattern;

public class Director {
    private StudentBuilder builder;

    public Director(StudentBuilder builder) {
        this.builder = builder;
    }

    public Student constructStudent(String name, int age, String subject) {
        return builder.setName(name)
                      .setAge(age)
                      .setSubject(subject)
                      .build();
    }
}
