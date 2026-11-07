package builder_pattern;

public class PhysicsStudent extends StudentBuilder {
    @Override
    public StudentBuilder setSubject(String subject) {
        this.subject = subject;
        return this;
    }
}
