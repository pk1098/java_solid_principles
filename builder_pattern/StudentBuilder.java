package builder_pattern;

public abstract class StudentBuilder {
    String name;
    int age;
    String subject;

    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public StudentBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public abstract StudentBuilder setSubject(String subject);

    public Student build() {
        return new Student(this);
    }
}
